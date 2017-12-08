package Service;

import Entity.MenuBean;
import Entity.StepsBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wangshy on 17/12/1.
 */
public interface IMenuService {
    List<MenuBean> getMenuBean();


    List<MenuBean> getMenuBeanList();

    List<MenuBean> getMenuByMenuNane(String menuTitle);

    int insertMenu(MenuBean bean);

    int inserSteps(List<StepsBean> beanList);

}
