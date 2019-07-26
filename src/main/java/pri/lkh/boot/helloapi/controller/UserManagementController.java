package pri.lkh.boot.helloapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pri.lkh.boot.helloapi.model.User;
import pri.lkh.boot.helloapi.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserManagementController {

	 //users [GET] 		    : 사용자 전체보기 	List<User> searchUsers
	 //users/{id} [GET] 	: 사용자 상세보기 	User searchUseByUserid(userid)
	 //users [POST] 	   	: 사용자 등록		User registUser(User)  등록된 내용을 보여줌
	 //users/{id} [PUT]    	: 사용자 수정 		User modifyUser(User)
	 //users/{id} [DELETE] 	: 사용자 삭제 		User removeUser(Userid)

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public Map<String, Object> serarchUsers() {
        List<User> listOfUser = userService.getAllUser();
        Map<String, Object> map = new HashMap<>();
        map.put("data", listOfUser);

        return map;
    }


}
