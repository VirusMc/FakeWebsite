package de.virusmc.fakewebsite.models.index;

import de.virusmc.fakewebsite.models.elements.NavbarElement;
import de.virusmc.fakewebsite.models.elements.PageModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

/** Repräsentiert den Inhalt der Startseite
 *
 * @author VirusMc
 * @version 1.0.0
 * @since 1.0.0
 * @see NavbarElement
 * @see IndexContentModel
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class IndexPageModel extends PageModel {

    private IndexContentModel[] cards;

}
