package powergirl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import powergirl.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, String> {

}
