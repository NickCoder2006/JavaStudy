package study.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/chars")
public class CharsController {

    @ResponseBody
    @RequestMapping(value="/getchars", method= RequestMethod.GET)
    public String chars(){
        Integer id = 1;
        String name = "Alice";
        Integer age = 33;
        return String.format("Person{id=%s, name=%s, age=%s}", id, name, age);
    }
}
