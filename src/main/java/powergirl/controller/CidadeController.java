package powergirl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import powergirl.domain.Cidade;
import powergirl.repository.CidadeRepository;

@RestController
@RequestMapping("/api/cidade")
public class CidadeController extends BaseController<Cidade, CidadeRepository> {

}
