package Dao;

import Entity.AppMenuBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PackageName:
 * @FileName:
 * @Description:
 * @Author: wangshy
 * @company: 上海势航网络科技有限公司
 * @Date 17/12/22
 */
@Repository
public interface IAppMenuMapper {

    List<AppMenuBean> findMenuList(@Param("page") int page);
}
