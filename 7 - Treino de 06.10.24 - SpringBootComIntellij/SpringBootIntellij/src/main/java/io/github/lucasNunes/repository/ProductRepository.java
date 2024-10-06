package io.github.lucasNunes.repository;

import io.github.lucasNunes.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Produto, Long> {
}
