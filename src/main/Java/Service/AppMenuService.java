package Service;

import Dao.IAppMenuMapper;
import Entity.AppMenuBean;
import Entity.RequestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @PackageName:
 * @FileName:
 * @Description:
 * @Author: wangshy
 * @company: 上海势航网络科技有限公司
 * @Date 17/12/22
 */
@Service
public class AppMenuService implements IAppMenuService {

    @Autowired
    private IAppMenuMapper menuMapper;

    @Override
    public List<AppMenuBean> findMenuList(RequestBean bean) {
        List<AppMenuBean> beanList = menuMapper.findMenuList((bean.getPage() - 1) * 10);
        return beanList;
//        if (null != beanList && beanList.size() > 0) {
//            return getResponseEntity(true, 10000, beanList);
//        } else {
//            return getResponseEntity(true, 10001, "暂无数据");
//        }
    }


    private ResponseEntity<Map<String, Object>> getResponseEntity(boolean flag, int errorCode, Object data) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("flag", flag);
        map.put("errorCode", errorCode);
        map.put("data", data);
        return ResponseEntity.ok(map);
    }

    private ResponseEntity<Map<String, Object>> getResponseEntity(boolean flag, int errorCode, String msg) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("flag", flag);
        map.put("errorCode", errorCode);
        map.put("data", msg);
        return ResponseEntity.ok(map);
    }
}
