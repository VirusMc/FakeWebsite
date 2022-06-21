package de.virusmc.fakewebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirmController {

    @GetMapping("/firm")
    public String firm(Model model) {
        model.addAttribute("page", "test");
        return "firm";
    }
}
