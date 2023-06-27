package dono.daryo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String user(){

        return "/user/userinfo.html";//go to folder static, then user folder and select userinfo.html
    }

}
