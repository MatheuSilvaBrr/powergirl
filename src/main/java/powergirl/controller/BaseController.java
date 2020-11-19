package powergirl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import powergirl.domain.BaseEntity;
import powergirl.exception.IdParametroDiferenteIdEntitidade;
import powergirl.exception.RegistroDuplicadoException;
import powergirl.exception.RegistroNaoEncontradoException;

public class BaseController<ENTITY extends BaseEntity, REPOSITORY extends JpaRepository<ENTITY, String>> {
	
	@Autowired
    private REPOSITORY repo;

    @GetMapping
    public List<ENTITY> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public BaseEntity getById(@PathVariable String id) {
        return repo.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        repo.deleteById(id);
    }
    
    @PutMapping("/{id}")
	public void put(@PathVariable String id, @RequestBody ENTITY entityUpdate) {
    	
    	if(!id.equals(entityUpdate.getId())) {
    		throw new IdParametroDiferenteIdEntitidade("Identificador passado como parâmetro é diferente do identificador da entidade pessoa");
    	}
		Optional<ENTITY> entityBuscado = repo.findById(id);
    	if(!entityBuscado.isPresent()) {
    		throw new RegistroNaoEncontradoException("Registro não encontrado");
    	}
    	repo.save(entityUpdate);
	}
    
    @PostMapping
    public ENTITY post(@RequestBody ENTITY entity) {
    	if(repo.findById(entity.getId()).isPresent()) {
    		throw new RegistroDuplicadoException("Registro duplicado, j� existe um registro para esse identificador:" + entity.getId());
    	}
        return repo.save(entity);
    }
}
