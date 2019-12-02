package br.com.mundodev.biblioteca;

import javax.swing.SwingUtilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.mundodev.biblioteca.repository.PessoaRepository;
import br.com.mundodev.biblioteca.view.Principal;

@SpringBootApplication
@EnableJpaRepositories
public class BibliotecaApplication implements CommandLineRunner {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(BibliotecaApplication.class)
        .headless(false).bannerMode(Banner.Mode.OFF).run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		SwingUtilities.invokeLater(() -> {
			final var principal = new Principal();
			principal.setVisible(true);
        });		
		
	}

}
