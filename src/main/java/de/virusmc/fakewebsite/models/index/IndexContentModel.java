package de.virusmc.fakewebsite.models.index;

import de.virusmc.fakewebsite.models.elements.CardElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

/** Repräsentiert den Inhalt der Startseite (Basiert auf Bootstrap)
 *
 * @author VirusMc
 * @version 1.0.0
 * @since 1.0.0
 * @see <a href="https://getbootstrap.com/docs/5.2/components/card/#example">Bootstrap Card</a>
 * @see CardElement
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class IndexContentModel extends CardElement {
    private String url;
}
