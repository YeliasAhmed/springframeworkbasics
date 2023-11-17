package com.springboot.springbootbackendapplication;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter name using nextline: ");
        String name = s.nextLine();
        System.out.println(name);

        System.out.println("Enter name using next: ");
        String name1 = s.next();
        System.out.println(name1);

    }
}
