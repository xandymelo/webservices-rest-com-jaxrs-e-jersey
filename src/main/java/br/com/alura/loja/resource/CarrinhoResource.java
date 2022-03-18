package br.com.alura.loja.resource;

import javax.ws.rs.Path;

import br.com.alura.loja.dao.CarrinhoDAO;

@Path("carrinhos")
public class CarrinhoResource {
	public String busca() {
		CarrinhoDAO carrinho = new CarrinhoDAO().busca(11);
		
		
	}
}
