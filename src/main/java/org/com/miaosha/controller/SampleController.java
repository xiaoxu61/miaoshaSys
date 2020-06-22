package org.com.miaosha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class SampleController {

    @RequestMapping("/templates")
//    @ResponseBody
    public String thymeleaf(Model model) {
        model.addAttribute("name","Joshua");
        return "hello";
    }

    @RequestMapping(value = "/thyme")
    public String index(Model map) {
        map.addAttribute("host", "Spring Boot");
        return "index";
    }
}
