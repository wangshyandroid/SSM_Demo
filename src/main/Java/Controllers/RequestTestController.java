package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangshy on 17/11/27.
 */
@RestController
@RequestMapping("/api/RequestTest")
public class RequestTestController {
    @GetMapping
    public String TestString() {
        return "RequestTest测试！";
    }
}
