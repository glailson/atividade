package br.com.atividade.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import br.com.atividade.model.Leito;
import br.com.atividade.util.JPAResourceBean;

public class LeitoBean extends JPAResourceBean {
	
private Leito leitoCadastrar;
	
	@PostConstruct
	public void init() {
		leitoCadastrar = new Leito();
	}

	public List<Leito> getListaPacientes(){
		return getEntityManager().createQuery("from Leito", Leito.class).getResultList();
	}
	
	public void cadastrarLeito() {
		try {
			getEntityManager().merge(leitoCadastrar);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Leito getPacienteCadastrar() {
		return leitoCadastrar;
	}

	public void setClinicaCadastrar(Leito leitoCadastrar) {
		this.leitoCadastrar = leitoCadastrar;
	}

}
