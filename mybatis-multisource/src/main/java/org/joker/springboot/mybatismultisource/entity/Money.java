package org.joker.springboot.mybatismultisource.entity;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-10-09 19:47
 */
public class Money {
    private int basic;
    private int reward;
    private int punishment;

    @Override
    public String toString() {
        return "Money{" +
                "basic=" + basic +
                ", reward=" + reward +
                ", punishment=" + punishment +
                '}';
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getPunishment() {
        return punishment;
    }

    public void setPunishment(int punishment) {
        this.punishment = punishment;
    }
}

