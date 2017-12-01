package Controllers;


import Entity.User;
import Service.IUserService;
import com.alibaba.fastjson.JSON;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangshy on 17/11/27.
 */
@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping
    @RequestMapping("/api/User")
    public String Get() {
        Map<String, Object> stringMap = new HashMap<String, Object>();
        stringMap.put("data", iUserService.findUserName("加"));
        stringMap.put("error", "10001");
        stringMap.put("code", "200");
        stringMap.put("errorCode", true);
        stringMap.put("message", "请求成功！");
        return JSON.toJSONString(stringMap);
    }

    @PostMapping
    @RequestMapping("/api/UserName")
    public String findUserByNane() {
        Map<String, Object> stringMap = new HashMap<String, Object>();
        stringMap.put("data", iUserService.findUserById(4));
        stringMap.put("error", "10001");
        stringMap.put("code", "200");
        stringMap.put("errorCode", true);
        stringMap.put("message", "请求成功！");
        return JSON.toJSONString(stringMap);
    }


}
