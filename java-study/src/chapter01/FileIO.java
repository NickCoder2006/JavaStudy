package chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nick
 * explain
 * Datetime: 2018/6/2 17:40
 */
public class FileIO {

    public static void BRRead(String args[]) throws IOException{
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q');
    }

    public static void BRReadLines(String args[]) throws IOException{
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("end"));
    }

    public static void WriteDemo(){
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
    }
}
