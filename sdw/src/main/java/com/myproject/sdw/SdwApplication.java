package com.myproject.sdw;

import com.myproject.sdw.application.ListChampionsUseCase;
import com.myproject.sdw.domain.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SdwApplication {

	public static void main(String[] args) {SpringApplication.run(SdwApplication.class, args);}

	@Bean
	public ListChampionsUseCase provideListChampionsUseCase (ChampionsRepository repository){
		return new ListChampionsUseCase(repository);
	}
}
