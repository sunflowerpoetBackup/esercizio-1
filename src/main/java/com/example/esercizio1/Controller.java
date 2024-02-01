package com.example.esercizio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/v1/ciao")
	public String saluta(@RequestParam String nome, @RequestParam String provincia) {
		return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
	}
}
