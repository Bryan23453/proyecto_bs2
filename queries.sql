use prueba;
CREATE TABLE cliente (
  idCliente decimal(10,0) NOT NULL,
  nombreCliente varchar DEFAULT NULL,
  correo varchar DEFAULT NULL,
  PRIMARY KEY (idCliente)
)  ;
INSERT INTO cliente VALUES (1,'Juan Perez','juan.perez@example.com');
INSERT INTO cliente VALUES (2,'Maria Gonzalez','maria.gonzalez@example.com');
INSERT INTO cliente VALUES (3,'Carlos Sanchez','carlos.sanchez@example.com');
INSERT INTO cliente VALUES (4,'Laura Martinez','laura.martinez@example.com');
INSERT INTO cliente VALUES (5,'Pedro Rodriguez','pedro.rodriguez@example.com');
INSERT INTO cliente VALUES (6,'Ana Lopez','ana.lopez@example.com');
INSERT INTO cliente VALUES (7,'Miguel Gomez','miguel.gomez@example.com');
INSERT INTO cliente VALUES (8,'Luisa Diaz','luisa.diaz@example.com');
INSERT INTO cliente VALUES (9,'Javier Fernandez','javier.fernandez@example.com');
INSERT INTO cliente VALUES (10,'Carmen Ruiz','carmen.ruiz@example.com');
