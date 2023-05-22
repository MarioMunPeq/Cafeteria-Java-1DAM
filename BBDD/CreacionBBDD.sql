drop database Cafeteria;
-- Se borra en caso de que ya exista una
create database Cafeteria;

use Cafeteria;

-- Tabla de productos
CREATE TABLE productos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  precio double NOT NULL,
  alergeno VARCHAR(50),
  stock INT NOT NULL
);

-- Tabla de caja
CREATE TABLE caja (
  id INT PRIMARY KEY AUTO_INCREMENT,
  dinero double,
  fecha DATE -- Formato YYYY-MM-DD
);

-- Tabla de tickets
CREATE TABLE tickets (
  id INT PRIMARY KEY AUTO_INCREMENT,
  pagado BOOLEAN NOT NULL DEFAULT FALSE,
  pagado_tarjeta BOOLEAN NOT NULL DEFAULT FALSE,
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


-- Se borran todos los datos, por si no estuviese vacío
INSERT INTO
  productos (nombre, precio, alergeno, stock)
VALUES
  ('Café solo', 1.4, Null, 300),	
  ('Café cortado', 1.4, 'Lactosa', 300),
  ('Café leche', 1.4, 'Lactosa', 300),
  ('Capuchino', 2.2, 'Lactosa/canela', 300),
  ('Café bombon', 2.4, 'Lactosa/canela', 300),
  ('Supra caramel', 2.6, 'Lactosa', 300),
  ('Café con beilys', 3, 'Lactosa/alcohólico', 300),
  ('Shakerato', 2.4, Null, 300),
  ('Te rojo', 1.6, Null, 300),
  ('Te verde', 1.6, Null, 300),
  ('Te negro', 1.6, Null, 300),
  ('Te azul', 1.6, Null, 300),
  ('Rooibos', 1.6, Null, 300),
  ('Frutos rojos', 1.6, Null, 300),
  ('Frtuas del pacifico', 1.6, Null, 300),
  ('Manzanilla', 1.6, Null, 300),
  ('Mentapoleo', 1.6, Null, 300),
  ('Tila', 1.6, Null, 300),
  ('Chai vanilla', 2.4, 'Lactosa', 300),
  ('Matcha', 1.8, Null, 300),
  ('Coca-cola', 2.4, Null, 300),
  ('Fanta naranja', 2.4, Null, 300),
  ('Fanta limon', 2.4, Null, 300),
  ('Acuarius', 2.4, Null, 300),
  ('Sprite', 2.4, Null, 300),
  ('Nestea', 2.4, Null, 300),
  ('Agua con gas', 1.4, Null, 300),
  ('Agua', 1.6, Null, 300),
  ('Caña', 1.8, Null, 300),
  ('Corto', 1, Null, 300),
  ('Cañon', 2.4, Null, 300),
  ('Vinjo tinto', 2, Null, 300),
  ('Vino blanco', 1.6, Null, 300),
  ('Vino rosado', 1.8, Null, 300),
  ('Martini rojo', 2, Null, 300),
  ('Tosta aceite y tomate',1.2,"Gluten/tomate",300),
  ('Tosta jamon', 1.8, "Gluten/tomate", 300),
  ('Tosta aguacate', 1.6, "Gluten", 300),
  ('Tarta queso', 2.1, "Gluten", 300),
  ('Mermelada', 2.1, "Gluten", 300),
  ('Bizcocho', 1.6, "Gluten", 300),
  ('Donut', 1.5, "Gluten", 300),
  ('Tortilla', 1.6, "Huevo", 300),
  ('pulguita', 1.2, "Gluten", 300),
  ('Bocadillo tortilla', 1.2, "Huevo/Gluten", 300);
  
  