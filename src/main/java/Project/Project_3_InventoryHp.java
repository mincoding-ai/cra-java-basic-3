package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_3_InventoryHp {
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

    public static void main(String[] args) {

        // 동적배열
        ArrayList<Inventory> arr = new ArrayList<>();

        arr.add(new Inventory(1, "회복약", 2));
        arr.add(new Inventory(2, "강력 회복약", 7));
        arr.add(new Inventory(3, "영양제", 3));

        System.out.println("아이템 목록 (인벤토리)");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i).id + ". ");
            System.out.print("[" + arr.get(i).name + "] ");
            System.out.print(arr.get(i).point + "pt ");
            System.out.println();
        }
        System.out.println();

        System.out.print("사용할 아이템 입력 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("현재 HP : " + hp);

        hp += arr.get(num - 1).point;

        System.out.println("회복된 HP : " + hp);
    }
}
