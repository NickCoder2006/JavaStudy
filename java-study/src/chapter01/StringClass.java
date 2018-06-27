package chapter01;

/**
 * Created by Nick
 * explain
 * Datetime: 2018/6/1 20:49
 */
public class StringClass {
    public void use(){
        //stringCompare();

        // 调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    public void stringCompare(){
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s2.equals(s4));
    }

    public void printMax(double... numbers){
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i <  numbers.length; i++){
            if (numbers[i] >  result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
