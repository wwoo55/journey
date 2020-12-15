package team.journey.mapper;

import team.journey.pojo.Page;
import team.journey.pojo.Route;
import team.journey.pojo.RouteQueryVo;

import java.util.List;

public interface RouteMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Route record);

    int insertSelective(Route record);

    Route selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Route record);

    int updateByPrimaryKey(Route record);

    int selectCountByVo(RouteQueryVo rqv);

    List<Route> selectByVo(RouteQueryVo rqv);

    /*Route selectByTitle(String title);*/
}