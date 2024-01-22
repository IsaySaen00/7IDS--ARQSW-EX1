-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-01-2024 a las 18:13:07
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE DATABASE saludos;
use saludos;


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `saludos`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `nombreDelProcedimiento` (IN `msg` VARCHAR(255), IN `idr` INT)   BEGIN
    UPDATE mensaje SET nom = msg WHERE id = idr;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_delete` (IN `idr` INT)   BEGIN
    DELETE FROM mensaje WHERE id = idr;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert` (IN `msg` VARCHAR(255))   BEGIN
    INSERT INTO mensaje VALUES (null, msg);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select` ()   BEGIN
    SELECT * FROM mensaje;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_update` (IN `msg` VARCHAR(255), IN `idr` INT)   BEGIN
    UPDATE mensaje SET nom = msg WHERE id = idr;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensaje`
--

CREATE TABLE `mensaje` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `mensaje`
--

INSERT INTO `mensaje` (`id`, `nom`) VALUES
(2, 'did you know'),
(4, 'Hola amigos como estan'),
(5, 'I kinda like it');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `mensaje`
--
ALTER TABLE `mensaje`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mensaje`
--
ALTER TABLE `mensaje`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
