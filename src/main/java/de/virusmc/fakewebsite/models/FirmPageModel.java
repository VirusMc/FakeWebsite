package de.virusmc.fakewebsite.models;

import de.virusmc.fakewebsite.models.elements.PageModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class FirmPageModel extends PageModel {
    private String address;
    private String telephone;
    private String industry;
    private String catchPhrase;
}

