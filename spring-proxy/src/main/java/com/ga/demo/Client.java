package com.ga.demo;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName Client.java
 * @Description TODO
 * @createTime 2020年09月20日 16:23:00
 */
public class Client {

    public static void main(String[] args) {
        Host host = new Host();

        Proxy proxy = new Proxy(host);

        proxy.rent();

    }
}
