CREATE TABLE vinho(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	volume VARCHAR(20) NOT NULL,
	nome VARCHAR(100) NOT NULL,
	descricao TEXT
)ENGINE=innoDB DEFAULT CHARSET=utf8;
