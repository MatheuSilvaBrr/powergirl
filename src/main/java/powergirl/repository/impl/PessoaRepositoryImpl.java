package powergirl.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import powergirl.domain.Pessoa;

@Repository
public class PessoaRepositoryImpl implements AbstractRepository<Pessoa> {
	
	@Autowired
	private EntityManagerFactory em;
	
	public EntityManager createEntityMenager(){
		EntityManager entityManager = em.createEntityManager();
		return entityManager;
	}

	public Pessoa save(Pessoa entity) {
		EntityManager menager = createEntityMenager();
		menager.getTransaction().begin();
		menager.persist(entity);
		menager.getTransaction().commit();
		menager.close();
		return entity;
	}


	public Pessoa GetById(long id) {
		EntityManager menager = createEntityMenager();
		menager.getTransaction().begin();
		Pessoa pessoaBuscado = menager.find(Pessoa.class, id);
		menager.close();
		return pessoaBuscado;
	}


	public Pessoa remove(Pessoa entity) {
		EntityManager menager = createEntityMenager();
		menager.getTransaction().begin();
		menager.remove(entity);
		menager.getTransaction().commit();
		menager.close();
		return entity;
	}
}
