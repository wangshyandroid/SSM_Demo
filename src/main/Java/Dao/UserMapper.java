package Dao;

import Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangshy on 17/3/19.
 */
@Repository
public interface UserMapper {
    User findUserById(Integer id);

    List<User> findUserName(String user_name);

    Integer insertUser(User user);
}
