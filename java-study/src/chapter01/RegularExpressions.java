package chapter01;

import java.util.regex.*;

/**
 * Created by Nick
 * explain
 * Datetime: 2018/6/2 16:19
 */
public class RegularExpressions {
    public void use(){
        method1();
    }

    public void method1(){
        String contents = "I am noob " + "from runoob.com.";
        String pattern = ".*runoob.*";
        System.out.println("字符串中是否包含了 'runoob' 子字符串?" + Pattern.matches(pattern, contents));
    }
}
