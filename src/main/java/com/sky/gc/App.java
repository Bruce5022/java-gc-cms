package com.sky.gc;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int size = 1024*1024;

        byte[] myAlloc1 = new byte[4*size];
        // 第一次在新生代中申请了4M的内存，并没有执行GC操作，因为我们新生代Eden空间的大小是8M，完全能容纳下
        System.out.println("111111");

        // 接着再申请4M的大小，此时就发生了GC，很明显新生代已经容纳不下了
        byte[] myAlloc2 = new byte[4*size];
        System.out.println("222222");

        byte[] myAlloc3 = new byte[2*size];
        System.out.println("3333333");

        byte[] myAlloc4 = new byte[4*size];
        System.out.println("4444444");
    }
}
