package powergirl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import powergirl.domain.Endereco;
import powergirl.repository.EnderecoRepository;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController extends BaseController<Endereco, EnderecoRepository> {

}
