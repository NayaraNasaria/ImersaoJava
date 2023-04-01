package nay.com.linguagemapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class LinguagemController{

    @Autowired
    private LinguagemRepository repositorio;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagem(){
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
    }

    @PostMapping("/linguagens"){
       public Linguagem cadastrarLinguagem(@RequestBody Linguagem Linguagem){
            Linguagem linguagemSalva = repositorio.save(Linguagem);
            return linguagemSalva;
       } 
    }
}