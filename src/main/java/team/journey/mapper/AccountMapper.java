package team.journey.mapper;

import team.journey.pojo.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    // customize

    Account selectByLogin(Account account);

    Account selectByName(Account account);
}