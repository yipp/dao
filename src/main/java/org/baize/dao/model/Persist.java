package org.baize.dao.model;

import com.alibaba.fastjson.JSON;
import org.baize.dao.sqlmapper.PlayerMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者： 白泽
 * 时间： 2017/11/6.
 * 描述：
 */
public abstract class Persist {
    private transient int id;
    //private PlayerMapper mapper;

    public Persist() {
        //mapper = springutils.getbean(playermapper.class)
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void update(PlayerMapper mapper){
        if(this == null)
            return;
        if(!(this instanceof Persist))
            return;
        String str = JSON.toJSONString(this);
        String sql = "'"+str+"'";
        Map<String,String> map = new HashMap<>();
        map.put("k",this.getClass().getSimpleName());
        map.put("v",sql);
        map.put("id",id+"");
        mapper.updateField(map);
    }
}
