package chapter01;

import java.util.Scanner;

/**
 * Created by Nick
 * explain
 * Datetime: 2018/6/6 16:00
 */
public class ScannerClass {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.next();
            System.out.println("输入的数据为：" + str2);
        }
        scan.close();
    }
}
