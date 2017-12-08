package Dao;

import Entity.MenuBean;
import Entity.StepsBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangshy on 17/12/1.
 */
@Repository
public interface MenuMapper {
    List<MenuBean> getMenuBean();

    List<MenuBean> getMenuBeanList();

    int insertMenu(MenuBean bean);

    int inserSteps(@Param("lists") List<StepsBean> beanList);

    List<MenuBean> findMenuyByMenuTitle(String menuTitle);
}
