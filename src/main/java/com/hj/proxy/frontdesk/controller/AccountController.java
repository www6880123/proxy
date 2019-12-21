package com.hj.proxy.frontdesk.controller;

import com.hj.proxy.frontdesk.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/login")
    public ModelAndView login(@PathVariable("username") String username,@PathVariable("password") String password){
        ModelAndView modelAndView = new ModelAndView();
        accountService.loginAccount(username,password);
        return modelAndView;
    }

}
