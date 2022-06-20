package de.virusmc.fakewebsite.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PageModel {

    private String title;
    private NavbarElement[] navbarElements;
}
