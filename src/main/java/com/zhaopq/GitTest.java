package com.zhaopq;
import java.util.Scanner;
import java.util.Random;

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
        Random random = new Random();
        // 创建Scanner对象用于接收用户输入
        Scanner scanne = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1; // 生成1到100之间的随机数
        int playerGuess = 0;
        int numberOfTries = 0;

        System.out.println("欢迎来到猜数字游戏！");
        System.out.println("我已经想好了一个1到100之间的数字。");

        while (playerGuess != randomNumber) {
            System.out.print("请猜这个数字是多少: ");
            playerGuess = scanne.nextInt(); // 获取玩家的猜测
            numberOfTries++;

            if (playerGuess < randomNumber) {
                System.out.println("太低了！请再试一次。");
            } else if (playerGuess > randomNumber) {
                System.out.println("太高了！请再试一次。");
            } else {
                System.out.println("恭喜你！你在第" + numberOfTries + "次尝试中猜对了数字！");
            }
        }
        scanner.close();
    }
}