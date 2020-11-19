package powergirl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import powergirl.domain.Telefone;
public interface TelefoneRepository extends JpaRepository<Telefone, String> { 

}
