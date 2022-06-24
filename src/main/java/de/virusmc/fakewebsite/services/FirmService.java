package de.virusmc.fakewebsite.services;

import de.virusmc.fakewebsite.models.FirmPageModel;
import de.virusmc.fakewebsite.models.elements.NavbarElement;
import net.datafaker.Address;
import net.datafaker.Company;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class FirmService {

    public FirmPageModel getFirmPageModel() {
        Faker faker = new Faker(Locale.GERMANY);
        Company company = faker.company();
        Address address = faker.address();

        return FirmPageModel.builder()
                .title(company.name())
                .navbarElements(new NavbarElement[]{
                        NavbarElement.builder()
                                .name("Allgemein")
                                .url("#general")
                                .build(),
                })
                .address(address.streetAddress() + " " + address.streetAddressNumber() + "<br/>" + address.zipCode() + " " + address.city())
                .telephone(faker.phoneNumber().phoneNumber())
                .catchPhrase(company.catchPhrase())
                .industry(company.industry())
                .build();
    }
}
