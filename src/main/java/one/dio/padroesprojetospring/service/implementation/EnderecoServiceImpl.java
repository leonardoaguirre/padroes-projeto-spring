package one.dio.padroesprojetospring.service.implementation;

import one.dio.padroesprojetospring.model.Endereco;
import one.dio.padroesprojetospring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl {
    @Autowired
    private ViaCepService viaCepService;

    public Endereco buscaEndereco(String cep){
        return viaCepService.consultarCep(cep);
    }
}
