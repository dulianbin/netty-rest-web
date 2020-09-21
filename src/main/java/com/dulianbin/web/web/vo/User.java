package com.dulianbin.web.web.vo;

/**
 * 实体类
 *  * @author dulianbin
 *  * @date 2020/08/15
 */
public class User {
    
    private int id;
    
    private String name;
    
    private short age;
    
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public short getAge() {
        return this.age;
    }
    public void setAge(short age) {
        this.age = age;
    }
    
}
