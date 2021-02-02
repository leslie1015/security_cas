package pers.leslie.security.cas.securitycas.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: YongWang
 * @date: 2021/2/2 09:10
 * @description:
 */

@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index页面";
    }

    @RequestMapping("/test")
    public String test() {
        return "test页面";
    }

    @RequestMapping("/login")
    public String login() {
        return "login页面";
    }

}
