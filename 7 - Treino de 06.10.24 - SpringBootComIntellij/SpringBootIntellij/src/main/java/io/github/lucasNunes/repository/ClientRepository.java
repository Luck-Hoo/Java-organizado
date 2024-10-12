package io.github.lucasNunes.repository;

import org.springframework.stereotype.Repository;
import io.github.lucasNunes.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    
}
