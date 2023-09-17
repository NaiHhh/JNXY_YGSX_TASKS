package second;

import java.util.Scanner;

public class YangHuiTriangle {
    public static void main(String[] args) {
    System.out.println("请输入一个数");
    int len;
    Scanner sc = new Scanner(System.in);
    len = sc.nextInt();
    int[][] arr = new int[len][];

            for (int i = 0; i < len; i++) {
        arr[i] = new int[i + 1];
    }

            for (int i = 0; i < len; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (j == 0 || j == arr[i].length - 1) {
                arr[i][j] = 1;
            } else {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
    }

    int num = arr[arr.length - 1][(arr.length) / 2];

            System.out.println("打印的行数:   " + arr.length);

    int count = 0;

            while (num >= 1) {
        num /= 10;
        count++;
    }
            for (int i = 0; i < arr.length; i++) {
        System.out.format("%" + ((arr.length - i)*count) + "s", "");
        for (int j = 0; j < arr[i].length; j++) {
            System.out.format("%-"+count+"d",arr[i][j]);
            System.out.format("%-"+count+"s","");
        }
        System.out.println();
    }
}
}
