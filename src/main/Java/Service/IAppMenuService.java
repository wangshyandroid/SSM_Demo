package Service;

import Entity.AppMenuBean;
import Entity.RequestBean;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

/**
 * @PackageName:
 * @FileName:
 * @Description:
 * @Author: wangshy
 * @company: 上海势航网络科技有限公司
 * @Date 17/12/22
 */
public interface IAppMenuService {
    List<AppMenuBean> findMenuList(RequestBean bean);
}
