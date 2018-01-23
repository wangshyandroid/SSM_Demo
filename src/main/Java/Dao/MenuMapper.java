package Dao;

import Entity.LabellingBean;
import Entity.MenuBean;
import Entity.MenuConfigBean;
import Entity.StepsBeana;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangshy on 17/12/1.
 */
@Repository
public interface MenuMapper {
    List<MenuBean> getMenuBean(@Param("page") int page, @Param("rn") int rn);

    List<MenuBean> getMenuBeanList();

    int insertMenu(MenuBean bean);

    int inserSteps(@Param("lists") List<StepsBeana> beanList);

    List<MenuBean> findMenuyByMenuTitle(String menuTitle);

    MenuBean findMenuyByMenuId(@Param("id") int id);

    int inserMenuConfig(@Param("config") MenuConfigBean config);

    HashMap<String, Integer> findLabellingList();

    int insertLabelling(@Param("l") LabellingBean bean);
}
