package Service;

import Entity.DownPlatFormMsgInfo;
import Entity.MsgInfo;

import java.util.List;

/**
 * Created by wangshy on 17/12/6.
 */
public interface IDownPlatFormMsgServcie {
    List<DownPlatFormMsgInfo> findDownPlatformMsgList(MsgInfo M);
}
