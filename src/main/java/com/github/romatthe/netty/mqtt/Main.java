package com.github.romatthe.netty.mqtt;

import com.github.romatthe.netty.mqtt.server.EchoServer;

public class Main {
    public static void main(String[] args) throws Exception {
        new EchoServer(1883).start();
    }
}
