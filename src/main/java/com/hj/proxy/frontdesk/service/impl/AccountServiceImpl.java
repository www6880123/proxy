package com.hj.proxy.frontdesk.service.impl;

import com.hj.proxy.frontdesk.dao.AccountDao;
import com.hj.proxy.frontdesk.entity.Account;
import com.hj.proxy.frontdesk.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account loginAccount(String username, String password) {
            return accountDao.loginAccount(username,password);
        }
    }
