package powergirl.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pessoa")
public class Pessoa extends BaseEntity{

	@NotBlank(message = "Nome deve ser obrigatório")
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@NotNull(message = "Telefone � obrigat�rio")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Telefone> telefones;
	
	@NotNull
	@ManyToOne
	private Telefone telefonesEmergencia;
	
	@NotNull
	@ManyToOne
	private Endereco endereco;

	public Pessoa(String nome, Endereco endereco, Telefone telefoneEmergencia) {
		this.nome = nome;
		this.telefonesEmergencia = telefoneEmergencia;
		this.telefones = new ArrayList<Telefone>();
		this.endereco = endereco;
	}
	public Pessoa() {
		super();
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return Collections.unmodifiableList(telefones);
	}
	
	public void adicionarTelefone(Telefone telefone){
		this.telefones.add(telefone);
	}
}
