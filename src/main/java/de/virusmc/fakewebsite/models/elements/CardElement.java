package de.virusmc.fakewebsite.models.elements;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CardElement {
    private String title;
    private String subtitle;
    private String description;
    private ImageElement img;
}
