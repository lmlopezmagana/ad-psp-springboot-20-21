-- create table producto (id bigint not null, nombre varchar(255), precio double not null, unidades_en_stock integer not null, primary key (id))

INSERT INTO PRODUCTO (ID, NOMBRE, PRECIO, UNIDADES_EN_STOCK)
VALUES (NEXTVAL('hibernate_sequence'), 'Botellines',9.0, 100);

INSERT INTO PRODUCTO (ID, NOMBRE, PRECIO, UNIDADES_EN_STOCK)
VALUES (NEXTVAL('hibernate_sequence'), 'Sobre de 100g Jamón Ibérico',10.5, 60);

INSERT INTO PRODUCTO (ID, NOMBRE, PRECIO, UNIDADES_EN_STOCK)
VALUES (NEXTVAL('hibernate_sequence'), 'Regañás de Cañada Rosal', 3.25, 120);

