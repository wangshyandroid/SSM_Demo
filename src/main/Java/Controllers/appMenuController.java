package Controllers;

import Entity.AppMenuBean;
import Entity.RequestBean;
import Service.IAppMenuService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
@RequestMapping("/app")
@RestController
public class appMenuController {

    @Autowired
    private IAppMenuService service;


    @RequestMapping("/findMenuList")
    @PostMapping
    public String findMenuList(RequestBean bean) {
        List<AppMenuBean> beanList = service.findMenuList(bean);
        Map<String, Object> objectMap = new HashMap<String, Object>();
        objectMap.put("flag", true);
        objectMap.put("errorCode", 10000);
        objectMap.put("data", beanList);
        return JSON.toJSONString(objectMap);
    }
}
