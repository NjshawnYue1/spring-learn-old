package com.ga.demo;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName Proxy.java
 * @Description TODO
 * @createTime 2020年09月20日 16:22:00
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host){
        this.host = host;
    }

    @Override
    public void rent() {
        see();
        host.rent();
    }

    private void see(){
        System.out.println("看");
    }
}
