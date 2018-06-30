package study.javas.springboot.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import study.javas.springboot.bean.User;

import java.util.List;

/**
 * Created by Nick
 * Description
 * Datetime: 2018/6/29 14:41
 */
@Repository
public interface UserMapper {
    User getUserById(Integer id);

    List<User> getUserList();

    int add(User user);

    int update(@Param("id") Integer id, @Param("user") User user);

    int delete(Integer id);
}
