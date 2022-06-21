package de.virusmc.fakewebsite.models.index;

import de.virusmc.fakewebsite.models.elements.NavbarElement;
import lombok.Builder;
import lombok.Data;

/** Repräsentiert den Inhalt der Startseite
 *
 * @author VirusMc
 * @version 1.0.0
 * @since 1.0.0
 * @see NavbarElement
 * @see IndexContentModel
 */
@Data
@Builder
public class IndexPageModel {

    private String title;

    private NavbarElement[] navbarElements;

    private IndexContentModel[] cards;


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
