package Dao;

import Entity.DownPlatFormMsgInfo;
import Entity.MsgInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by wangshy on 17/12/6.
 */
@Repository
public interface DownPlatFormMsgMapper {
    List<DownPlatFormMsgInfo> findDownPlatformMsgList(@Param("msgInfo") MsgInfo info);
}
