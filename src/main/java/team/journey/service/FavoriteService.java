package team.journey.service;

import team.journey.pojo.Favorite;
import team.journey.pojo.FavoriteKey;
import team.journey.pojo.PageForFront;

import java.util.List;

public interface FavoriteService {

    boolean addFavorite(Favorite favorite);


    PageForFront<Favorite> find(Integer page, Integer limit, Integer aid);

    boolean delete(FavoriteKey key);
}
