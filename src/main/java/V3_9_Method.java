public class V3_9_Method {
    static int countBiggerThanFive(int a, int b, int c) {

        int cnt = 0 ;
        if(a > 5) cnt += 1;
        if(b > 5) cnt += 1;
        if(c > 5) cnt += 1;

        return cnt;
    }

    public static void main(String[] args) {
        int result = countBiggerThanFive(3,6,9);
        System.out.println("5보다 큰 수는 " + result + "개입니다.");
    }


}
