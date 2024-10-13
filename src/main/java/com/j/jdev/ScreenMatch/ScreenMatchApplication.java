package com.j.jdev.ScreenMatch;

import com.j.jdev.ScreenMatch.modelo.DatosEpisodio;
import com.j.jdev.ScreenMatch.modelo.DatosSerie;
import com.j.jdev.ScreenMatch.modelo.DatosTemporada;
import com.j.jdev.ScreenMatch.principal.Principal;
import com.j.jdev.ScreenMatch.service.ConsumoAPI;
import com.j.jdev.ScreenMatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.print.attribute.standard.PrinterInfo;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.mostrarMenu();
	}
}
