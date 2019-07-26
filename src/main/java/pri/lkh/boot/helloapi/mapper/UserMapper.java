package pri.lkh.boot.helloapi.mapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pri.lkh.boot.helloapi.model.User;

import java.util.List;

@Repository
public class UserMapper {

    private static String NAME_SPACE = "pri.lkh.boot.helloapi.mapper.UserMapper.";

    @Autowired
    private SqlSession sqlSession;

    public List<User> selectAllUsers() {

        return sqlSession.selectList(NAME_SPACE + "selectAllUsers");
//		List<User> userList = new ArrayList<>();
//		userList.add(new User(1,  "kim", 30));
//		userList.add(new User(2,  "Lee", 30));
//		userList.add(new User(3,  "park", 30));
//		userList.add(new User(4,  "chio", 30));
//		userList.add(new User(5,  "won", 30));
//
//		return userList;

    }

    public  User selectUserByKey(Integer userid) {
        // DB연동 코드가 실제로 포함됨
        // DB연동 라이브러리는 MyBatis 사용

        return sqlSession.selectOne(NAME_SPACE + "selectUserByKey", userid);
    }

    public User insertUser(User user) {

        sqlSession.update(NAME_SPACE + "insertUser", user);
        return user;
    }

    public User updateUser(User user) {
        return user;
    }

    public boolean deleteUser(Integer userid) {
        int updated =  sqlSession.delete(NAME_SPACE + "deleteUser", userid);
        return updated > 0 ? true : false;
    }
}
