package JAVABASICBT4;

public class Array {
    public static void main(String[] args) {
        System.out.println("Tạo mảng để lưu những số chẵn");
        int mang[] = new int[26];
        int vitri = 0;
        for (int a = 0; a < mang.length * 2; a = a + 2) {
            mang[vitri] = a;
            vitri++;

        }
        System.out.println("Duyệt mảng in ra kết quả");
        for (int i : mang) {
            System.out.println(i);
        }
    }

}
