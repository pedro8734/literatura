package com.aluracursos.desafioLibros;

import com.aluracursos.desafioLibros.principal.Principal;
import com.aluracursos.desafioLibros.repository.AutorRepository;
import com.aluracursos.desafioLibros.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication

public class DesafioLibrosApplication implements CommandLineRunner {
	@Autowired
	private LibroRepository librorepo;
	@Autowired
	private AutorRepository autorrepo;

	public static void main(String[] args) {
		SpringApplication.run(DesafioLibrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(librorepo, autorrepo);
		principal.muestraElMenu();
	}
}
