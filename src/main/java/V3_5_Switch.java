public class V3_5_Switch {
    public static void main(String[] args) {
        int selectNumber = 3;

        switch (selectNumber) {
            case 1:
                System.out.println("Jump");
                break;
            case 2:
                System.out.println("Spin");
                break;
            case 3:
                System.out.println("Dance");
                break;
            case 4:
                System.out.println("Stop");
                break;
            default:
                System.out.println("잘못된 입력");
                break;
        }
    }
}
