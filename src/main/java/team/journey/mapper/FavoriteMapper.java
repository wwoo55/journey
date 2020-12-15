package team.journey.mapper;

import team.journey.pojo.Favorite;
import team.journey.pojo.FavoriteKey;

import java.util.List;

public interface FavoriteMapper {
    int deleteByPrimaryKey(FavoriteKey key);

    int insert(Favorite record);

    int insertSelective(Favorite record);

    Favorite selectByPrimaryKey(FavoriteKey key);

    int updateByPrimaryKeySelective(Favorite record);

    int updateByPrimaryKey(Favorite record);

    Integer selectCount(Integer aid);

    List<Favorite> selectData(Integer start, Integer limit, Integer aid);
}