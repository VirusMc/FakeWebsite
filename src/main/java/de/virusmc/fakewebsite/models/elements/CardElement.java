package de.virusmc.fakewebsite.models.elements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public class CardElement {
    private String title;
    private String subtitle;
    private String description;
    private ImageElement img;
}
