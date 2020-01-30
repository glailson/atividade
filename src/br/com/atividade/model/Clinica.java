package br.com.atividade.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author glailson.leoncio
 *
 */
@Entity
@Table(name = "tbclinica")
public class Clinica implements Serializable{
	private static final long serialVersionUID = 1643349140559763657L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliid")
    private Long id;
	@Column(name = "clidescricao")
    private String descricao;
	@Column(name = "cliistleito")
	private Boolean lstLeito;
	@OneToMany(mappedBy = "clinica")
    private List<Leito> leitoList;
	
	public Clinica() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getLstLeito() {
		return lstLeito;
	}

	public void setLstLeito(Boolean lstLeito) {
		this.lstLeito = lstLeito;
	}

	public List<Leito> getLeitoList() {
		return leitoList;
	}

	public void setLeitoList(List<Leito> leitoList) {
		this.leitoList = leitoList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
	}

	@Override
    public boolean equals(Object object) {
        if (!(object instanceof Clinica)) {
            return false;
        }
        Clinica other = (Clinica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.atividade.entidades.Clinica[ id=" + id + " ]";
    }

}
