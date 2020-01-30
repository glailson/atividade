package br.com.atividade.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author glailson.leoncio
 *
 */
@Entity
@Table(name = "tbleitointernacao")
public class LeitoInternacao implements Serializable{
	private static final long serialVersionUID = 1643349140559763657L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "leiintid")
    private Long id;
	@JoinColumn(name = "leiintpaciente", referencedColumnName = "pacid")
    @ManyToOne
    private Paciente paciente;
	@JoinColumn(name = "leiintleito", referencedColumnName = "leiid")
    @ManyToOne
    private Leito leito;
	@Column(name = "leiintdthrinternacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraInternacao;
	
	public LeitoInternacao() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Leito getLeito() {
		return leito;
	}

	public void setLeito(Leito leito) {
		this.leito = leito;
	}

	public Date getDataHoraInternacao() {
		return dataHoraInternacao;
	}

	public void setDataHoraInternacao(Date dataHoraInternacao) {
		this.dataHoraInternacao = dataHoraInternacao;
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
        LeitoInternacao other = (LeitoInternacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.atividade.entidades.LeitoInternacao[ id=" + id + " ]";
    }

}
