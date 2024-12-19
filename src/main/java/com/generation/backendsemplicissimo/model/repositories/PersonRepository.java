package com.generation.backendsemplicissimo.model.repositories;

import com.generation.backendsemplicissimo.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>
{
}
