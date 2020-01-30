package br.com.atividade.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author glailson.leoncio
 *
 */
@Entity
@Table(name = "tblpaciente")
public class Paciente implements Serializable{
	private static final long serialVersionUID = 1643349140559763657L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pacid")
    private Long id;
	@Column(name = "pacnome")
    private String nome;
	@Column(name = "pacdtnascimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraCriacao;
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataHoraCriacao() {
		return dataHoraCriacao;
	}

	public void setDataHoraCriacao(Date dataHoraCriacao) {
		this.dataHoraCriacao = dataHoraCriacao;
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
        Paciente other = (Paciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.atividade.entidades.Paciente[ id=" + id + " ]";
    }
}
