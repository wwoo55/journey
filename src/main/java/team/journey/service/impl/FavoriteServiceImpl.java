package team.journey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.journey.mapper.FavoriteMapper;
import team.journey.mapper.RouteMapper;
import team.journey.pojo.Favorite;
import team.journey.pojo.FavoriteKey;
import team.journey.pojo.PageForFront;
import team.journey.pojo.Route;
import team.journey.service.FavoriteService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @projectName: journey
 * @className: FavoriteServiceImpl
 * @description:
 * @author: xy
 * @time: 2020/12/13 9:42
 */
@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteMapper mapper;

    @Override
    public boolean addFavorite(Favorite favorite) {
        favorite.setDate(new Date());
        int i = 0;
        try {
            i = mapper.insert(favorite);
        } catch (Exception e) {
            // 收藏失败
        }
        return i == 1;
    }

    @Override
    public PageForFront<Favorite> find(Integer page, Integer limit, Integer aid) {
        // 数据处理
        if (page==null){
            page = 1;
        }
        if (limit==null){
            limit = 5;
        }
        PageForFront<Favorite> forFront = new PageForFront<>();
        forFront.setCode(0);
        forFront.setMsg("");
        Integer count = mapper.selectCount(aid);
        forFront.setCount(count);
        Integer start = (page-1)*limit;
        List<Favorite> data = mapper.selectData(start,limit,aid);
        for (Favorite favorite : data) {
            // Sun Dec 13 00:00:00 CST 2020 --> 2020-12-13
            favorite.setStrDate(new SimpleDateFormat("yyyy-MM-dd").format(favorite.getDate()));
        }
        forFront.setData(data);

        return forFront;
    }

    @Override
    public boolean delete(FavoriteKey key) {
        int i = mapper.deleteByPrimaryKey(key);
        return i==1;
    }

}
