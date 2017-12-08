package Controllers;

import Entity.MsgInfo;
import Service.IDownPlatFormMsgServcie;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangshy on 17/12/6.
 */
@RestController
@RequestMapping("/api")
public class DownPlatFormMsgController {

    @Autowired
    private IDownPlatFormMsgServcie servcie;

    @RequestMapping("/findDownPlatformMsgList")
    public String findDownPlatformMsgList(MsgInfo info) {

        return JSON.toJSONString(servcie.findDownPlatformMsgList(info));
    }
}
