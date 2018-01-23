package Controllers;

import Entity.StepsBeana;
import Service.IMenuService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangshy on 17/12/1.
 */
@RestController
@RequestMapping("/api")
public class MenuController {
    @Autowired
    private IMenuService service;

    @PostMapping
    @RequestMapping("/getMenuBean")
    public String getMenuBean(int page, int rn) {
        return JSON.toJSONString(service.getMenuBean(page, rn));
    }

    @PostMapping
    @RequestMapping("/getMenuBean1")
    public String getMenuBean1() {

        Map<String, Object> stringMap = new HashMap<String, Object>();
        stringMap.put("data", service.getMenuBeanList());
        stringMap.put("error", "10001");
        stringMap.put("code", "200");
        stringMap.put("errorCode", true);
        stringMap.put("message", "请求成功！");
        return JSON.toJSONString(stringMap);
    }

    @PostMapping
    @RequestMapping("updateMenu")
    public String updateMenu(int page, int rn) {
        int pages = page;
        String str = "A";
        while ("A".equals(str)) {
            str = service.updateMenu(pages, rn);
            pages++;
            System.out.println("----->>>" + pages);
            if (pages == 400) {
                System.out.println("请求到第200页了");
                str = "写入成功";
                return "请求到第200页了";
            }
        }
        return str;
    }

    @PostMapping
    @RequestMapping("/getMenuBean2")
    public String getMenuBean2() {
        return JSON.toJSONString("getMenuBean2");
    }

    @RequestMapping("/insertMenuBean")
    @PostMapping
    public Object setMenuBean(String bean, int page, int rn) {
        int pages = page;
        int a = 1;
        StringBuffer msg = new StringBuffer();
        while (a > 0) {
            a = service.insertMenu(bean, pages, rn);
            if (a == 2) {
            } else if (a == 1) {
                pages++;
//                msg.append("---->>>>写入完成,继续查询当前页为" + pages + "---->>>>\n");
                System.out.println(msg);
            } else if (a == 3) {
                a = 0;
                msg.append("---->>>>写入完成,当前查询的条数大于或等于总条数 当前页为" + pages + "---->>>>\n");
            } else {
                msg.append("---->>>>当前页为" + pages + "---->>>>\n");
            }
            System.out.println(msg.toString());
        }
        return JSON.toJSONString("---当前状态为:" + msg + "-------" + pages + "------->>>l_id = " + bean);
    }

    @RequestMapping("/insertCidMenuBean")
    @PostMapping
    public Object insertCidMenuBean(int page, int l_id, int rn) {
//        int pages = page;
//        int a = 1;
        StringBuffer msg = new StringBuffer();
//        while (a > 0) {
//            a = service.insertMenu(pages, l_id, rn);
//            if (a == 2) {
//            } else if (a == 1) {
//                pages++;
//                msg.append("---->>>>写入完成,继续查询当前页为" + pages+"---->>>>\n");
//                System.out.println(msg);
//            } else if (a == 3) {
//                a = 0;
//                msg.append("---->>>>写入完成,当前查询的条数大于或等于总条数 当前页为" + pages+"---->>>>\n");
//            } else {
//                msg.append("---->>>>当前页为" + pages+"---->>>>\n");
//            }
//            System.out.println(msg.toString());
//        }
        return JSON.toJSONString("---当前状态为:" + msg + "------->>>l_id = " + l_id);
    }

    @RequestMapping("/setStepsBean")
    @PostMapping
    public String setStepsBean() {
        List<StepsBeana> beanList = new ArrayList<StepsBeana>();
        for (int i = 0; i < 11; i++) {
            StepsBeana bean = new StepsBeana();
            bean.setImg("img" + i);
            bean.setStep("step" + i);
            bean.setMenu_id(46);
            beanList.add(bean);
        }

        return "stepsBean = " + service.inserSteps(beanList);
    }

    @PostMapping
    @RequestMapping("/getMenuByMenuTitle")
    public String findMenuyByMenuTitle(String menuTitle) {

        return "";
    }

    @RequestMapping("findMenuConfigList")
    @PostMapping()
    public Object findMenuConfigList() {
        return JSON.toJSONString(service.findLabellingList());
    }

}
