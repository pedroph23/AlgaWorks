package controller;

import model.Cerveja;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by pedro-ramalho on 02/05/18.
 */
@Controller
public class CervejasController {


    @RequestMapping("cervejas/novo")
    public String novo(Cerveja cerveja){
       return "cervejas/CervejasControler";
    }

    @RequestMapping(value = "cervejas/novo", method = RequestMethod.POST)
    public String cadastrar(@Valid Cerveja cerveja, BindingResult result,RedirectAttributes attributes,Model model){


                if(result.hasErrors()){
                   return novo(cerveja);
                }else{
                    System.out.print("SKU: " + cerveja.getSku() + "\n"
                    + "Nome: " + cerveja.getNome() + "\n"
                    + "Descricao: " + cerveja.getDescricao());
                }






        return "redirect:/cervejas/novo";// O "redirect" é util em questao de formularios. Nesse caso ele retorna a url e nao um Html

    }





}
