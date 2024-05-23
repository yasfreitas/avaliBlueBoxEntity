package com.avaliacao.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id", nullable = false)
	private Long id;
	
	@Column (name = "cpf", nullable = false, length = 255)
	private String cpf;
	
	@Column (name = "nome", nullable = false, length = 255)
	private String nome;
	
	@Column (name = "salario", nullable = false)
	private double salario;
	
	@Column (name = "telefone", nullable = false, length = 255)
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento", nullable = false)
	private Departamento departamento;

}
