package io.security.basicsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String index(){
        return  "home";
    }
    @GetMapping("/home/main")
    public String loginPage(){
        return "loginPage";
    }



    @GetMapping("/home/bbs")
    public String bbs(){
        return "bbs";
    }


}
