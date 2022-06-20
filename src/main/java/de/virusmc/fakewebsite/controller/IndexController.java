package de.virusmc.fakewebsite.controller;

import de.virusmc.fakewebsite.models.NavbarElement;
import de.virusmc.fakewebsite.models.PageModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping("/empty")
    public ModelAndView empty() {
        return new ModelAndView("components/empty", "page", PageModel.builder()
                .title("Fake Website")
                .navbarElements(new NavbarElement[]{
                        NavbarElement.builder()
                                .name("Home")
                                .url("/")
                                .active(true)
                                .build(),
                        NavbarElement.builder()
                                .name("About")
                                .url("/about")
                                .active(false)
                                .build(),
                        NavbarElement.builder()
                                .name("Contact")
                                .url("/contact")
                                .active(false)
                                .build()
                })
                .build());
    }
}
