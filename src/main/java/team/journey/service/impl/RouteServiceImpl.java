package team.journey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.journey.mapper.RouteMapper;
import team.journey.pojo.Page;
import team.journey.pojo.Route;
import team.journey.pojo.RouteQueryVo;
import team.journey.service.RouteService;

import java.util.List;

/**
 * @projectName: journey
 * @className: RouteServiceImpl
 * @description:
 * @author: xy
 * @time: 2020/12/12 14:22
 */
@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteMapper mapper;

    @Override
    public Page<Route>  findList(RouteQueryVo rqv) {
        // 数据处理
        if ("".equals(rqv.getTitle())||"null".equals(rqv.getTitle())) {
            rqv.setTitle(null);
        }
        if (null == rqv.getCurrentPage()) {
            rqv.setCurrentPage(1);
        }
        if (null == rqv.getPageSize()) {
            rqv.setPageSize(3);
        }

        String title = rqv.getTitle();
        Integer currentPage = rqv.getCurrentPage();
        Integer pageSize = rqv.getPageSize();
        rqv.setStart(pageSize*(currentPage-1));
        // 1.totalCount
        int totalCount = mapper.selectCountByVo(rqv);
        // 2.totalPage
        Integer totalPage = (totalCount%pageSize)==0?(totalCount/pageSize):((totalCount/pageSize)+1);
        // 3.dataList
        List<Route> dataList = mapper.selectByVo(rqv);

        // 封装到Page
        Page<Route> page = new Page<>();
        page.setTotalCount(totalCount);
        page.setTotalPage(totalPage);
        page.setCurrentPage(currentPage);
        page.setPageSize(pageSize);
        page.setDataList(dataList);

        return page;
    }
}
