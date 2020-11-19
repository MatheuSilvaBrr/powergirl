package powergirl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import powergirl.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {
	
}
