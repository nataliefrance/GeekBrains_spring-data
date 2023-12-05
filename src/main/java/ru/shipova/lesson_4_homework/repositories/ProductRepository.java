package ru.shipova.lesson_4_homework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shipova.lesson_4_homework.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
