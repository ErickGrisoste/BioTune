package erick.biotune.BioTune;

import erick.biotune.BioTune.principal.Principal;
import erick.biotune.BioTune.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BioTuneApplication implements CommandLineRunner {

	@Autowired
	ArtistaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BioTuneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.exibeMenu();


	}
}
