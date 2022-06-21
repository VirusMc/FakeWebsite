package de.virusmc.fakewebsite.controller;

import de.virusmc.fakewebsite.services.FirmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirmController {

    public final FirmService firmService;

    public FirmController(FirmService firmService) {
        this.firmService = firmService;
    }

    @GetMapping("/firm")
    public String firm(Model model) {
        model.addAttribute("page", firmService.getFirmPageModel());
        return "firm";
    }
}
