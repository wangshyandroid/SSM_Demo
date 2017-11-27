package Controllers;


import Entity.User;
import Service.IUserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        List<User> userList = iUserService.findUserName("张三");
        return JSON.toJSONString(userList);
    }
}
