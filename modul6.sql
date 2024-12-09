-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 09, 2024 at 07:46 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_mhs`
--

-- --------------------------------------------------------

--
-- Table structure for table `modul6`
--

CREATE TABLE `modul6` (
  `nim` varchar(12) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jk` enum('L','P') NOT NULL,
  `prodi` varchar(20) NOT NULL,
  `alamat` varchar(60) NOT NULL,
  `kelas` varchar(16) NOT NULL,
  `angkatan` varchar(16) NOT NULL,
  `nohp` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `modul6`
--

INSERT INTO `modul6` (`nim`, `nama`, `jk`, `prodi`, `alamat`, `kelas`, `angkatan`, `nohp`) VALUES
('100', 'Asep Haryana Saputra', 'L', 'TI', 'Kuningan', 'TINFC-2023-04', '2023', '085224954965'),
('101', 'Alya', 'P', 'SI', 'Kuningan', '', '', ''),
('12345678', 'hmm', 'P', 'TI', 'Kuningan', 'TINFC-2023-04', '2023', '085367483926'),
('2023080146', 'adi', 'L', 'TI', 'jambi\n', 'TINFC-2023-04', '23', '0987654321'),
('20230810003', 'Alucard', 'L', 'TI', 'indonesia', 'TINFC-2023-04', '2023', '08345627845'),
('20230810034', 'Hanzo', 'L', 'TI', 'Indonesia', 'TINFC-2023-04', '2023', '081354627884');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `modul6`
--
ALTER TABLE `modul6`
  ADD PRIMARY KEY (`nim`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
