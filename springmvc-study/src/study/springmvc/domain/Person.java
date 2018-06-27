package study.springmvc.domain;

import javax.validation.constraints.Size;

public class Person {
    private Integer id;
    @Size(min = 6, max = 12, message = "姓名必须大于6个字符，小于12个字符！")
    private String name;
    private Integer age;
    // 头像地址
    private String headImgPath;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHeadImgPath(){ return headImgPath; }

    public void setHeadImgPath(String headImgPath){ this.headImgPath = headImgPath; }

    @Override
    public String toString(){
        return String.format("Person{id=%s, name=%s, age=%s}", id, name, age);
    }
}
