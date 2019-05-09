package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import servcice.PersonaService;

@Controller
public class PersonaController {

   @Autowired
   PersonaService personaService;

   @GetMapping({"/","/index"})
   public String index(){return "index";}

   @GetMapping("/persona")
   public String getPersonas(Model model){
       model.addAttribute("persona",personaService.gelAll());
      return "persona";
   }

}
