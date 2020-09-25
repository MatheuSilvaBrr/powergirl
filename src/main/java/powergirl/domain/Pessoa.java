package powergirl.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Nome deve ser obrigatÃ³rio")
	@Column(name = "nome", nullable = false)
	private String nome;
	
	
	@NotNull(message = "Telefone é obrigatório")
	@Column(name = "telefone_id", nullable = false)
	@OneToOne(cascade = CascadeType.ALL)
	private Telefone numeroTelefone;
	
	@NotBlank
	@OneToMany(mappedBy = "pessoa")
	@JoinColumn(name =  "pessoa_id")
	private List<TelefoneEmergencia> telefonesEmergencia;

	public Pessoa(String nome, Telefone numeroTelefone) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.telefonesEmergencia = new ArrayList<TelefoneEmergencia>();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<TelefoneEmergencia> getTelefonesEmergencia() {
		return Collections.unmodifiableList(telefonesEmergencia);
	}
	
	public void adicionarTelefoneEmergial(TelefoneEmergencia telefoneEmergencia){
		this.telefonesEmergencia.add(telefoneEmergencia);
	}
}
