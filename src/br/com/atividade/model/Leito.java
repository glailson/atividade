package br.com.atividade.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author glailson.leoncio
 *
 */
@Entity
@Table(name = "tbleito")
public class Leito implements Serializable{
	private static final long serialVersionUID = 1643349140559763657L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "leiid")
    private Long id;
	@Column(name = "leidescricao")
    private String descricao;
	@JoinColumn(name = "leiclinica", referencedColumnName = "cliid")
    @ManyToOne
    private Clinica clinica;
	
	public Leito() {
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

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
	}

	@Override
    public boolean equals(Object object) {
        if (!(object instanceof Leito)) {
            return false;
        }
        Leito other = (Leito) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.atividade.entidades.Leito[ id=" + id + " ]";
    }
	

}
