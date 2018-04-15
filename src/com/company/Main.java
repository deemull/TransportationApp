package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! ");

        LList n1 = new LList();
        LList n2 = new LList(10, n1.next);
        LList n3 = new LList(20);
        System.out.println(n1);
        n1.count(n1.next);

    }
}
