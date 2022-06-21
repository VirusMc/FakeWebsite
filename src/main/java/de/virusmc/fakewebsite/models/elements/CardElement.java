package de.virusmc.fakewebsite.models.elements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * Repräsentiert eine Standartkarte (Basiert auf Bootstrap)
 *
 * @author VirusMc
 * @version 1.0.0
 * @since 1.0.0
 * @see <a href="https://getbootstrap.com/docs/5.2/components/card/#example">Bootstrap Card</a>
 */
@Data
@SuperBuilder
@AllArgsConstructor
public class CardElement {
    private String title;
    private String subtitle;
    private String description;
    private ImageElement img;
}
