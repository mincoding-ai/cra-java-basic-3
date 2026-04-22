package Project;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Project_4_Final {
    // Alt + Ins -> Constructor
    static class Inventory {
        int id;
        String name;
        int point;

        public Inventory(int id, String name, int point) {
            this.id = id;
            this.name = name;
            this.point = point;
        }
    }

    static int hp = 100;
    static int attack = 10;

    static int mon_hp = 100;
    static int mon_attack = 10;

    static void print_logo() throws IOException {
        String asciiArt = FigletFont.convertOneLine("SCISSOR PAPER ROCK");
        System.out.println(asciiArt);
    }

    static void gameOption() {
        System.out.print("주인공 체력 입력 : ");
        Scanner sc = new Scanner(System.in);
        hp = sc.nextInt();

        System.out.print("주인공 공격력 입력 : ");
        attack = sc.nextInt();

        System.out.print("몬스터 체력 입력 : ");
        sc = new Scanner(System.in);
        mon_hp = sc.nextInt();

        System.out.print("몬스터 공격력 입력 : ");
        mon_attack = sc.nextInt();
    }

    static void gameStart() {

        while (true) {

            System.out.println("GAME STATE");
            System.out.println("===========");
            System.out.println("User HP : " + hp);
            System.out.println("Mon HP : " + mon_hp);

            if (hp <= 0) {
                System.out.println();
                System.out.println("Game Over");
                System.out.println();
                return;
            }

            if (mon_hp <= 0) {
                System.out.println();
                System.out.println("Win Game");
                System.out.println();
                return;
            }

            System.out.println("가위(0), 바위(1), 보(2)");
            System.out.print("0 ~ 2 중 하나를 선택하세요 : ");
            Scanner sc = new Scanner(System.in);
            int userAnswer = sc.nextInt();

            String answerTxt;

            switch (userAnswer) {
                case 0:
                    answerTxt = "가위";
                    break;
                case 1:
                    answerTxt = "바위";
                    break;
                default:
                    answerTxt = "보";
                    break;
            }
            ;

            Random random = new Random();
            int com = random.nextInt(3); // 0, 1, 2 중 하나를 무작위로 선택
            String comText;

            switch (com) {
                case 0:
                    comText = "가위";
                    break;
                case 1:
                    comText = "바위";
                    break;
                default:
                    comText = "보";
                    break;
            }

            // 승패
            String result = "";
            if (answerTxt.equals("가위") && comText.equals("가위")) result = "비김";
            else if (answerTxt.equals("바위") && comText.equals("바위")) result = "비김";
            else if (answerTxt.equals("보") && comText.equals("보")) result = "비김";
            else if (answerTxt.equals("가위") && comText.equals("보")) result = "윈";
            else if (answerTxt.equals("바위") && comText.equals("가위")) result = "윈";
            else if (answerTxt.equals("보") && comText.equals("바위")) result = "윈";
            else if (answerTxt.equals("가위") && comText.equals("바위")) result = "로즈";
            else if (answerTxt.equals("바위") && comText.equals("보")) result = "로즈";
            else if (answerTxt.equals("보") && comText.equals("가위")) result = "로즈";

            if (result == "윈") {
                mon_hp -= attack;
            }

            if (result == "로즈") {
                hp -= mon_attack;
            }

            // 만약 비겼다면
            // 아이템을 선택할 수 있다.

            System.out.println("===========================");
            System.out.println("User 선택 : " + answerTxt);
            System.out.println("COM 선택 : " + comText);
            System.out.println("===========================");
            System.out.println("결과 : " + result);
        }
    }

    static void gameSelect() {
        System.out.println("1. 게임 설정");
        System.out.println("2. 게임 시작");
        System.out.println("3. 게임 종료");

        System.out.println("===========================");
        System.out.print("선택 : ");

    }

    public static void main(String[] args) throws IOException {
        while (true) {
            print_logo();
            gameSelect();

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num == 3) return;
            else if (num == 1) gameOption();
            else if (num == 2) gameStart();

        }
    }
}
