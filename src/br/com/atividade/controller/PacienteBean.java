package br.com.atividade.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import br.com.atividade.model.Paciente;
import br.com.atividade.util.JPAResourceBean;

public class PacienteBean extends JPAResourceBean {
	
	private Paciente pacienteCadastrar;
	
	@PostConstruct
	public void init() {
		pacienteCadastrar = new Paciente();
	}

	public List<Paciente> getListaPacientes(){
		return getEntityManager().createQuery("from Paciente", Paciente.class).getResultList();
	}
	
	public void cadastrarPaciente() {
		try {
			getEntityManager().merge(pacienteCadastrar);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Paciente getPacienteCadastrar() {
		return pacienteCadastrar;
	}

	public void setClinicaCadastrar(Paciente pacienteCadastrar) {
		this.pacienteCadastrar = pacienteCadastrar;
	}
}
