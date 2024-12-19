package com.generation.backendsemplicissimo.controllers;

import com.generation.backendsemplicissimo.controllers.helpers.ControllerHelper;
import com.generation.backendsemplicissimo.model.entities.Person;
import com.generation.backendsemplicissimo.model.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController
{
	@Autowired
	private ControllerHelper ch;

	@GetMapping
	public List<Person> getPersons()
	{
		return ch.findAllPersons();
	}

	//http://localhost:8080/api/persons/3
	@GetMapping("/{id}")
	public Person getPerson(@PathVariable Long id)
	{
		return ch.findPersonById(id);
	}

	@PostMapping
	public Person getPerson(@RequestBody Person person)
	{
		return ch.savePerson(person);
	}
}
