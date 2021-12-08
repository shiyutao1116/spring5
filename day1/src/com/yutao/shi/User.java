package com.yutao.shi;

/**
 * @author shiyutao
 * @create 2021-11-01 22:12
 */
public class User {
    private String name;
    private Integer id;
    public void add(){
        System.out.println("add");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public User() {
    }
}
