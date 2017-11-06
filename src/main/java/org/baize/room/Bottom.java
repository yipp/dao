package org.baize.room;

import org.baize.dao.model.CorePlayer;
import org.baize.dao.model.Weath;

import java.util.concurrent.ConcurrentMap;

/**
 * 作者： 白泽
 * 时间： 2017/11/6.
 * 描述：
 */
public class Bottom {
    private int id;
    private ConcurrentMap<CorePlayer,Integer> map;
    private int allNum;

    public Bottom(int id, ConcurrentMap<CorePlayer, Integer> corePlayer, int allNum) {
        this.id = id;
        this.map = corePlayer;
        this.allNum = allNum;
    }

    public Bottom() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ConcurrentMap<CorePlayer, Integer> getMap() {
        return map;
    }

    public void setMap(ConcurrentMap<CorePlayer, Integer> map) {
        this.map = map;
    }

    public int getAllNum() {
        return allNum;
    }

    public void setAllNum(int allNum) {
        this.allNum = allNum;
    }
    public void addAllNum(int num){
        allNum += num;
    }
    public void addCorePlayerBottom(int num,CorePlayer corePlayer){
        addAllNum(num);
        if(map.containsKey(corePlayer)){
            int money = map.get(corePlayer);
            num += money;
        }
        map.put(corePlayer,num);
        Weath weath = corePlayer.entity().getWeath();
        //减少金币
        weath.update();
    }
}
