create database Cafeteria;

use Cafeteria;

-- Tabla de productos
CREATE TABLE productos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  precio FLOAT NOT NULL,
  alergeno VARCHAR(50),
  stock INT NOT NULL
);

-- Tabla de caja
CREATE TABLE caja (
  id INT PRIMARY KEY AUTO_INCREMENT,
  pagado_efectivo BOOLEAN NOT NULL DEFAULT 0,
  pagado_tarjeta BOOLEAN NOT NULL DEFAULT 0
);

-- Tabla de tickets
CREATE TABLE tickets (
  id INT PRIMARY KEY AUTO_INCREMENT,
  pagado BOOLEAN NOT NULL DEFAULT 0,
  caja_id INT,
  foreign key (caja_id) references caja(id)
);

-- Tabla intermedia entre productos y tickets
CREATE TABLE ticket_productos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  ticket_id INT NOT NULL,
  producto_id INT NOT NULL,
  cantidad INT NOT NULL,
  FOREIGN KEY (ticket_id) REFERENCES tickets(id),
  FOREIGN KEY (producto_id) REFERENCES productos(id)
);