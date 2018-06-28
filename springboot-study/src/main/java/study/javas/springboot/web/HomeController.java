package study.javas.springboot.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nick
 * Homepage
 * Datetime: 2018/6/27 16:59
 */
@Api(description="主页API")
@RestController
public class HomeController {
    @ApiOperation(value="获取主页字符", notes="")
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(){
        return "Homepage.";
    }

    @ApiOperation(value="获取值", notes="根据输入值显示。")
    @RequestMapping(value="/getvalue/{val}", method = RequestMethod.GET)
    @ApiImplicitParam(name = "val", value = "输入值", required = false, dataType = "String")
    public String getValue(@PathVariable String val){
        return "Input value is : " + val;
    }
}
