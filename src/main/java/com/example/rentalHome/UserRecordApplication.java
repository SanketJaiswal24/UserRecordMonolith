package com.example.rentalHome;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.rentalHome.Domains.UserCredentials;
import com.example.rentalHome.Domains.UserData;
import com.example.rentalHome.Repositories.UserDataRepository;
import com.example.rentalHome.Repositories.UserSelfcredentialsRepository;

@SpringBootApplication
public class UserRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRecordApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner  setup(UserDataRepository userDataRepository) {
		return (args) ->
		{
			userDataRepository.save(new UserData(1L,"SanketDineshJaiswal","8959926364","sanket.jaiswal2409@gmail.com","118 Bhagat Singh Marge Sawer Road","2018-03-19","M","pic-name"));
			userDataRepository.save(new UserData(2L,"LokiMarvelAvegger","8677977776","Lokifinal@gmail.com","Las Vages","2018-03-19","M","loki-name"));
			userDataRepository.save(new UserData(3L,"ThorMarvelAveger","8959926364","Thor@gmail.com","118 Bhagat Singh Marge Sawer Road","2018-03-19","M","pic-name"));
			userDataRepository.save(new UserData(4L,"IronManMarvelAveger","8959926364","IronMan@gmail.com","118 Bhagat Singh Marge Sawer Road","2018-03-19","M","pic-name"));
			userDataRepository.save(new UserData(5L,"GOTMarvelAveger","8959926364","GOT@gmail.com","Los Angles","2018-03-19","M","pic-name"));
		};
	}

	@Bean
	public CommandLineRunner setup2(UserSelfcredentialsRepository userSelfcredentialsRepository)
	{
		return (args -> {
			userSelfcredentialsRepository.save( new UserCredentials(1L,"sanket.jaiswal2409@gmail.com","password@123","8959926364"));
			userSelfcredentialsRepository.save( new UserCredentials(2L,"sanket2409@gmail.com","Hack@12345","8959926364"));
		});
	}

}
