package de.virusmc.fakewebsite.services;

import de.virusmc.fakewebsite.models.elements.ImageElement;
import de.virusmc.fakewebsite.models.elements.NavbarElement;
import de.virusmc.fakewebsite.models.index.IndexContentModel;
import de.virusmc.fakewebsite.models.index.IndexPageModel;
import org.springframework.stereotype.Service;

/** Service zum Erstellen der Startseite
 *
 * @author VirusMc
 * @version 1.0.0
 * @since 1.0.0
 * @see IndexPageModel
 */
@Service
public class IndexService {

    /** Liefert den Inhalt der Startseite
     *
     * @author VirusMc
     * @since 1.0.0
     * @return Inhalt der Startseite
     * @see IndexPageModel
     */
    public IndexPageModel getIndexPageModel() {
        return IndexPageModel.builder()
                .title("Fake Website")
                .navbarElements(new NavbarElement[]{
                        NavbarElement.builder()
                                .name("Firma")
                                .url("/?id=generateFirma")
                                .active(false)
                                .build(),
                        NavbarElement.builder()
                                .name("Person")
                                .url("/?id=generatePerson")
                                .active(false)
                                .build(),
                        NavbarElement.builder()
                                .name("Tier")
                                .url("/?id=generateTier")
                                .active(false)
                                .build(),
                        NavbarElement.builder()
                                .name("Buch")
                                .url("/?id=generateBuch")
                                .active(false)
                                .build(),
                        NavbarElement.builder()
                                .name("Wetter")
                                .url("/?id=generateWetter")
                                .active(false)
                                .build(),
                        NavbarElement.builder()
                                .name("Sport Team")
                                .url("/?id=generateSportTeam")
                                .active(false)
                                .build(),
                })
                .cards(new IndexContentModel[]{
                        IndexContentModel.builder()
                                .title("Firma")
                                .url("/firm")
                                .description("Generiere eine neue Firma")
                                .img(new ImageElement("https://loremflickr.com/400/400/company", "Firma Bild"))
                                .build(),
                        IndexContentModel.builder()
                                .title("Person")
                                .url("/person")
                                .description("Generiere eine neue Person")
                                .img(new ImageElement("https://loremflickr.com/400/400/people", "Person Bild"))
                                .build(),
                        IndexContentModel.builder()
                                .title("Tier")
                                .url("/tier")
                                .description("Generiere ein neues Tier")
                                .img(new ImageElement("https://loremflickr.com/400/400/animals", "Tier Bild"))
                                .build(),
                        IndexContentModel.builder()
                                .title("Buch")
                                .url("/buch")
                                .description("Generiere ein neues Buch")
                                .img(new ImageElement("https://loremflickr.com/400/400/books", "Buch Bild"))
                                .build(),
                        IndexContentModel.builder()
                                .title("Wetter")
                                .url("/wetter")
                                .description("Generiere ein neues Wetter")
                                .img(new ImageElement("https://loremflickr.com/400/400/weather", "Wetter Bild"))
                                .build(),
                        IndexContentModel.builder()
                                .title("Sport Team")
                                .url("/sportteam")
                                .description("Generiere ein neues Sport Team")
                                .img(new ImageElement("https://loremflickr.com/400/400/sports", "Sport Team Bild"))
                                .build(),
                })
                .build();
    }
}
