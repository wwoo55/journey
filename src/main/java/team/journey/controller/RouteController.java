package team.journey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import team.journey.pojo.Page;
import team.journey.pojo.Route;
import team.journey.pojo.RouteQueryVo;
import team.journey.service.RouteService;

/**
 * @projectName: journey
 * @className: RouteController
 * @description:
 * @author: xy
 * @time: 2020/12/12 14:19
 */
@Controller
@RequestMapping("/route")
public class RouteController {
    @Autowired
    private RouteService service;

    @RequestMapping("/findList.do")
    @ResponseBody
    public Page<Route> findList(RouteQueryVo rqv) {
        return service.findList(rqv);
    }
}
