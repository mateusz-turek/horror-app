package project4.horrormoviesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project4.horrormoviesapp.model.Horror;
import project4.horrormoviesapp.model.HorrorType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HorrorController {
    private List<Horror> horrorList;

    public HorrorController() {
        this.horrorList = new ArrayList<>();
        horrorList.add(new Horror(1L,"Layers of Fear", HorrorType.game,"Bloober Team"
                , LocalDate.of(2016,2,16)));
        horrorList.add(new Horror(2L,"Outlast", HorrorType.game,"Bloober Team"
                , LocalDate.of(2013,9,4)));
    }

    @GetMapping("/horrors")
        public String horror(Model model){
       Horror layersOfFear =  new Horror(1L,"Layers of Fear", HorrorType.game,"Bloober Team"
                , LocalDate.of(2016,2,16));


        model.addAttribute("horror", layersOfFear); //pojo

        model.addAttribute("horrors", horrorList); //list

        model.addAttribute("newHorror",new Horror());
        return "Horror";
    }
    @PostMapping("/addHorror")
    public String addHorror(@ModelAttribute Horror horror){
        horrorList.add(horror);
        return "redirect:/horrors";
    }
}
