package de.virusmc.fakewebsite.models.index;

import de.virusmc.fakewebsite.models.elements.CardElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class IndexContentModel extends CardElement {
    private String url;
}
