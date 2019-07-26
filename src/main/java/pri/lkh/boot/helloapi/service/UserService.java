package pri.lkh.boot.helloapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.lkh.boot.helloapi.mapper.UserMapper;
import pri.lkh.boot.helloapi.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.selectAllUsers();
    }
}
