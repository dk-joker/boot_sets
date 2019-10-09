package org.joker.springboot.jpademo.repository;

import org.joker.springboot.jpademo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author tangkun
 * @version 1.0.0
 * @since 2019-10-09 09:41
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByName(String name);

    Optional<Person> findByNameAndAge(String name, int age);
}

