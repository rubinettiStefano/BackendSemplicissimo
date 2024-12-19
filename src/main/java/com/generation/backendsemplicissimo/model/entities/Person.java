package com.generation.backendsemplicissimo.model.entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Person extends BaseEntity
{
	private String firstName;
	private String lastName;
	private LocalDate birthDate;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public LocalDate getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
	}
}
