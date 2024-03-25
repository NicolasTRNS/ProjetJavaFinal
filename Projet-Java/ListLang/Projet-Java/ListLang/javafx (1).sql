-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 10 jan. 2024 à 17:27
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `javafx`
--

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

DROP TABLE IF EXISTS `clients`;  -- Suppression de la table si elle existe déjà

CREATE TABLE `clients` (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `name` varchar(255) NOT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Insertion des données initiales pour les noms de clients
INSERT INTO `clients` (`name`) VALUES
                                   ('Sofia Ramirez'),
                                   ('Xavier Johnson'),
                                   ('Jasmine Patel');

-- --------------------------------------------------------

--
-- Structure de la table `emails`
--

DROP TABLE IF EXISTS `emails`;  -- Suppression de la table si elle existe déjà

CREATE TABLE `emails` (
                          `id` int(11) NOT NULL AUTO_INCREMENT,
                          `email` varchar(255) NOT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Insertion des données initiales pour les adresses e-mail
INSERT INTO `emails` (`email`) VALUES
                                   ('sofia.ramirez@gmail.com'),
                                   ('xavier.johnson@gmail.com'),
                                   ('jasmine.pastel@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `plants`
--

DROP TABLE IF EXISTS `plants`;  -- Suppression de la table si elle existe déjà

CREATE TABLE `plants` (
                          `id` int(11) NOT NULL AUTO_INCREMENT,
                          `plant_name` varchar(255) NOT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Insertion des données initiales pour les noms de plantes
INSERT INTO `plants` (`plant_name`) VALUES
                                        ('Géranium'),
                                        ('Rosier'),
                                        ('Cactus');

-- --------------------------------------------------------

--
-- Structure de la table `quantities`
--

DROP TABLE IF EXISTS `quantities`;  -- Suppression de la table si elle existe déjà

CREATE TABLE `quantities` (
                              `id` int(11) NOT NULL AUTO_INCREMENT,
                              `quantity` int(11) NOT NULL,
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Insertion des données initiales pour les quantités de plantes
INSERT INTO `quantities` (`quantity`) VALUES
                                          (1),
                                          (2),
                                          (3),
                                          (4),
                                          (5);

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
