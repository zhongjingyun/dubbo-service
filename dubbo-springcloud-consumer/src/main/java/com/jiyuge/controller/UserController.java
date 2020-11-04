package com.jiyuge.controller;

import com.jiyuge.AccountService;
import com.jiyuge.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhongjingyun
 * @Date 2020/11/2 下午8:52
 **/
@RestController
public class UserController {
    @DubboReference
    private UserService userService;
    @DubboReference
    private AccountService accountService;

    @GetMapping("/user/{id}")
    public String user(@PathVariable() Integer id) {
        return userService.getName(id);
    }

    @GetMapping("/balance/{id}")
    public String balance(@PathVariable() Integer id) {
        return accountService.getBalance(id);
    }
}
