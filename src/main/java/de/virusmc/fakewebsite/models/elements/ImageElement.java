package de.virusmc.fakewebsite.models.elements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@AllArgsConstructor
@Builder
public class ImageElement {
    public String src;
    public String alt;
}
