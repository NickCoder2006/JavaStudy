package study.javas.springboot.service;

import study.javas.springboot.bean.User;

import java.util.List;

/**
 * Created by Nick
 * Description
 * Datetime: 2018/6/29 14:18
 */
public interface UserService {
    /**
     * 根据用户编号获取用户信息
     * @param id 用户编号
     * @return 用户信息
     */
    User getUserById(Integer id);

    /**
     * 获取用户列表
     * @return 用户列表
     */
    List<User> getUserList();

    /**
     * 添加用户
     * @param user 用户信息
     * @return
     */
    int add(User user);

    /**
     * 修改用户信息
     * @param id 用户编号
     * @param user 用户信息
     * @return
     */
    int update(Integer id, User user);

    /**
     * 根据用户编号删除指定用户
     * @param id 用户编号
     * @return
     */
    int delete(Integer id);
}
