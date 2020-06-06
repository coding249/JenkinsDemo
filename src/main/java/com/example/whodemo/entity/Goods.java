package com.example.whodemo.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_goods")
public class Goods implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private int id;
    @Column(name="account")
    private int account;
    @Column(name="password")
    private int password;
    @Column(name="goodname")
    private String goodname;
    @Column(name="goodfrom")
    private String goodfrom;
    @Column(name="introduce")
    private String introduce;
    @Column(name="createtime")
    private String createtime;
    @Column(name="nowprice")
    private double nowprice;
    @Column(name="freeprice")
    private double freeprice;
    @Column(name="number")
    private int number;
    @Column(name="mark")
    private boolean mark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getGoodfrom() {
        return goodfrom;
    }

    public void setGoodfrom(String goodfrom) {
        this.goodfrom = goodfrom;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public double getNowprice() {
        return nowprice;
    }

    public void setNowprice(double nowprice) {
        this.nowprice = nowprice;
    }

    public double getFreeprice() {
        return freeprice;
    }

    public void setFreeprice(double freeprice) {
        this.freeprice = freeprice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }
}
