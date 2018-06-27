package study.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="/urlopt")
public class UrlOptController {

    // 请求映射
    @RequestMapping(value="/geturl")
    public String goTest(HttpServletRequest request) {
        // 输出请求 URL 路径
        System.out.println(request.getRequestURL());
        // 返回逻辑名
        return "index";
    }
}
