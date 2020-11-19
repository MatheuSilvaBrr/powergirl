package powergirl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import powergirl.domain.Telefone;
import powergirl.repository.TelefoneRepository;

@RestController
@RequestMapping("/api/telefone")
public class TelefoneController extends BaseController<Telefone, TelefoneRepository> {
}
