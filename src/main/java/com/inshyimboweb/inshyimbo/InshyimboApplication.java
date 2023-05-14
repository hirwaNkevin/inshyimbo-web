package com.inshyimboweb.inshyimbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class InshyimboApplication {

	@RequestMapping("/home")
    public String index(Model model){
        model.addAttribute("message", "Hello World!");
        return "index";
    }
	public static void main(String[] args) {
		SpringApplication.run(InshyimboApplication.class, args);
	}

}
