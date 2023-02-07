package com.java.test;

/**
 * @author zhang
 * @className: NetTest
 * @description:
 * @date: 2020-12-08 15:47
 * @since JDK 13
 */
public class NetTest {
    public static void main(String[] args) {
        Server server = new Server();
        Proxy proxy = new Proxy(server);
        proxy.browse();
    }
}

interface NetWork{
    void browse();
}

//被代理
class Server implements NetWork{

    public void browse(){
        System.out.println("服务器正在运行");
    }
}

//代理
class Proxy implements NetWork{

    private NetWork work;

    public void browse(){
        work.browse();
    }

    public Proxy(NetWork work){
        this.work = work;
    }
}