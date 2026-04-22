public class V3_1_Grade {
    public static void main(String[] args) {
        String name = "Minco";
        char grade = 'A';

        System.out.println("이름:" + name);   // read
        System.out.println("성적:" + grade);  // read

        int correctCount = 5;
        correctCount += 10;       // write

        System.out.println("맞은 문항수:" + correctCount); // read
    }


}