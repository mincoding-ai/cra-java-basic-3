package Project;

import java.util.Scanner;

public class Project_1_Player {

    static int hp = 100;
    static int attack = 10;

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("Hello World");
        System.out.println("======================");
        System.out.println("======================");

        System.out.print("주인공 체력 입력 : ");
        Scanner sc = new Scanner(System.in);
        hp = sc.nextInt();

        System.out.print("주인공 공격력 입력 : ");
        attack = sc.nextInt();
    }
}
