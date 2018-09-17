package br.usjt.arws18.pipoca.service;


import java.io.IOException;


import br.usjt.arws18.pipoca.dao.FilmeDAO;
import br.usjt.arws18.pipoca.entity.Filme;
import br.usjt.arws18.pipoca.entity.Genero;

public class FilmeService {
	
	private FilmeDAO dao;
	
	public FilmeService() {
		dao = new FilmeDAO();
	}
	
	public Filme buscarFilme(int id) throws IOException{
		return dao.buscarFilme(id);
	}

	public Filme inserirFIlme(Filme filme) throws IOException{	
				
		int id = dao.inserirFilme(filme);
		filme.setID(id);
		GeneroService service = new GeneroService();
		Genero genero = service.buscarGenero(filme.getGenero().getId());
		filme.setGenero(genero);
		return filme;
	}
	
	
}
