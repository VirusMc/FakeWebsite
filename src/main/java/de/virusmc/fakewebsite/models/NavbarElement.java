package de.virusmc.fakewebsite.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NavbarElement {

    private String name;
    private String url;
    private boolean active;

}
