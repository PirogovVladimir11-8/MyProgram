package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        boolean a;
        int b, c, d, e;
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        a = ((b % 2 == 0) && (c % 2 == 0)) || ((d % 2 == 0) && (c % 2 == 0)) || ((d % 2 == 0) && (b % 2 == 0));
        out.println(a);
        out.println("Hello world");
    }}