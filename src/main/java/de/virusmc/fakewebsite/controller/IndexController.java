package de.virusmc.fakewebsite.controller;

import de.virusmc.fakewebsite.models.NavbarElement;
import de.virusmc.fakewebsite.models.PageModel;
import lombok.extern.flogger.Flogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Flogger
public class IndexController {

    private PageModel pageModel = PageModel.builder()
            .title("Fake Website")
            .navbarElements(new NavbarElement[]{
                    NavbarElement.builder()
                            .name("Firma")
                            .url("/?id=generateFirma")
                            .active(false)
                            .build(),
                    NavbarElement.builder()
                            .name("Person")
                            .url("/?id=generatePerson")
                            .active(false)
                            .build(),
                    NavbarElement.builder()
                            .name("Tier")
                            .url("/?id=generateTier")
                            .active(false)
                            .build(),
                    NavbarElement.builder()
                            .name("Buch")
                            .url("/?id=generateBuch")
                            .active(false)
                            .build(),
                    NavbarElement.builder()
                            .name("Wetter")
                            .url("/?id=generateWetter")
                            .active(false)
                            .build(),
                    NavbarElement.builder()
                            .name("Sport Team")
                            .url("/?id=generateSportTeam")
                            .active(false)
                            .build(),
            })
            .build();

    @GetMapping("/")
    public String index(Model model, @RequestParam(required = false) String id) {
        if (id == null) {
            model.addAttribute("page", pageModel);
            return "index";
        } else {
            pageModel.setActive(id);
            model.addAttribute("page", pageModel);
            return "redirect:/#" + id;
        }
    }
}
