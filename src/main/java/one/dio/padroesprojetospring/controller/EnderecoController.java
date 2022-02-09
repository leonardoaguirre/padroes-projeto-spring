package one.dio.padroesprojetospring.controller;

import one.dio.padroesprojetospring.model.Endereco;
import one.dio.padroesprojetospring.service.implementation.EnderecoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("endereco")
public class EnderecoController {
    @Autowired
    EnderecoServiceImpl enderecoService;

    @GetMapping("/buscaCep/{cep}")
    ResponseEntity<Endereco> consultaCep(@PathVariable String cep){
        return ResponseEntity.ok(enderecoService.buscaEndereco(cep));
    }
}
