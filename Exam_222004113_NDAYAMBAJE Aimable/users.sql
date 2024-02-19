-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 09:47 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tourism_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(10) NOT NULL,
  `first_name` varchar(30) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone_number` varchar(15) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `first_name`, `last_name`, `email`, `phone_number`, `password`) VALUES
(1, 'Aimable', 'NDAYAMBAJE', 'aimable@gmail.com', '0788844330', 'aimable'),
(2, 'Eric', 'MUHOZA', 'eric@gmail.com', '0788225000', 'eric'),
(3, 'Germain', 'GATETE', 'germain@gmail.com', '0788225018', 'germain'),
(4, 'Alice', 'IYAMUDUHAYE', 'alice@gmail.com', '0782133412', 'alice'),
(5, 'Gilbert', 'MUKUNDWA', 'gilbert@gmail.com', '0784176419', 'gilbert'),
(6, 'Patric', 'NTWARI', 'pazzo@gmail.com', '0788235587', 'pazzo'),
(8, 'Cephas', 'SHAMI', 'cephas@gmail.com', '0799933400', 'cephas'),
(9, 'Ainitha', 'UWERA', 'anitha@gmail.com', '0733456789', 'anitha'),
(10, 'Soso', 'UMUHIRE', 'soso@gmail.com', '0782317696', 'soso'),
(11, 'Aimable', 'NDAYAMBAJE', 'Aimable', '0796887671', '222004113');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
