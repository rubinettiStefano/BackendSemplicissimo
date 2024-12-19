package com.generation.backendsemplicissimo.controllers.helpers;

import com.generation.backendsemplicissimo.model.entities.Person;

import java.util.List;

public interface ControllerHelper
{
	List<Person> findAllPersons();

	Person findPersonById(Long id);

	Person savePerson(Person person);
}
