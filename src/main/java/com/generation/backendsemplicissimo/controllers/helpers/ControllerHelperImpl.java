package com.generation.backendsemplicissimo.controllers.helpers;

import com.generation.backendsemplicissimo.model.entities.Person;
import com.generation.backendsemplicissimo.model.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControllerHelperImpl implements ControllerHelper
{
	@Autowired
	private PersonRepository pRepo;

	@Override
	public List<Person> findAllPersons()
	{
		return pRepo.findAll();
	}

	@Override
	public Person findPersonById(Long id)
	{
		return pRepo.findById(id).get();
	}

	@Override
	public Person savePerson(Person person)
	{
		return pRepo.save(person);
	}
}
