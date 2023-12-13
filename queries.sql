use prueba;
CREATE TABLE tienda (
  idTienda decimal(10,0) NOT NULL,
  nombreTienda varchar(35) NOT NULL,
  horarioTienda varchar(35) DEFAULT NULL,
  PRIMARY KEY (idTienda)
)  ;
EXEC ProcesoTablaCreada;
INSERT INTO tienda VALUES (1,'Sucursal Diprova Norte','9:00 AM - 8:00 PM');
INSERT INTO tienda VALUES (2,'Sucursal Diprova Sur','8:30 AM - 7:30 PM');
INSERT INTO tienda VALUES (3,'Sucursal Diprova Este','10:00 AM - 9:00 PM');
INSERT INTO tienda VALUES (4,'Sucursal Diprova Oeste','8:00 AM - 10:00 PM');
INSERT INTO tienda VALUES (5,'Sucursal Diprova Central','9:30 AM - 8:30 PM');
INSERT INTO tienda VALUES (6,'Sucursal Diprova Plaza','10:00 AM - 7:00 PM');
INSERT INTO tienda VALUES (7,'Sucursal Diprova Mega','7:00 AM - 9:00 PM');
INSERT INTO tienda VALUES (8,'Sucursal Diprova Express','8:30 AM - 6:30 PM');
INSERT INTO tienda VALUES (9,'Sucursal Diprova Super','9:00 AM - 9:00 PM');
INSERT INTO tienda VALUES (10,'Sucursal Diprova Premium','8:00 AM - 10:00 PM');
