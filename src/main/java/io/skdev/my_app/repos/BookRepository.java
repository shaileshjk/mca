package io.skdev.my_app.repos;

import io.skdev.my_app.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
