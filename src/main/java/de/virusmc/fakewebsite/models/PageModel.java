package de.virusmc.fakewebsite.models;

import lombok.Data;

@Data
public class PageModel {

    private String title;
    private NavbarElement[] navbarElements;
}
