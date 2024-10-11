package com.j.jdev.ScreenMatch;

import com.j.jdev.ScreenMatch.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumoApi = new ConsumoAPI();
		String json = consumoApi.obtenerDatos("http://www.omdbapi.com/?t=game+of+thrones&apikey=be3a2d77");
		System.out.println(json);
	}
}
