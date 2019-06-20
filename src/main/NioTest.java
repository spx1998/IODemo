package main;

import client.NioClient;
import server.NioServer;

import java.util.Scanner;

public class NioTest {
    public static void main(String[] args) throws Exception {
        NioServer.start();
        Thread.sleep(100);
        NioClient.start();
        System.out.println(Thread.activeCount());
        while (NioClient.sendMsg(new Scanner(System.in).nextLine()));
    }
}
