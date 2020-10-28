package com.payn.cloud.service.impl;

import com.payn.cloud.dao.AccountDao;
import com.payn.cloud.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {

        accountDao.decrease(userId, money);
    }
}
