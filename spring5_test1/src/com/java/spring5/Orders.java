package com.java.spring5;

/**
 * @author zhang
 * @className: Orders
 * @description:
 * @date: 2021-07-12 17:49
 * @since JDK 13
 */
public class Orders {

    private String oname;
    private String oadress;

    public Orders(String oname, String oadress){
        this.oname = oname;
        this.oadress = oadress;
    }

    public void outPut(){
        System.out.println(oname +"::" + oadress);
    }
}