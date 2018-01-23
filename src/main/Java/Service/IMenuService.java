package Service;

import Entity.MenuBean;
import Entity.StepsBeana;

import java.util.List;
import java.util.Map;

/**
 * Created by wangshy on 17/12/1.
 */
public interface IMenuService {
    List<MenuBean> getMenuBean(int page, int rn);


    List<MenuBean> getMenuBeanList();

    List<MenuBean> getMenuByMenuNane(String menuTitle);

    int insertMenu(String bean, int page, int rn);

    int insertMenu(int page, int l_id, int rn);

    int inserSteps(List<StepsBeana> beanList);

    String updateMenu(int page, int rn);

    Map<String, Integer> findLabellingList();
}
