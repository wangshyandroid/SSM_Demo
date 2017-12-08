package Service;

import Dao.DownPlatFormMsgMapper;
import Entity.DownPlatFormMsgInfo;
import Entity.MsgInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by wangshy on 17/12/6.
 */
@Service
public class DownPlatFormMsgServcie implements IDownPlatFormMsgServcie {
    @Autowired
    private DownPlatFormMsgMapper msgMapper;

    @Override
    public List<DownPlatFormMsgInfo> findDownPlatformMsgList(MsgInfo M) {

        return msgMapper.findDownPlatformMsgList(M);
    }
}
