package de.virusmc.fakewebsite.services;

import de.virusmc.fakewebsite.models.FirmPageModel;
import de.virusmc.fakewebsite.models.elements.NavbarElement;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class FirmService {

    public FirmPageModel getFirmPageModel() {
        Faker faker = new Faker(Locale.GERMANY);

        return FirmPageModel.builder()
                .title(faker.company().name())
                .navbarElements(new NavbarElement[]{
                        NavbarElement.builder()
                                .name("Allgemein")
                                .url("#general")
                                .build(),
                })
                .address(faker.address().streetAddress() + " " + faker.address().streetAddressNumber() + "<br/>" + faker.address().zipCode() + " " + faker.address().city())
                .telephone(faker.phoneNumber().phoneNumber())
                .build();
    }
}
