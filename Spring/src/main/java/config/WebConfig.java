package config;

import controller.CervejasController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by pedro-ramalho on 02/05/18.
 */

@Configuration //Mostrar que é uma classe de configuração
@ComponentScan(basePackageClasses={ CervejasController.class} ) //Fazendo essa classe reconhecer a classe Controller
@EnableWebMvc //Abilitar o projeto para o estilo MVC
public class WebConfig extends WebMvcConfigurerAdapter 
{


}
