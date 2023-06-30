package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosProcedimento;


@RestController
@RequestMapping("/procedimentos")
public class ProcedimentosController {
    List<DadosProcedimento>procedimentos = new ArrayList<>();

    @GetMapping
    private List<DadosProcedimento> obterListaProcedimentos() {
        return procedimentos;
    }
    @GetMapping("/{descricao}")
    private String requisicaoGetComParametro(@PathVariable String descricao){
        
       return String.format("Pagina com Inforamções sobre %s", descricao);

    }

    @PostMapping
	private String requisicaoPost(@RequestBody DadosProcedimento procedimento){
       procedimentos.add(procedimento);
		return String.format("Requisição post com o nome %s", procedimento.descricao());
	}





}
