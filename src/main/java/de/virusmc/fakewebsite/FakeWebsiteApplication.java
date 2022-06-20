package de.virusmc.fakewebsite;

import lombok.extern.flogger.Flogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.yaml")
@Flogger
public class FakeWebsiteApplication {

	public static final Class<FakeWebsiteApplication> APPLICATION_CLASS = FakeWebsiteApplication.class;

	public static void main(String[] args) {
		new SpringApplication(APPLICATION_CLASS).run(args).getBean(APPLICATION_CLASS).doStartupStuff();
	}

	public void doStartupStuff() {
		log.atInfo().log("-- Started FakeWebsiteApplication --");
	}

}
