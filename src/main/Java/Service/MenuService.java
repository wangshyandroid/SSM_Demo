package Service;

import Dao.MenuMapper;
import Entity.LabellingBean;
import Entity.MenuConfigBean;
import Entity.MenuBean;
import Entity.StepsBeana;
import bean.DataMenuBean;
import bean.Utils;
import com.alibaba.fastjson.JSONObject;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangshy on 17/12/1.
 */
@Service
public class MenuService implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuBean> getMenuBean(int page, int rn) {
        return menuMapper.getMenuBean((page - 1) * rn, rn);
    }

    @Override
    public List<MenuBean> getMenuBeanList() {
        return menuMapper.getMenuBeanList();
    }

    @Override
    public List<MenuBean> getMenuByMenuNane(String menuTitle) {
        return menuMapper.findMenuyByMenuTitle(menuTitle);
    }

    @Override
    public int insertMenu(String name, int page, int rn) {
        DataMenuBean beans = getRequest1(name, page, rn);
        if (null != beans) {
            return insertMenus(beans, rn);
        } else {
            return 0;
        }
    }

    @Override
    public int insertMenu(int page, int l_id, int rn) {
        DataMenuBean beans = getRequest2(l_id, page, rn);
        if (null != beans) {
            return 0;
//            return insertMenus(beans, l_id, rn);
        } else {
            return 0;
        }
    }

    private int insertMenus(DataMenuBean beans, int rn) {
        if (beans.getError_code() == 0) {
            System.out.println(beans.getResult().getTotalNum());
            for (MenuBean b : beans.getResult().getData()) {
                MenuBean be = menuMapper.findMenuyByMenuId(b.getId());
                if (be == null) {
                    b.setAlbum(b.getAlbums().get(0));
                    int a = menuMapper.insertMenu(b);
                    if (a > 0) {
                        for (StepsBeana bean : b.getSteps()) {
                            bean.setMenu_id(b.getId());
                        }
                        menuMapper.inserSteps(b.getSteps());
                    }
                }
            }
            if (beans.getResult().getData().size() < rn) {
                return 3;
            } else
                return 1;
        } else if (beans.getError_code() == 204605 || beans.getError_code() == 204602 || beans.getError_code() == 204604) {
            System.out.println(beans.getError_code() + ":" + beans.getReason());
            return 3;
        } else {
            return 2;
        }
    }

    private void insertMenuConfit(int mid, int lid) {
        if (lid > 0) {
            // 如果存在  那么 将该条数据 加入关联表
            MenuConfigBean labellingBean = new MenuConfigBean();
//            labellingBean.setmId(mid);
            labellingBean.setlId(lid);
            menuMapper.inserMenuConfig(labellingBean);
        }
    }

    @Override
    public int inserSteps(List<StepsBeana> beanList) {
        return menuMapper.inserSteps(beanList);
    }

    @Override
    public String updateMenu(int page, int rn) {
        int index = 0;
        int id = 0;
        try {
            List<MenuBean> menuBeanList = menuMapper.getMenuBean((page - 1) * rn, rn);
            if (menuBeanList != null) {
                if (menuBeanList.size() > 0) {
                    for (MenuBean bean : menuBeanList) {
                        index++;
                        id = bean.getId();
                        String tagStr = "";
//                        String tagStr = bean.getTags();
                        if (!StringUtils.isNullOrEmpty(tagStr)) {
                            System.out.println("-------->>>>>当前菜单ID =" + bean.getId());
                            String[] strings = tagStr.split(";");
                            List<String> strList = Arrays.asList(strings);
                            for (String s : strList) {
                                Integer key = Utils.getKey(s);
                                if (key != 10001) {
                                    insertMenuConfit(bean.getId(), key);
                                }
//                            else {
//                                LabellingBean bean1 = new LabellingBean();
//                                bean1.setName(s);
//                                bean1.setcId(10029);
//                                if (menuMapper.insertLabelling(bean1) > 0) {
//                                    Utils.setMap(s, bean1.getId());
//                                    insertMenuConfit(bean.getId(), bean1.getId());
//                                } else {
//                                    System.out.println("向labelling表中插入数据" + s + "失败,当前ID= " + id);
//                                }
//                            }
                            }
                        } else {
                            System.out.println("----->>>ID为" + id + "的数据没有标签");
                        }
                    }
                    return "A";
                } else {
                    return "查询数据为空";
                }
            }
        } catch (Exception e) {
            System.out.println("异常发生在第：" + page + "页----->>>>>第" + index + "条--------->>>ID=" + id);
            return "异常发生在第：" + page + "页----->>>>>第" + index + "条--------->>>ID=" + id;
        }
        return "A";
    }

    @Override
    public Map<String, Integer> findLabellingList() {
        return menuMapper.findLabellingList();
    }

    //1.菜谱大全
    private DataMenuBean getRequest1(String name, int page, int rn) {
        String result = null;
        String url = "http://apis.juhe.cn/cook/query.php";//请求接口地址
        Map params = new HashMap();//请求参数
        params.put("menu", name);//需要查询的菜谱名
        params.put("pn", (page - 1) * rn);//数据返回起始下标
        params.put("rn", rn);//数据返回条数，最大30
        params.put("albums", "0");//albums字段类型，1字符串，默认数组
        DataMenuBean object = null;
        try {
            result = HttpUtil.net(url, params, "GET");
            object = JSONObject.parseObject(result, DataMenuBean.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return object;
    }


    private DataMenuBean getRequest2(int cid, int page, int rn) {
        String result = null;
        String url = "http://apis.juhe.cn/cook/index";//请求接口地址
        Map params = new HashMap();//请求参数
        params.put("cid", cid);//需要查询的菜谱名
        params.put("pn", (page - 1) * rn);//数据返回起始下标
        params.put("rn", rn);//数据返回条数，最大30
        params.put("albums", "0");//albums字段类型，1字符串，默认数组
        DataMenuBean object = null;
        try {
            result = HttpUtil.net(url, params, "GET");
            object = JSONObject.parseObject(result, DataMenuBean.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return object;
    }


}
