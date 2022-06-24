-- Adminer 4.8.1 MySQL 5.5.5-10.4.19-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

CREATE DATABASE `company_database` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `company_database`;

CREATE TABLE `tb_branch_dept` (
  `id_branch` int(11) NOT NULL AUTO_INCREMENT,
  `dep_number` varchar(50) NOT NULL,
  `branch_location` varchar(50) NOT NULL,
  PRIMARY KEY (`id_branch`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_branch_dept`;

CREATE TABLE `tb_department` (
  `id_department` int(11) NOT NULL AUTO_INCREMENT,
  `dep_number` varchar(20) NOT NULL,
  `dep_name` varchar(50) NOT NULL,
  `mgr_ssn` varchar(50) NOT NULL,
  `mgr_startdate` date NOT NULL,
  PRIMARY KEY (`id_department`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_department`;
INSERT INTO `tb_department` (`id_department`, `dep_number`, `dep_name`, `mgr_ssn`, `mgr_startdate`) VALUES
(1,	'00001',	'Departemen Keuangan',	'0001',	'2022-06-13'),
(2,	'00002',	'Departemen Teknologi',	'0011',	'2018-08-29');

CREATE TABLE `tb_dependent` (
  `id_dependent` int(11) NOT NULL AUTO_INCREMENT,
  `dependent_name` varchar(50) NOT NULL,
  `ssn` varchar(20) NOT NULL,
  `gender` enum('Laki-laki','Perempuan') NOT NULL,
  `birth_date` date NOT NULL,
  `relationship` varchar(20) NOT NULL,
  PRIMARY KEY (`id_dependent`),
  KEY `ssn` (`ssn`),
  CONSTRAINT `tb_dependent_ibfk_1` FOREIGN KEY (`ssn`) REFERENCES `tb_employee` (`ssn`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_dependent`;
INSERT INTO `tb_dependent` (`id_dependent`, `dependent_name`, `ssn`, `gender`, `birth_date`, `relationship`) VALUES
(1,	'Carina',	'0001',	'Perempuan',	'2002-01-01',	'Istri'),
(2,	'Denis',	'0002',	'Perempuan',	'2000-09-09',	'Anak');

CREATE TABLE `tb_employee` (
  `id_employee` tinyint(4) NOT NULL AUTO_INCREMENT,
  `ssn` varchar(20) NOT NULL,
  `dep_number` char(30) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `mid_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `birth_date` date NOT NULL,
  `address` varchar(30) NOT NULL,
  `gender` enum('Laki-laki','Perempuan') NOT NULL,
  `salary` float NOT NULL,
  PRIMARY KEY (`ssn`),
  UNIQUE KEY `id_employee` (`id_employee`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_employee`;
INSERT INTO `tb_employee` (`id_employee`, `ssn`, `dep_number`, `first_name`, `mid_name`, `last_name`, `birth_date`, `address`, `gender`, `salary`) VALUES
(1,	'0001',	'00001',	'Rizky',	'Leonardo',	'Putra',	'2000-06-01',	'Margonda',	'Laki-laki',	7000000),
(2,	'0002',	'00001',	'Franko',	'',	'Besali',	'2001-02-02',	'Cimanggis',	'Laki-laki',	8000000),
(3,	'0003',	'00001',	'Chonsu',	'',	'',	'1997-08-07',	'Cikarang',	'Laki-laki',	10000000),
(4,	'0004',	'00001',	'Andi',	'',	'Ardiansyah',	'1999-02-01',	'Cikeas',	'Laki-laki',	3000000),
(13,	'0005',	'00001',	'Triansyah',	'',	'Kie',	'1987-06-03',	'Jatibening',	'Laki-laki',	6000000),
(14,	'0006',	'00001',	'Dinda',	'',	'Hanifah',	'1998-11-25',	'Margonda',	'Perempuan',	10000000),
(15,	'0007',	'00001',	'Ressa',	'',	'Putri',	'1987-06-03',	'Jatibening',	'Laki-laki',	8000000),
(6,	'0011',	'00002',	'Ilhamdi',	'',	'Farhan',	'2001-02-15',	'Jatiasih',	'Laki-laki',	20000000),
(7,	'0012',	'00002',	'Joshua',	'',	'Putra',	'1987-06-03',	'Jatibening',	'Laki-laki',	8000000),
(8,	'0013',	'00002',	'Yudha',	'',	'Erlangga',	'1998-11-25',	'Margonda',	'Laki-laki',	10000000),
(9,	'0014',	'00002',	'Reynaldi',	'',	'Hardi',	'1998-08-24',	'Hang Jebat',	'Laki-laki',	6000000),
(10,	'0015',	'00002',	'Joshua',	'',	'Lian',	'1995-07-13',	'Hang Lekir',	'Laki-laki',	3000000),
(11,	'0016',	'00002',	'Fitria',	'',	'Gustiani',	'1993-12-21',	'Margonda',	'Perempuan',	11000000),
(12,	'0017',	'00002',	'Inge',	'',	'Handayani',	'1997-09-01',	'Margonda',	'Perempuan',	4000000);

CREATE TABLE `tb_project` (
  `proj_number` varchar(20) NOT NULL,
  `proj_name` varchar(50) NOT NULL,
  `proj_location` varchar(50) NOT NULL,
  `dep_number` varchar(20) NOT NULL,
  PRIMARY KEY (`proj_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_project`;
INSERT INTO `tb_project` (`proj_number`, `proj_name`, `proj_location`, `dep_number`) VALUES
('001',	'Marketing on 2022',	'Tangerang',	'00001'),
('002',	'Auditing 2022',	'Tangerang',	'00001');

CREATE TABLE `tb_works_on` (
  `id_works_on` int(20) NOT NULL AUTO_INCREMENT,
  `ssn` varchar(20) NOT NULL,
  `proj_number` varchar(20) NOT NULL,
  `work_hour` int(11) NOT NULL,
  PRIMARY KEY (`id_works_on`),
  KEY `proj_number` (`proj_number`),
  KEY `ssn` (`ssn`),
  CONSTRAINT `tb_works_on_ibfk_1` FOREIGN KEY (`proj_number`) REFERENCES `tb_project` (`proj_number`),
  CONSTRAINT `tb_works_on_ibfk_2` FOREIGN KEY (`ssn`) REFERENCES `tb_employee` (`ssn`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_works_on`;
INSERT INTO `tb_works_on` (`id_works_on`, `ssn`, `proj_number`, `work_hour`) VALUES
(2,	'0001',	'001',	8),
(3,	'0002',	'002',	10),
(4,	'0003',	'001',	8),
(5,	'0001',	'002',	10);

-- 2022-06-23 13:28:47
