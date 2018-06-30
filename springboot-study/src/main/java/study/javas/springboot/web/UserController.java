package study.javas.springboot.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.javas.springboot.bean.JsonResult;
import study.javas.springboot.bean.User;
import study.javas.springboot.service.UserService;

import java.util.List;

/**
 * Created by Nick
 * Description
 * Datetime: 2018/6/28 14:47
 */
@Api(description = "用户操作API")
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserList() {
        JsonResult data = new JsonResult();
        try {
            List<User> users = userService.getUserList();
            data.setResult(users);
            data.setStatus("success");
        } catch (Exception e) {
            data.setResult(e.getClass().getName() + ":" + e.getMessage());
            data.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(data);
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> createUser(@RequestBody User user) {
        JsonResult data = new JsonResult();
        try {
            int userId = userService.add(user);
            data.setResult(userId);
            if (userId < 0) {
                data.setStatus("fail");
            } else {
                data.setStatus("success");
            }
        } catch (Exception e) {
            data.setResult(e.getClass().getName() + ":" + e.getMessage());
            data.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(data);
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", paramType = "path")
    @GetMapping(value = "/{id}")
    public ResponseEntity<JsonResult> getUser(@PathVariable int id) {
        JsonResult data = new JsonResult();
        try {
            User user = userService.getUserById(id);
            data.setResult(user);
            data.setStatus("success");
        } catch (Exception e) {
            data.setResult(e.getClass().getName() + ":" + e.getMessage());
            data.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(data);
    }

    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> updateUser(@PathVariable int id, @RequestBody User user) {
        JsonResult data = new JsonResult();
        try {
            int ret = userService.update(id, user);
            data.setResult(ret);
            if (ret < 0) {
                data.setStatus("fail");
            } else {
                data.setStatus("success");
            }
        } catch (Exception e) {
            data.setResult(e.getClass().getName() + ":" + e.getMessage());
            data.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(data);
    }

    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<JsonResult> deleteUser(@PathVariable int id) {
        JsonResult data = new JsonResult();
        try {
            int ret = userService.delete(id);
            data.setResult(ret);
            if (ret < 0) {
                data.setStatus("fail");
            } else {
                data.setStatus("success");
            }
        } catch (Exception e) {
            data.setResult(e.getClass().getName() + ":" + e.getMessage());
            data.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(data);
    }
}
