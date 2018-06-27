package study.springmvc.service;

import org.springframework.stereotype.Service;
import study.springmvc.domain.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonService {
    // 声明一个容器
    private static Map<Integer, Person> map = new HashMap<Integer, Person>();

    // 利用静态块初始化数据
    static {
        for (int i = 1; i <= 10; i++) {
            Person p = new Person();
            p.setId(i);
            p.setName("Alice"+i);
            p.setAge(10+i);
            map.put(i,p);
        }
    }

    // 获取人员列表
    public List<Person> getAll(){
        // 将map对象转换为list结果
        return new ArrayList(map.values());
    }

    /**
     * 根据编号获取人员信息
     * @param id 人员编号
     * @return
     */
    public Person getById(Integer id) {
        return map.get(id);
    }

    /**
     * 添加人员
     * @param p 人员信息
     */
    public void addPerson(Person p){
        Integer id = map.values().size() + 1;
        p.setId(id);
        map.put(id, p);
    }


    /**
     * 更新人员信息
     * @param p 人员信息
     */
    public void updatePerson(Person p){
        map.put(p.getId(), p);
    }

    /**
     * 根据编号删除人员信息
     * @param id 人员编号
     */
    public void delById(Integer id){
        map.remove(id);
    }
}
