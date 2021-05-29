package br.com.dududueedu.investBackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dududueedu.investBackend.domain.Categoria;
import br.com.dududueedu.investBackend.repository.CategoriaRepository;


@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoriaResource {

	// controle de dependencias
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	// requisição de consulta GET
	@GetMapping 
	public List<Categoria> listarTodos(){
		return categoriaRepository.findAll();
	}
	
	// requisição de consulta GET
	@GetMapping("/{codigo}")
	public Categoria buscarPeloCodigo(@PathVariable Long codigo){
		return categoriaRepository.findById(codigo).orElse(null); // se não encontrar, retorne null
	}
	
	// requisição de consulta DELETE
	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable Long codigo){
		categoriaRepository.deleteById(codigo);
	}	
	
	// requisição de consulta POST
	@PostMapping 
	public Categoria cadastrar(@RequestBody Categoria categoria){
		return categoriaRepository.save(categoria);
	}
}