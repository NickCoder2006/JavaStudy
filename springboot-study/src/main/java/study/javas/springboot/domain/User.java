package study.javas.springboot.domain;

/**
 * Created by Nick
 * Description
 * Datetime: 2018/6/28 14:50
 */
public class User {
    private Long id;
    private String name;
    private Integer age;

    public Long getId(){ return this.id; }
    public void setId(Long id){ this.id = id; }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    public Integer getAge(){ return this.age; }
    public void setAge(Integer age){ this.age = age; }
}
