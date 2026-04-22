public class V3_4_ReferenceType {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1;
        arr2[0] = 7;
        System.out.println(arr1[0]);
    }
}
