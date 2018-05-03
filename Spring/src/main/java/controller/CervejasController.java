package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pedro-ramalho on 02/05/18.
 */
@Controller
public class CervejasController {

    @RequestMapping("cervejas/novo")
    public String novo(){

        return "cervejas/CervejasControler";
    }





}
