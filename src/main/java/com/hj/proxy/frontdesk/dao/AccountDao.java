package com.hj.proxy.frontdesk.dao;

import com.hj.proxy.frontdesk.entity.Account;
import org.springframework.web.bind.annotation.PathVariable;

public interface AccountDao {

    Account loginAccount(@PathVariable String username, @PathVariable String password);
}
