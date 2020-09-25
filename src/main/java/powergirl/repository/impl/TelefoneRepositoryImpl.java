package powergirl.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import powergirl.domain.Telefone;

@Repository
public class TelefoneRepositoryImpl implements AbstractRepository<Telefone> {
	
	
	@Autowired
	private EntityManagerFactory em;
	
	public EntityManager createEntityMenager(){
		EntityManager entityManager = em.createEntityManager();
		return entityManager;
	}

	public Telefone save(Telefone entity) {
		EntityManager menager = createEntityMenager();
		menager.getTransaction().begin();
		menager.persist(entity);
		menager.getTransaction().commit();
		menager.close();
		return entity;
	}

	public Telefone GetById(long id) {
		EntityManager menager = createEntityMenager();
		menager.getTransaction().begin();
		Telefone telefoneBuscado = menager.find(Telefone.class, id);
		menager.close();
		return telefoneBuscado;
	}

	public Telefone remove(Telefone entity) {
		EntityManager menager = createEntityMenager();
		menager.getTransaction().begin();
		menager.remove(entity);
		menager.getTransaction().commit();
		menager.close();
		return entity;
	}
	
}
