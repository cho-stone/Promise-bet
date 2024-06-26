package com.PACOsoft.promise_betting.obj;

import java.io.Serializable;

public class PromisePlayer {
    private boolean arrival = false;//도착여부
    private int bettingMoney = 0;//베팅 금액
    private String nickName = "";//방에 있는 사람 닉네임
    private String playerUID = "";//방에 있는 사람 아이디
    private int ranking = 0; //이 사람의 랭킹
    private double x = 0.0;//현재 이 사람이 위치한 x
    private double y = 0.0;//현재 이 사람이 위치한 y
    private int voteState = 0;//현재 이 사람의 투표 현황 0 : 초기상태, 1 : 찬성, -1 : 반대

    public PromisePlayer() {
    }

    public void setPlayerUID(String playerID) {
        this.playerUID = playerID;
    }

    public String getPlayerUID() {
        return playerUID;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setBettingMoney(int bettingMoney) {
        this.bettingMoney = bettingMoney;
    }

    public int getBettingMoney() {
        return bettingMoney;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getX() {
        return x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getY() {
        return y;
    }

    public void setArrival(boolean arrival) {
        this.arrival = arrival;
    }

    public boolean getArrival() {
        return arrival;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public void setVoteState(int voteState) {
        this.voteState = voteState;
    }

    public int getVoteState() {
        return voteState;
    }
}
