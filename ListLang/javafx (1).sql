-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le : mar. 02 avr. 2024 à 10:14
-- Version du serveur : 8.0.30
-- Version de PHP : 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `projet_java_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

CREATE TABLE `clients` (
                           `id` int NOT NULL,
                           `name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `clients`
--

INSERT INTO `clients` (`id`, `name`) VALUES
                                         (1, 'Sofia Ramirez'),
                                         (2, 'Xavier Johnson'),
                                         (3, 'Jasmine Patel');

-- --------------------------------------------------------

--
-- Structure de la table `emails`
--

CREATE TABLE `emails` (
                          `id` int NOT NULL,
                          `email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `emails`
--

INSERT INTO `emails` (`id`, `email`) VALUES
                                         (1, 'sofia.ramirez@gmail.com'),
                                         (2, 'xavier.johnson@gmail.com'),
                                         (3, 'jasmine.pastel@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `plants`
--

CREATE TABLE `plants` (
                          `id` int NOT NULL,
                          `plant_name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `plants`
--

INSERT INTO `plants` (`id`, `plant_name`) VALUES
                                              (1, 'Géranium'),
                                              (2, 'Rosier'),
                                              (3, 'Cactus');

-- --------------------------------------------------------

--
-- Structure de la table `quantities`
--

CREATE TABLE `quantities` (
                              `id` int NOT NULL,
                              `quantity` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `quantities`
--

INSERT INTO `quantities` (`id`, `quantity`) VALUES
                                                (1, 1),
                                                (2, 2),
                                                (3, 3),
                                                (4, 4),
                                                (5, 5);

-- --------------------------------------------------------

--
-- Structure de la table `tasks`
--

CREATE TABLE `tasks` (
                         `id` int NOT NULL,
                         `name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
                         `is_active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users` (
                         `id` int NOT NULL,
                         `username` varchar(255) NOT NULL,
                         `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
                                                       (56, 'erer@gmail.com', 'efeesf'),
                                                       (57, 'dsiuvsefiusef@gmail.com', 'efeezfefzezf'),
                                                       (58, 'risjthrth@gmail.com', 'sefsefsef'),
                                                       (59, 'dgrhgydhrg@gmail.com', 'sefsefse'),
                                                       (60, 'oise@gmail.com', 'ssefsef'),
                                                       (61, 'dgrrgrg@gmail.com', 'seesfse'),
                                                       (92, 'z', 'z'),
                                                       (93, 'j', 'j'),
                                                       (94, 'b', 'b'),
                                                       (95, 'm', 'm'),
                                                       (96, 'm', 'm'),
                                                       (97, 'm', 'm'),
                                                       (98, 'g', 'g'),
                                                       (99, 'g', 'g'),
                                                       (100, 'f', 'f'),
                                                       (101, 'dzd', 'dzd'),
                                                       (102, 'dzd', 'dzd'),
                                                       (103, 'dzd', 'dzd'),
                                                       (104, 'd', 'd'),
                                                       (105, 'd', 'd'),
                                                       (106, 'd', 'd'),
                                                       (107, 'z', 'z'),
                                                       (108, 'z', 'z'),
                                                       (109, 'a', 'a'),
                                                       (110, '2000', '2000'),
                                                       (111, 'pp', '^^'),
                                                       (112, 'p', 'p'),
                                                       (113, '0', '0'),
                                                       (114, 'g', 'g'),
                                                       (115, 'r', 'r'),
                                                       (116, 'r', 'r'),
                                                       (117, 'j', 'j'),
                                                       (118, 'j', 'j'),
                                                       (119, 'f', 'f'),
                                                       (120, 'g', 'g'),
                                                       (121, 'r', 'r'),
                                                       (122, 'j', 'j'),
                                                       (123, 'yth', 'rtybh'),
                                                       (124, 'rgrtg', 'rtgrtg'),
                                                       (125, 'yuj', 'yujy'),
                                                       (126, 'efe', 'fef');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `clients`
--
ALTER TABLE `clients`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `emails`
--
ALTER TABLE `emails`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `plants`
--
ALTER TABLE `plants`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `quantities`
--
ALTER TABLE `quantities`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `tasks`
--
ALTER TABLE `tasks`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `users`
--
ALTER TABLE `users`
    ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `clients`
--
ALTER TABLE `clients`
    MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `emails`
--
ALTER TABLE `emails`
    MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `plants`
--
ALTER TABLE `plants`
    MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `quantities`
--
ALTER TABLE `quantities`
    MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `tasks`
--
ALTER TABLE `tasks`
    MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `users`
--
ALTER TABLE `users`
    MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=127;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
