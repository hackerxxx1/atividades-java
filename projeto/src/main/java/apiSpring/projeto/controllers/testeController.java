package apiSpring.projeto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testeController {
    //rota para qual vai os dados
    @RequestMapping("/teste")
    @ResponseBody
    public String teste() {
        return "muito top sempre";
    }
}
