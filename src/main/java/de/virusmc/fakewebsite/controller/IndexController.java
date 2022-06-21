package de.virusmc.fakewebsite.controller;

import de.virusmc.fakewebsite.models.index.IndexPageModel;
import de.virusmc.fakewebsite.services.IndexService;
import lombok.extern.flogger.Flogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Flogger
public class IndexController {

    private final IndexService indexService;

    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(required = false) String id) {
        IndexPageModel indexPageModel = indexService.getIndexPageModel();

        if (id == null) {
            model.addAttribute("page", indexPageModel);
            return "index";
        } else {
            indexPageModel.setActiveNavbarElement(id);
            model.addAttribute("page", indexPageModel);
            return "redirect:/#" + id;
        }
    }
}
