package io.github.lucasNunes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import io.github.lucasNunes.model.Client;
import io.github.lucasNunes.repository.ClientRepository;
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }
    public Client save(Client client) {
        // Aqui você pode fazer validações adicionais se necessário
        return clientRepository.save(client);
    }
}
