package pri.lkh.boot.helloapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pri.lkh.boot.helloapi.service.SecurityService;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SecurityController {

    @Autowired
    SecurityService securityService;

    @GetMapping("/auth/token")
    public Map<String, Object> generateTokenWithUserid(@RequestParam String userid) {

        String token = securityService.generateToken(userid);

        Map<String, Object> result = new HashMap<>();
        result.put("token", token);

        return result;
    }

}
