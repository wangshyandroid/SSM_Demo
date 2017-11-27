package Service;

import Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangshy on 17/11/27.
 */
public interface IUserService {
    User findUserById(Integer id);

    List<User> findUserName(String user_name);

    Integer insertUser(User user);
}
