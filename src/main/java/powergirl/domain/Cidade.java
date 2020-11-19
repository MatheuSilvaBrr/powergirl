package powergirl.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@Entity
public class Cidade  extends BaseEntity{
	@NotNull
	private String nome;
	@Enumerated(EnumType.STRING)
	@NotNull
	private Estado estado;
	
	public Cidade() {}
	public Cidade(String nome, Estado estado) {
		this.nome = nome;
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
