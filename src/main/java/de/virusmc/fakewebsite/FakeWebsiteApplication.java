package de.virusmc.fakewebsite;

import lombok.extern.flogger.Flogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/** Die Hauptklasse des Programms
 *
 * @author VirusMc
 * @version 1.0.0
 * @since 1.0.0
 */
@SpringBootApplication
@PropertySource("classpath:application.yaml")
@Flogger
public class FakeWebsiteApplication {

    public static final Class<FakeWebsiteApplication> APPLICATION_CLASS = FakeWebsiteApplication.class;

    /** Startet das Programm
     *
     * @param args Argumente für das Programm
     * @author VirusMc
     * @since 1.0.0
     * @see SpringApplication
     */
    public static void main(String[] args) {
        new SpringApplication(APPLICATION_CLASS).run(args).getBean(APPLICATION_CLASS).doStartupStuff();
    }

    /** Führt die Startup-Aktivitäten aus
     *
     * @author VirusMc
     * @since 1.0.0
     */
    public void doStartupStuff() {
        log.atInfo().log("-- Started FakeWebsiteApplication --");
    }

}
