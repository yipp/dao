package org.baize.dao.model;

/**
 * 作者： 白泽
 * 时间： 2017/11/6.
 * 描述：
 */
public class PersistPlayer {
    private int id;
    private PlayerInfo playerInfo;
    private Weath weath;
    private Shop shop;

    public PersistPlayer() {
    }

    public PersistPlayer(int id, PlayerInfo playerInfo, Weath weath, Shop shop) {
        this.id = id;
        this.playerInfo = playerInfo;
        this.weath = weath;
        this.shop = shop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }

    public Weath getWeath() {
        return weath;
    }

    public void setWeath(Weath weath) {
        this.weath = weath;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
