package pri.lkh.boot.helloapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pri.lkh.boot.helloapi.service.SecurityService;

@Controller
public class SampleController {

    @Autowired
    SecurityService securityService;

    @GetMapping("/greet")
    @ResponseBody
    public String hello() {
        return "hello world";

    }

    @GetMapping("/token/test")
    public String forTokenTest(@RequestParam String token) {

        String userid = securityService.parseToken(token);

        return userid;
    }
}
