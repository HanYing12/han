/*
SQLyog Professional v12.08 (64 bit)`mysql@localhost`
MySQL - 8.0.17 : Database - dzhj
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dzhj` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `dzhj`;

/*Table structure for table `ck` */

DROP TABLE IF EXISTS `ck`;

CREATE TABLE `ck` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ORDERNO` varchar(30) NOT NULL,
  `ORDERDETAILID` varchar(30) NOT NULL,
  `DEPARTMENT` varchar(50) NOT NULL,
  `LOCATIONID` varchar(20) NOT NULL,
  `ITEMNAME` varchar(50) NOT NULL,
  `MANUFACTURER` varchar(50) NOT NULL,
  `SUPPLIER` varchar(100) NOT NULL,
  `UNIT` varchar(10) NOT NULL,
  `ITEMSPEC` varchar(10) NOT NULL,
  `BATCHNO` varchar(50) DEFAULT NULL,
  `EXPIRYDATE` varchar(50) NOT NULL,
  `PLANQTY` int(11) NOT NULL,
  `STATE` double NOT NULL,
  `OPERATOR` varchar(20) NOT NULL,
  `CREATEDATE` datetime NOT NULL,
  `lamp` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8;

/*Data for the table `ck` */

insert  into `ck`(`ID`,`ORDERNO`,`ORDERDETAILID`,`DEPARTMENT`,`LOCATIONID`,`ITEMNAME`,`MANUFACTURER`,`SUPPLIER`,`UNIT`,`ITEMSPEC`,`BATCHNO`,`EXPIRYDATE`,`PLANQTY`,`STATE`,`OPERATOR`,`CREATEDATE`,`lamp`) values (1,'123456','123456789','肿瘤一护理单元','0-0-6-9','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',30,10,'康芳','2019-09-18 17:24:19',114),(61,'123456','123456789','肿瘤一护理单元','0-0-7-1','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:25:21',116),(62,'123456','123456789','肿瘤一护理单元','0-0-7-2','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:25:26',NULL),(68,'123456','123456789','肿瘤一护理单元','0-0-7-3','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:25:28',NULL),(69,'123456','123456789','肿瘤一护理单元','0-0-7-1','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:25:29',NULL),(70,'123457','123456789','肿瘤一护理单元','0-0-7-2','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:25:30',NULL),(71,'123457','123456789','肿瘤一护理单元','0-0-7-1','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:25:31',NULL),(72,'123457','123456789','肿瘤一护理单元','0-0-7-2','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:25:32',NULL),(73,'1234510','123456789','肿瘤一护理单元','0-0-7-2','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:26:23',NULL),(74,'1234510','123456789','肿瘤一护理单元','0-0-7-2','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:27:23',NULL),(75,'1234510','123456789','肿瘤一护理单元','0-0-7-2','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:27:33',NULL),(76,'1234510','123456789','肿瘤一护理单元','0-0-7-2','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','陕西昊基科贸有限公司','个','12Fr','20190809','2022/7/8',-2,10,'康芳','2019-09-18 17:37:33',NULL);

/*Table structure for table `hwkc` */

DROP TABLE IF EXISTS `hwkc`;

CREATE TABLE `hwkc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `LOCATIONID` varchar(20) NOT NULL,
  `ITEMNAME` varchar(50) NOT NULL,
  `MANUFACTURER` varchar(50) NOT NULL,
  `UNIT` varchar(2) NOT NULL,
  `ITEMSPEC` varchar(50) NOT NULL,
  `BATCHNO` varchar(50) NOT NULL,
  `EXPIRYDATE` date NOT NULL,
  `QTY` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `hwkc` */

insert  into `hwkc`(`id`,`LOCATIONID`,`ITEMNAME`,`MANUFACTURER`,`UNIT`,`ITEMSPEC`,`BATCHNO`,`EXPIRYDATE`,`QTY`) values (1,'0-0-1-1','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','个','12Fr','20190809','2022-08-08',40),(2,'0-1-1-2','压舌板','广州维力医疗器械股份有限公司','个','12Fr','20190809','2022-08-08',40),(3,'0-2-1-1','预充式导管冲洗器','广州维力医疗器械股份有限公司','个','12Fr','20190809','2022-08-08',40),(4,'0-1-7-5','密闭式静脉留置针','苏州碧迪医疗器械有限公司','支','22cc','20190809','2022-08-08',50),(5,'1-1-1-1','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','个','12Fr','20190809','2022-08-08',40),(6,'1-1-1-1','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','个','12Fr','20190809','2022-08-08',40),(7,'1-1-1-1','一次性使用气管插管导丝','广州维力医疗器械股份有限公司','个','12Fr','20190809','2022-08-08',40);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
