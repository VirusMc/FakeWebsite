package de.virusmc.fakewebsite.models.elements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/** Repräsentiert ein Bild (Basiert auf HTML)
 *
 * @author VirusMc
 * @version 1.0.0
 * @since 1.0.0
 * @see <a href="https://www.w3schools.com/html/html_images.asp">HTML Image</a>
 */
@Value
@AllArgsConstructor
@Builder
public class ImageElement {
    public String src;
    public String alt;
}
