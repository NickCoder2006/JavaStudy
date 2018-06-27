import chapter01.*;
import chapter02.*;

public class Main {

    public static void main(String[] args) {
//        juice();
//        dog();
//        (new Operator()).use();
//        (new LoopAndBranch()).use();
//        (new MathClass()).use();
//        (new StringClass()).use();
//        (new DateClass()).use();
//        (new RegularExpressions()).use();
//        (new FinalizationClass()).use();
//        (new FileStreamClass()).writeFile();
//        (new SerializeDemo()).serializeMethod();
//        (new SerializeDemo()).deSerializeMethod();
    }

    // 枚举举例
    private static void juice(){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println(juice.size.toString());
    }

    private static void dog(){
        Dog dog = new Dog("Jim");
        dog.setAge(3);
        int dogAge = dog.getAge();
        System.out.println(String.format("对象变量值为：%s",dog.dogAge));
    }
}
