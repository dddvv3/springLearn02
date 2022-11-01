package org.example.service;

import org.example.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
            @Qualifier("accountDao")
    AccountDao accountDao;

    @Override
    @Transactional
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out,money);
        int a = 1/0;
        accountDao.inMoney(in,money);
    }
}
