package Aprendizados.controller.Aprendizados;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizados")
public class controller {
    @GetMapping
    public String helloworld() {
        return "Java com Spring Boot\n" +
                "Mysql\n" +
                "Banco de dados\n" +
                "Criação de tabelas\n" +
                "Criação de Diagrama para Banco de dados";
    }
}
