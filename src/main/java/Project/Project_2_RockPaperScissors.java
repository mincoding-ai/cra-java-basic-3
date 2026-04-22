package Project;

import java.util.Random;
import java.util.Scanner;

public class Project_2_RockPaperScissors {
    public static void main(String[] args) {

        System.out.println("가위(0), 바위(1), 보(2)");
        System.out.print("0 ~ 2 중 하나를 선택하세요 : ");
        Scanner sc = new Scanner(System.in);
        int userAnswer = sc.nextInt();

        String answerTxt;

//        if (userAnswer == 0) {
//            answerTxt = "가위";
//        }
//        else if ( userAnswer ==1 ) {
//            answerTxt = "바위";
//        }
//        else {
//            answerTxt = "보";
//        }

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
        ;

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

        System.out.println("===========================");
        System.out.println("User 선택 : " + answerTxt);
        System.out.println("COM 선택 : " + comText);
        System.out.println("===========================");
        System.out.println("결과 : " + result);
    }
}
