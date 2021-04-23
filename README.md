# Servicio Alimentos
# CREACIÓN DE TABLA ALIMENTOS DE MANERA LOCAL MYSQL
# Nombre Base de Datos: alimentos_sw

create table ALIMENTOS ( id int (5) NOT NULL AUTO_INCREMENT primary key, nombre varchar(30) UNIQUE NOT NULL, descripcion char(32) NOT NULL,precio int (5) NOT NULL,cantidad_existente int (5) NOT NULL, fecha-elaboracion varchar(10) NOT NULL, fecha_caducidad varchar(10) NOT NULL, categoria varchar (20) NOT NULL) ENGINE=InnoDB 
