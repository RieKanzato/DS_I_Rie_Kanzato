package com.teste.teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TesteController {
	@RequestMapping("/")
	public String teste() {
		return "teste";
	}
}
