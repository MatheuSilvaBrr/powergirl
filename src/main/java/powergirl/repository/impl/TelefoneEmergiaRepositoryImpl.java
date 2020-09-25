package powergirl.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import powergirl.domain.TelefoneEmergencia;

@Repository
public class TelefoneEmergiaRepositoryImpl implements AbstractRepository<TelefoneEmergencia>{

	@Autowired
	private EntityManagerFactory em;
	
	public EntityManager createEntityMenager(){
		EntityManager entityManager = em.createEntityManager();
		return entityManager;
	}
	
	public TelefoneEmergencia save(TelefoneEmergencia entity) {
		EntityManager menager = createEntityMenager();
		menager.getTransaction().begin();
		menager.persist(entity);
		menager.getTransaction().commit();
		menager.close();
		return entity;
	}

	public TelefoneEmergencia GetById(long id) {
		EntityManager menager = createEntityMenager();
		menager.getTransaction().begin();
		TelefoneEmergencia telefoneBuscado = menager.find(TelefoneEmergencia.class, id);
		menager.close();
		return telefoneBuscado;
	}

	public TelefoneEmergencia remove(TelefoneEmergencia entity) {
		EntityManager menager = createEntityMenager();
		menager.getTransaction().begin();
		menager.remove(entity);
		menager.getTransaction().commit();
		menager.close();
		return entity;
	}

}
