-- ================================================
-- Script de creación de la base de datos Cine_DB
-- ================================================

-- 1. Eliminar la base de datos si ya existe
DROP DATABASE IF EXISTS Cine_DB;

-- 2. Crear la base de datos
CREATE DATABASE Cine_DB;

-- 3. Usar la base de datos recién creada
USE Cine_DB;

-- 4. Crear la tabla Cartelera
CREATE TABLE Cartelera (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    director VARCHAR(50) NOT NULL,
    anio INT NOT NULL,
    duracion INT NOT NULL,
    genero VARCHAR(50) NOT NULL
);

-- 5. Insertar películas de prueba
INSERT INTO Cartelera (titulo, director, anio, duracion, genero)
VALUES 
('Matrix', 'Wachowski', 1999, 136, 'Acción'),
('Titanic', 'James Cameron', 1997, 195, 'Drama'),
('Avengers: Endgame', 'Russo Brothers', 2019, 181, 'Acción'),
('Coco', 'Lee Unkrich', 2017, 105, 'Animación'),
('Joker', 'Todd Phillips', 2019, 122, 'Drama'),
('Inception', 'Christopher Nolan', 2010, 148, 'Ciencia Ficción');

-- ================================================
-- Fin del Script
-- ================================================
