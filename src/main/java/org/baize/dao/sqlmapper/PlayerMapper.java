package org.baize.dao.sqlmapper;

import org.baize.dao.PlayerModel;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 作者：---->泡泡大湿<-----
 * 时间：********2017/10/12******
 * 描述：
 */
@Service
public interface PlayerMapper{
    PlayerModel selectOneForId(Integer id);
    String selectOneForAccount(Map<String,String> map);
    String selectAll();
    void insert(PlayerModel model);
    void update(PlayerModel model);
    void delete(Integer id);
    void update();
    void updateField(Map<String,String> map);
}