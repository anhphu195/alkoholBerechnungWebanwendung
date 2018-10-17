package alkomat.web;

import alkomat.domain.BAKRechner;
import alkomat.domain.Getraenk;
import alkomat.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/phu")
public class ExampleController {

	@GetMapping("/")
	public String mainpage() {
		return "mainpage";
	}
	@PostMapping("/berechnen")
	public String rechner(Model model, Person person, Getraenk getraenk){
		model.addAttribute("getraenk",getraenk);
		model.addAttribute("person",person);
		BAKRechner bak = new BAKRechner(person,getraenk);
		model.addAttribute("bak",bak);
		return "mainpage";
	}

}
