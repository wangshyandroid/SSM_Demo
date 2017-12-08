package Service;

import Dao.MenuMapper;
import Entity.MenuBean;
import Entity.StepsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangshy on 17/12/1.
 */
@Service
public class MenuService implements IMenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuBean> getMenuBean() {
        return menuMapper.getMenuBean();
    }

    @Override
    public List<MenuBean> getMenuBeanList() {
        return menuMapper.getMenuBeanList();
    }

    @Override
    public List<MenuBean> getMenuByMenuNane(String menuTitle) {
        return menuMapper.findMenuyByMenuTitle(menuTitle);
    }

    @Override
    public int insertMenu(MenuBean bean) {
        return menuMapper.insertMenu(bean);
    }

    @Override
    public int inserSteps(List<StepsBean> beanList) {
        return menuMapper.inserSteps(beanList);
    }
}
