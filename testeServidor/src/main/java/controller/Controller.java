package controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {


    @RequestMapping("/ola")
    public String testeService(){


    return "html/view.html";
    }
}
