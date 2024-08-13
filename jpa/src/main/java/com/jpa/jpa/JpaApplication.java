package com.jpa.jpa;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.jpa.entities.Person;
import com.jpa.jpa.respositories.PersonRepositoty;



@SpringBootApplication
public class JpaApplication implements CommandLineRunner{

	@Autowired // Traigo el personRepository y lo injecto como dependencia
	private PersonRepositoty personRepositoty;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	// Cuando se ejecute el servidor ejecute todos los comandos desde la consola

	@Override
	public void run(String... args) throws Exception {
		//create(); // llamo a la funcion create

		// LLAMO AL METODO QUE ESTA EN LA INTERFAZ PERSONREPOSITORY
		// List<Person> persons = (List<Person>) personRepositoty.findByProgrammingLanguage("Java");
		// persons.stream().forEach(person -> System.out.println(person));

		// 
		// List<Person> persons = (List<Person>) personRepositoty.buscarByProgrammingLanguage("Java" , "Daniel");
		// persons.stream().forEach(person -> System.out.println(person));
		
	}


	@Transactional // Si algo sale mal detiene el proceso y elimina los cambios hechos
	public void create() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre");
		String name = scanner.next();

		System.out.println("Ingrese el apellido");
		String lastname = scanner.next();

		System.out.println("Ingrese el lenguaje de programaciòn");
		String programminLanguage = scanner.next();

		scanner.close();

		Person person = new Person(null , name , lastname , programminLanguage);

		Person newPerson = personRepositoty.save(person);

		System.out.println(newPerson);

		personRepositoty.findById(newPerson.getId()).ifPresent(System.out::println);


		
	}




}
