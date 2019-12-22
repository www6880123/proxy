package com.hj.proxy.frontdesk.service;

import com.hj.proxy.frontdesk.entity.Account;
import org.springframework.stereotype.Service;


public interface AccountService {
    Account loginAccount(String username,String password);
}
