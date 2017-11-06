package org.baize.dao.model;

import com.alibaba.fastjson.JSON;

/**
 * 作者： 白泽
 * 时间： 2017/11/6.
 * 描述：
 */
public class Shop extends Persist {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
