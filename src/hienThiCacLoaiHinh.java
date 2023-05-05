import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        while (num != 0) {
            System.out.println("Menu:");
            System.out.println("1: Hình chữ nhật!");
            System.out.println("2: Hình tam giác vuông, có cạnh góc vuông ở botton-left!");
            System.out.println("3: Hình tam giác vuông, có cạnh góc vuông ở top-left!");
            System.out.println("4: Hình tam giác cân!");
            System.out.println("5: Hình tam giác cân ngược!");
            System.out.println("0: Thoát khỏi chương trình!");
            System.out.println("Nhập số cần hiển thị hình");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i * 2 + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 5; i > 0; i--) {

                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i * 2 - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
