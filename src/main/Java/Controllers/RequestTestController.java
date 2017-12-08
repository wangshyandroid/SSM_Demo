package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangshy on 17/11/27.
 */
@RestController
public class RequestTestController {
    @GetMapping
    @RequestMapping("/api/RequestTest")
    public String TestString() {
        return "RequestTest测试！";
    }


    @GetMapping
    @RequestMapping("/api/RequestTest1")
    public String TestString1() {
        return "RequestTest测试1！";
    }

    @GetMapping
    @RequestMapping("/api/RequestTest2")
    public String TestString2() {
        return "RequestTest测试2！";
    }
}
