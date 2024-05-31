package com.zhaopq;
import java.util.Scanner;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello git1");
        System.out.println("hello git2");
        System.out.println("hello git3");
        System.out.println("hello git4");
        System.out.println("hot  fix test");
        System.out.println("master test");
        String correctUsername = "user123";
        String correctPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名:");
        String inputUsername = scanner.nextLine();

        System.out.println("请输入密码:");
        String inputPassword = scanner.nextLine();

        if (correctUsername.equals(inputUsername) && correctPassword.equals(inputPassword)) {
            System.out.println("登录成功!");
        } else {
            System.out.println("登录失败，用户名或密码错误!");
        }
        scanner.close();
    }
}