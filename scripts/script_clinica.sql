--Criação do BD para atividade
CREATE DATABASE atividade;
--Criação da sequence para incrementar o id
CREATE SEQUENCE seq_tbclinica
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 100579
  CACHE 1;

CREATE TABLE tbclinica
(
  cliid bigint NOT NULL DEFAULT nextval('seq_tbclinica'::regclass) PRIMARY KEY,
  clidescricao character varying(50) not null,
  cliistleito boolean
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tbclinica
  OWNER TO postgres;
--------------------------------------Leito----------------------------------------

CREATE SEQUENCE seq_tbleito
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 100579
  CACHE 1;

 CREATE TABLE tbleito
(
  leiid bigint NOT NULL DEFAULT nextval('seq_tbleito'::regclass) PRIMARY KEY,
  leidescricao character varying(50) not null,
  leiclinica bigint,
  FOREIGN KEY (leiclinica) REFERENCES tbclinica (cliid)                                               
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tbleito
  OWNER TO postgres;
  
--------------------------------------Paciente---------------------------------------- 
 
CREATE SEQUENCE seq_tbpaciente
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 100579
  CACHE 1;


 CREATE TABLE tbpaciente
(
  pacid bigint NOT NULL DEFAULT nextval('seq_tbpaciente'::regclass) PRIMARY KEY,
  pacnome character varying(50) not null,
  pacdtnascimento TIMESTAMP
  
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tbpaciente
  OWNER TO postgres;


--------------------------------------LeitoInternação----------------------------------------

  CREATE SEQUENCE seq_tbleitointernacao
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 100579
  CACHE 1;


 CREATE TABLE tbleitointernacao
(
  leiintid bigint NOT NULL DEFAULT nextval('seq_tbleitointernacao'::regclass) PRIMARY KEY,
  leiintpaciente bigint,                                                                                            
  leiintleito bigint,                                                         
  leiintdthrinternacao TIMESTAMP,
  FOREIGN KEY (leiintpaciente) REFERENCES tbpaciente (pacid),
  FOREIGN KEY (leiintleito) REFERENCES tbleito (leiid)
  
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tbleitointernacao
  OWNER TO postgres;

 
