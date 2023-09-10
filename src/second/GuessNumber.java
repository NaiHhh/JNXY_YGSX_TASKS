package second;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("请输入1-100之间的数字：");
        Random random=new Random();
        int guess= random.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a > guess) {
                System.out.println("你猜的数字大了");
            } else if (a < guess) {
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("猜对了！");
                break;
            }

        }
    }
}