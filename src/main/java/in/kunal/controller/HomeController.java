package in.kunal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.kunal.Service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService homeService;
	
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String homePage(Model model) {
		model.addAttribute("topTiles", homeService.getTopTilesMap());
		return "home";
	}	
	
}
