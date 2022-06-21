package de.virusmc.fakewebsite.models.elements;

import lombok.Builder;
import lombok.Data;

/** Repräsentiert ein Link in der Navbar (Basiert auf Bootstrap)
 *
 * @author VirusMc
 * @version 1.0.0
 * @since 1.0.0
 * @see <a href="https://getbootstrap.com/docs/5.2/components/navbar/#nav">Bootstrap Navbar</a>
 */
@Data
@Builder
public class NavbarElement {
    private String name;
    private String url;
    private boolean active;
}
