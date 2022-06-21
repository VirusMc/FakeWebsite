package de.virusmc.fakewebsite.models.index;

import de.virusmc.fakewebsite.models.elements.NavbarElement;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IndexPageModel {

    private String title;

    private NavbarElement[] navbarElements;

    private IndexContentModel[] cards;


    public void setActiveNavbarElement(String id) {
        for (NavbarElement navbarElement : navbarElements) {
            navbarElement.active(navbarElement.url().equals("/?id=" + id));
        }
    }
}
