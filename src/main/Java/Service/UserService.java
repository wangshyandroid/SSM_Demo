package Service;

import Dao.UserMapper;
import Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangshy on 17/11/27.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<User> findUserName(String user_name) {
        return userMapper.findUserName(user_name);
    }

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
