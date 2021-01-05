-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2021 at 08:32 AM
-- Server version: 10.1.40-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `api_log`
--

-- --------------------------------------------------------

--
-- Table structure for table `apilogs`
--

CREATE TABLE `apilogs` (
  `adminID` text NOT NULL,
  `callDate` date NOT NULL,
  `callTime` time NOT NULL,
  `result` text NOT NULL,
  `errorCount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `apilogs`
--

INSERT INTO `apilogs` (`adminID`, `callDate`, `callTime`, `result`, `errorCount`) VALUES
('admin_1', '2021-01-05', '00:10:34', 'success', 0),
('admin_1', '2021-01-05', '00:13:56', 'success', 0),
('admin_1', '2021-01-05', '01:46:25', 'success', 0),
('admin_1', '2021-01-05', '01:46:52', 'success', 0),
('admin_1', '2021-01-05', '01:46:57', 'success', 0),
('admin_1', '2021-01-05', '01:49:13', 'success', 0),
('admin_1', '2021-01-05', '01:49:26', 'success', 0),
('admin_1', '2021-01-05', '01:49:40', 'success', 0),
('admin_1', '2021-01-05', '01:52:15', 'success', 0),
('admin_1', '2021-01-05', '01:58:46', 'success', 0),
('admin_1', '2021-01-05', '01:59:01', 'success', 0),
('admin_1', '2021-01-05', '02:04:29', 'success', 0),
('admin_1', '2021-01-05', '02:04:37', 'success', 0),
('admin_1', '2021-01-05', '02:05:21', 'success', 0),
('admin_1', '2021-01-05', '02:10:32', 'success', 0),
('admin_1', '2021-01-05', '02:10:44', 'success', 0),
('admin_1', '2021-01-05', '02:16:55', 'success', 0),
('admin_1', '2021-01-05', '02:17:00', 'success', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
