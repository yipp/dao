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
    PlayerModel selectUser(Integer id);
    String selectUserForAccount(Map<String,String> map);
    String selectAll();
    void addUser(PlayerModel model);
    void updateUser(PlayerModel model);
    void deleteUser(Integer id);
}