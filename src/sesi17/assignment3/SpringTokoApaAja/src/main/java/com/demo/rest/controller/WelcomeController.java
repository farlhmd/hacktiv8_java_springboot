package src.sesi17.assignment3.SpringTokoApaAja.src.main.java.com.demo.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public String helloPage() {
		return "index";
	}

}
