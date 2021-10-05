package br.com.ismadrade.repository;

import br.com.ismadrade.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
