package team.journey.mapper;

import team.journey.pojo.Seller;

public interface SellerMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Seller record);

    int insertSelective(Seller record);

    Seller selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}