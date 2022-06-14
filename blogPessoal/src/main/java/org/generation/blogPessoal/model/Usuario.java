package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_usuario")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min =2, max =100)
	private String nome;
	
	private String email;
	

	@NotNull
	@Size(min =5, max =100)
	private String usuario;
	
	private String foto;
	

	@NotNull
	@Size(min =5, max =100)
	private String senha;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	
	private List<Postagem> postagem;
	
	
	
	public Usuario(long id, @NotNull @Size(min = 2, max = 100) String nome, String email,
			@NotNull @Size(min = 5, max = 100) String usuario, String foto,
			@NotNull @Size(min = 5, max = 100) String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.usuario = usuario;
		this.foto = foto;
		this.senha = senha;
	}


	public Usuario()
	{
		
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}

	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
