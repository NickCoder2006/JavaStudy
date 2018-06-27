package study.springmvc.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import study.springmvc.domain.Person;
import study.springmvc.service.PersonService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/person")
public class PersonController {
    @Resource
    PersonService ps;

    // 声明 model 用来传递数据
    @RequestMapping(value = "/all")
    public String getAll(Map<String,Object> model){
        List<Person> personList = ps.getAll();
        // 通过这一步，JSP 页面就可以访问 personList
        model.put("personList",personList);
        // 跳转到 jPersonList 页面
        return "/person/all";
    }

    // 添加人员表单页
    @RequestMapping(value = "/newform")
    public String newPersonForm(){
        return "/person/newForm";
    }

    // 添加人员
    @RequestMapping(value = "/addperson")
    public String addPerson(Person p){
        ps.addPerson(p);
        return "redirect:/person/all";
    }

    // 修改人员信息表单面
    @RequestMapping("/editform")
    public String editPersonForm(Integer id, Model model) {
        Person p = ps.getById(id);
        model.addAttribute("p", p);
        return "/person/editForm";
    }

    // 编辑人员信息
    @RequestMapping("/editperson")
    public String editPerson(HttpServletRequest request,
                             @Valid Person p,
                             BindingResult bindingResult,
                             Model model,
                             @RequestParam("photo") MultipartFile photoFile) throws IOException {
        if (p.getId() == null) {
            ps.addPerson(p);
        }
        else {
            // 判断校验是否发现错误
            if(bindingResult.hasErrors()){
                // 获取错误消息
                String errMsg = "";
                Map<String, String> err = new HashMap<String, String>();
                List<FieldError> list = bindingResult.getFieldErrors();
                FieldError error = null;
                for (int i = 0; i < list.size(); i++) {
                    error = list.get(i);
                    errMsg += String.format("{%s}", error.getDefaultMessage());
                }
                request.setAttribute("errMsg", errMsg);

                model.addAttribute("p",p);
                // 校验错误，返回错误页面，进行错误提示
                return "/person/editForm";
            }

            if(photoFile.getSize() > 0){
                String dir = request.getSession().getServletContext().getRealPath("/") + "/upload/";
                // 原始的文件名
                String fileName = photoFile.getOriginalFilename();
                // 扩展名
                String extName = fileName.substring(fileName.lastIndexOf("."));
                // 防止文件名冲突
                fileName = fileName.substring(0, fileName.lastIndexOf(".")) + System.nanoTime() + extName;
                // 写文件到 upload 目录
                FileUtils.writeByteArrayToFile(new File(dir + fileName), photoFile.getBytes());

                p.setHeadImgPath("/upload/" + fileName);
            }

            ps.updatePerson(p);
        }
        return "redirect:/person/all";
    }

    // 删除人员信息
    @RequestMapping("/delperson")
    public String delPersonById(Integer id){
        ps.delById(id);
        return "redirect:/person/all";
    }
}
