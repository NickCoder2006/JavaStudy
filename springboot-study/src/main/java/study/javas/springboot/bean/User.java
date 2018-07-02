package study.javas.springboot.bean;

/**
 * Created by Nick
 * Description
 * Datetime: 2018/6/28 14:50
 */
public class User {
    private int id;
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId(){ return this.id; }
    public void setId(int id){ this.id = id; }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    public Integer getAge(){ return this.age; }
    public void setAge(Integer age){ this.age = age; }
}
