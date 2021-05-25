package br.com.dududueedu.investBackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dududueedu.investBackend.domain.Investimento;
import br.com.dududueedu.investBackend.repository.InvestimentoRepository;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoResource {

	// controle de dependencias
	@Autowired
	private InvestimentoRepository investimentoRepository;
	
	// requisição de consulta GET
	@GetMapping 
	public List<Investimento> listarTodos(){
		return investimentoRepository.findAll();
	}

	// requisição de consulta GET
	@GetMapping("/{codigo}")
	public Investimento buscarPeloCodigo(@PathVariable Long codigo){
		return investimentoRepository.findById(codigo).orElse(null); // se não encontrar, retorne null
	}
	
	// requisição de consulta DELETE
	@DeleteMapping 
	public void remover(@PathVariable Long codigo){
		investimentoRepository.deleteById(codigo);
	}	
	
	// requisição de consulta POST
	@PostMapping 
	public Investimento cadastrar(@RequestBody Investimento investimento){
		return investimentoRepository.save(investimento);
	}
}