package team.journey.service;

import team.journey.pojo.Page;
import team.journey.pojo.Route;
import team.journey.pojo.RouteQueryVo;

public interface RouteService {
    Page<Route> findList(RouteQueryVo rqv);
}
