package org.joker.springboot.mybatisdemo.entity;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-10-09 13:43
 */
public class User {
    private int id;
    private String name;
    private int age;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

