package br.net.mjdev.deploy.books;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, UUID> {

}
