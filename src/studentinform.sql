-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 14, 2023 at 02:41 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentinform`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `Attendanceid` varchar(100) NOT NULL,
  `Studentid` varchar(100) NOT NULL,
  `Courseid` varchar(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `AttendanceStatus` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `courseid` varchar(100) NOT NULL,
  `coursename` varchar(100) NOT NULL,
  `instructor` varchar(100) NOT NULL,
  `credithour` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`courseid`, `coursename`, `instructor`, `credithour`, `description`) VALUES
('77', 'math', 'mmmm', 'nnnnxxxx', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `enrollement`
--

CREATE TABLE `enrollement` (
  `enrollementid` varchar(100) NOT NULL,
  `studentid` varchar(100) NOT NULL,
  `courseid` varchar(100) NOT NULL,
  `enrollementdate` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `enrollement`
--

INSERT INTO `enrollement` (`enrollementid`, `studentid`, `courseid`, `enrollementdate`, `status`) VALUES
('99', '00', '88', 'nn', 'nn');

-- --------------------------------------------------------

--
-- Table structure for table `grade`
--

CREATE TABLE `grade` (
  `gradeid` varchar(100) NOT NULL,
  `studentid` varchar(100) NOT NULL,
  `courseid` varchar(100) NOT NULL,
  `grade` varchar(100) NOT NULL,
  `assessmentdate` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `UserName` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Contact` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`UserName`, `Password`, `Name`, `gender`, `Address`, `Contact`) VALUES
('matsiko', 'm', '', 'Male', '', ''),
('', '', '', 'Male', '', ''),
('', '', '', 'Male', '', ''),
('8', '', '', 'Male', '', ''),
('matsiko', '123', '', 'Male', '', ''),
('', '', '', 'Male', '', ''),
('tt', 'tt', 'jjj', 'Female', 'jj', 'nnn');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `studentid` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone` varchar(66) NOT NULL,
  `email` varchar(77) NOT NULL,
  `guadianN` varchar(77) NOT NULL,
  `guadianPH` varchar(888) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`studentid`, `fname`, `lname`, `date`, `gender`, `address`, `phone`, `email`, `guadianN`, `guadianPH`) VALUES
('', '', '', '', 'Male', 'Califonia', '', '', '', ''),
('12', 'Hatangimana', 'Patrick', '13/12/2023', 'Male', 'Newyork', '0786127605', 'hpthefox@gmail.com', 'Parents', '0788896771');

-- --------------------------------------------------------

--
-- Table structure for table `transcript`
--

CREATE TABLE `transcript` (
  `transcriptid` varchar(100) NOT NULL,
  `studentid` varchar(100) NOT NULL,
  `courseid` varchar(100) NOT NULL,
  `grade` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `cumulativegpa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transcript`
--

INSERT INTO `transcript` (`transcriptid`, `studentid`, `courseid`, `grade`, `semester`, `cumulativegpa`) VALUES
('klhl', 'klhl', 'jhjkn', 'jbkj', 'kjhk', 'jkbk');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`Attendanceid`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`courseid`);

--
-- Indexes for table `enrollement`
--
ALTER TABLE `enrollement`
  ADD PRIMARY KEY (`enrollementid`);

--
-- Indexes for table `grade`
--
ALTER TABLE `grade`
  ADD PRIMARY KEY (`gradeid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `transcript`
--
ALTER TABLE `transcript`
  ADD PRIMARY KEY (`transcriptid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
