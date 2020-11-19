package powergirl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import powergirl.domain.Pessoa;
import powergirl.repository.PessoaRepository;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController extends BaseController<Pessoa, PessoaRepository> {
	
}


