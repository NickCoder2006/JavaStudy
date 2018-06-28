package study.javas.springboot.web;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Nick
 * Description
 * Datetime: 2018/6/27 18:25
 */
@Api(description="Thymeleaf使用")
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @RequestMapping(value = "/index", method= RequestMethod.GET)
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "https://github.com/NickCoder2006");
        map.addAttribute("text", "ThymeleafDemo.");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "thymeleaf/index";
    }
}
