package chapter01;

public class Dog {

    public int dogAge;

    public static final double PI = 3.1415926;


    public Dog(String name){
        System.out.println(String.format("狗的名字叫：%s", name));
    }

    public void setAge(int age){
        dogAge = age;
    }

    public int getAge(){
        System.out.println(String.format("狗的年龄为：%s", dogAge));
        System.out.println(PI);
        return dogAge;
    }
}
