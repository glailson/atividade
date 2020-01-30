package br.com.atividade.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import br.com.atividade.model.Clinica;
import br.com.atividade.util.JPAResourceBean;

public class ClinicaBean extends JPAResourceBean {
	
	private Clinica clinicaCadastrar;
	
	@PostConstruct
	public void init() {
		clinicaCadastrar = new Clinica();
	}

	public List<Clinica> getListaClinicas(){
		return getEntityManager().createQuery("from Clinica", Clinica.class).getResultList();
	}
	
	public void cadastrarClinica() {
		try {
			getEntityManager().merge(clinicaCadastrar);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Clinica getClinicaCadastrar() {
		return clinicaCadastrar;
	}

	public void setClinicaCadastrar(Clinica clinicaCadastrar) {
		this.clinicaCadastrar = clinicaCadastrar;
	}

}