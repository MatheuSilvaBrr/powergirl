package powergirl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import powergirl.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, String> {

}
