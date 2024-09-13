package com.example.ac1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ac1.model.Categoria;
import com.example.ac1.model.Produto;

@SpringBootApplication
public class Ac1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ac1Application.class, args);

		Categoria categoria1 = new Categoria();
		categoria1.setId_categoria(1);
		categoria1.setCat_nome("Monitor");
		categoria1.setCat_descricao("Monitor de computador");

		Categoria categoria2 = new Categoria();
		categoria2.setId_categoria(2);
		categoria2.setCat_nome("Teclado");
		categoria2.setCat_descricao("Teclado de computador");

		Produto produto1 = new Produto();
		produto1.setId_produto(1);
		produto1.setProd_nome("Monitor 1");
		produto1.setProd_descricao("Monitor de 24 polegadas");
		produto1.setCategoria(categoria1);

		Produto produto2 = new Produto();
		produto2.setId_produto(2);
		produto2.setProd_nome("Teclado 1");
		produto2.setProd_descricao("Teclado mecânico");
		produto2.setCategoria(categoria2);

		System.out.println(categoria1);
		System.out.println(categoria2);
		System.out.println(produto1);
		System.out.println(produto2);
	}

}
