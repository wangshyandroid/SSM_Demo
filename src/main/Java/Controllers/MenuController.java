package Controllers;

import Entity.MenuBean;
import Entity.StepsBean;
import Service.IMenuService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String getMenuBean() {
        return JSON.toJSONString(service.getMenuBean());
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
    @RequestMapping("/getMenuBean2")
    public String getMenuBean2() {
        return JSON.toJSONString(service.getMenuBean() + "getMenuBean2");
    }

    @RequestMapping("/setMenuBean")
    @PostMapping
    public String setMenuBean(@RequestBody MenuBean bean) {
        MenuBean beans = new MenuBean();
        beans.setId(46);
        beans.setAlbums("Albums");
        beans.setBurden("burden");
        beans.setImtro("imtro");
        beans.setTags("tags");
        beans.setTitle("title");
        beans.setIngredients("ingredients");

//        int a = service.insertMenu(beans);
        return "a";
    }

    @RequestMapping("/setStepsBean")
    @PostMapping
    public String setStepsBean() {
        List<StepsBean> beanList = new ArrayList<StepsBean>();
        for (int i = 0; i < 11; i++) {
            StepsBean bean = new StepsBean();
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
}
