package study.javas.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nick
 * Homepage
 * Datetime: 2018/6/27 16:59
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "Homepage.";
    }
}
