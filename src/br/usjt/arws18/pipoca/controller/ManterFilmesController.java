package br.usjt.arws18.pipoca.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.arws18.pipoca.entity.Filme;
import br.usjt.arws18.pipoca.service.FilmeService;


@Controller
public class ManterFilmesController {
	
	private FilmeService filmeService;
		
	public ManterFilmesController() {
		filmeService = new FilmeService();
	}
	
	@RequestMapping("/novoFilme")
	public String novoFilme() {
		System.out.println("Novo filme");
		return "novoFilme";
	}
	

	@RequestMapping("/inserir")
	public String inserirFilme(Filme filme, Model model) {	
		
		try {
			filme = filmeService.inserirFIlme(filme);
			model.addAttribute("filme", filme);
			return "Resultado";
		} catch (IOException e) {
			e.printStackTrace();
			model.addAttribute("erro", e);
			return "Erro";
		}
	}
	

	
	
}
