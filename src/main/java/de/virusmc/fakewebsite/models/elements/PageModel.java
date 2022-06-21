package de.virusmc.fakewebsite.models.elements;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class PageModel {


    private String title;
    private NavbarElement[] navbarElements;

    /** Setzt das aktive Navbar-Element auf das angegebene Thema
     *
     * @author VirusMc
     * @since 1.0.0
     * @param id Thema, das aktiviert werden soll
     * @see NavbarElement
     */
    public void setActiveNavbarElement(String id) {
        for (NavbarElement navbarElement : navbarElements) {
            navbarElement.active(navbarElement.url().equals("/?id=" + id));
        }
    }
}
