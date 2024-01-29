CREATE TABLE veiculos (
    id bigint NOT NULL AUTO_INCREMENT,
    proprietario varchar(100) NOT NULL,
    cpf varchar(100) NOT NULL UNIQUE,
    placa varchar(10) NOT NULL UNIQUE,
    marca varchar(100) NOT NULL,
    modelo varchar(100) NOT NULL,
    chassi varchar(100) NOT NULL,
    licenciado varchar(9) NOT NULL,
    PRIMARY KEY (id)
);