package br.com.atividade.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import br.com.atividade.model.LeitoInternacao;
import br.com.atividade.util.JPAResourceBean;

public class LeitoInternacaoBean extends JPAResourceBean {
	
	private LeitoInternacao leitoInternacaoCadastrar;
	
	@PostConstruct
	public void init() {
		leitoInternacaoCadastrar = new LeitoInternacao();
	}

	public List<LeitoInternacao> getListaPacientes(){
		return getEntityManager().createQuery("from LeitoInternacao", LeitoInternacao.class).getResultList();
	}
	
	public void cadastrarLeitoInternacao() {
		try {
			getEntityManager().merge(leitoInternacaoCadastrar);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public LeitoInternacao getLeitoInternacaoCadastrar() {
		return leitoInternacaoCadastrar;
	}

	public void setClinicaCadastrar(LeitoInternacao leitoInternacaoCadastrar) {
		this.leitoInternacaoCadastrar = leitoInternacaoCadastrar;
	}
}
