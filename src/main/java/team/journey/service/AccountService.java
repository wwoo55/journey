package team.journey.service;

import team.journey.pojo.Account;

public interface AccountService {

    Account findByLogin(Account account);

    Boolean registerAccount(Account account);
}
