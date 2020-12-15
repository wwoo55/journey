package team.journey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.journey.mapper.AccountMapper;
import team.journey.pojo.Account;
import team.journey.service.AccountService;

/**
 * @projectName: journey
 * @className: AccountServiceImpl
 * @description:
 * @author: xy
 * @time: 2020/12/11 5:29
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper mapper;
    @Override
    public Account findByLogin(Account account) {
        return mapper.selectByLogin(account);
    }

    @Override
    public Boolean registerAccount(Account account) {
        // 1.检测用户名是否已存在
        Account ac = mapper.selectByName(account);
        if (ac!=null){
            return false;
        }
        // 2.注册
        int i = mapper.insertSelective(account);
        return i == 1;
    }
}
