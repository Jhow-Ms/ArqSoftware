package br.usjt.arws18.pipoca.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arws18.pipoca.dao.*;
import br.usjt.arws18.pipoca.entity.*;

public class GeneroService {
	
	private GeneroDAO dao;
	
	public GeneroService() {
		this.dao = new GeneroDAO();
	}
	
	public Genero buscarGenero(int id) throws IOException {
		return dao.buscarGenero(id);
	}
	
	public ArrayList<Genero> listarGeneros() throws IOException{
		return dao.listarGeneros();
	}

}
