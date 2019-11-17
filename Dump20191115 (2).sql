CREATE DATABASE  IF NOT EXISTS `rootdine` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `rootdine`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: rootdine
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ss_catagory`
--

DROP TABLE IF EXISTS `ss_catagory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ss_catagory` (
  `id_catagory` int(11) NOT NULL AUTO_INCREMENT,
  `catagory_desc` varchar(255) DEFAULT NULL,
  `catagory_image` varchar(255) DEFAULT NULL,
  `catagory_name` varchar(255) DEFAULT NULL,
  `is_catagory_available` int(11) DEFAULT '1',
  PRIMARY KEY (`id_catagory`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ss_catagory`
--

LOCK TABLES `ss_catagory` WRITE;
/*!40000 ALTER TABLE `ss_catagory` DISABLE KEYS */;
INSERT INTO `ss_catagory` VALUES (1,'Breakfast Catagory Description','catagory1.jpg','Breakfast',1),(2,'Lunch Catagory Description','catagory2.jpg','Lunch',1),(3,'Snacks Catagory Description','catagory3.jpg','Snacks',1),(4,'Dinner Catagory Description','catagory4.jpg','Dinner',1),(5,'Popular Catagory Description','catagory5.jpg','Popular',1);
/*!40000 ALTER TABLE `ss_catagory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ss_drinks`
--

DROP TABLE IF EXISTS `ss_drinks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ss_drinks` (
  `id_drinks` int(11) NOT NULL AUTO_INCREMENT,
  `drinks_image` varchar(255) DEFAULT NULL,
  `drinks_name` varchar(255) DEFAULT NULL,
  `drinks_price` int(11) DEFAULT '0',
  PRIMARY KEY (`id_drinks`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ss_drinks`
--

LOCK TABLES `ss_drinks` WRITE;
/*!40000 ALTER TABLE `ss_drinks` DISABLE KEYS */;
INSERT INTO `ss_drinks` VALUES (1,'drinks1.jpg','Coke',35),(2,'drinks2.jpg','Pepsi',45),(3,'drinks3.jpg','Juice',55);
/*!40000 ALTER TABLE `ss_drinks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ss_food`
--

DROP TABLE IF EXISTS `ss_food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ss_food` (
  `id_food` int(11) NOT NULL AUTO_INCREMENT,
  `food_name` varchar(255) DEFAULT NULL,
  `food_price` int(11) DEFAULT '0',
  `id_catagory` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_food`),
  KEY `FKle6sjkwvaorsnt79662nkei18` (`id_catagory`),
  CONSTRAINT `FKle6sjkwvaorsnt79662nkei18` FOREIGN KEY (`id_catagory`) REFERENCES `ss_catagory` (`id_catagory`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ss_food`
--

LOCK TABLES `ss_food` WRITE;
/*!40000 ALTER TABLE `ss_food` DISABLE KEYS */;
INSERT INTO `ss_food` VALUES (1,'Rooti',10,1),(2,'Parata',20,1),(3,'Khichuri',0,2),(4,'Bhaat',0,2),(5,'Biriyani',0,2);
/*!40000 ALTER TABLE `ss_food` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ss_food_review`
--

DROP TABLE IF EXISTS `ss_food_review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ss_food_review` (
  `id_review` int(11) NOT NULL AUTO_INCREMENT,
  `id_sub_food` int(11) DEFAULT NULL,
  `review` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_review`),
  KEY `FKaybeiul0uov8p9jfvqugb924l` (`id_sub_food`),
  CONSTRAINT `FKaybeiul0uov8p9jfvqugb924l` FOREIGN KEY (`id_sub_food`) REFERENCES `ss_food_sub_catagory` (`id_sub_food`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ss_food_review`
--

LOCK TABLES `ss_food_review` WRITE;
/*!40000 ALTER TABLE `ss_food_review` DISABLE KEYS */;
/*!40000 ALTER TABLE `ss_food_review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ss_food_sub_catagory`
--

DROP TABLE IF EXISTS `ss_food_sub_catagory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ss_food_sub_catagory` (
  `id_sub_food` int(11) NOT NULL AUTO_INCREMENT,
  `id_food` int(11) DEFAULT NULL,
  `sub_food_desc` varchar(255) DEFAULT NULL,
  `sub_food_images` varchar(255) DEFAULT NULL,
  `sub_food_price` int(11) DEFAULT '0',
  PRIMARY KEY (`id_sub_food`),
  KEY `FKf75tceju27jt4fpgi91ywi8ji` (`id_food`),
  CONSTRAINT `FKf75tceju27jt4fpgi91ywi8ji` FOREIGN KEY (`id_food`) REFERENCES `ss_food` (`id_food`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ss_food_sub_catagory`
--

LOCK TABLES `ss_food_sub_catagory` WRITE;
/*!40000 ALTER TABLE `ss_food_sub_catagory` DISABLE KEYS */;
INSERT INTO `ss_food_sub_catagory` VALUES (1,1,'Rooti with Eggs','sub_catagory1.jpg',15),(2,1,'Rooti with Bhaji','sub_catagory1.jpg',25),(3,2,'Parata with Daal','sub_catagory1.jpg',35),(4,2,'Parata with Meet','sub_catagory1.jpg',40);
/*!40000 ALTER TABLE `ss_food_sub_catagory` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-16  2:53:47


INSERT INTO `ss_catagory` (id_catagory,is_catagory_available,catagory_desc,catagory_image,catagory_name)
VALUES (1,1,'Breakfast Catagory Description','catagory1.jpg','Breakfast'),
(2,1,'Lunch Catagory Description','catagory2.jpg','Lunch'),
(3,1,'Snacks Catagory Description','catagory3.jpg','Snacks'),
(4,1,'Dinner Catagory Description','catagory4.jpg','Dinner'),
(5,1,'Popular Catagory Description','catagory5.jpg','Popular');
INSERT INTO `ss_food` (id_food,id_catagory,food_price,food_name)
VALUES (1,1,10,'Rooti'),
(2,1,20,'Parata'),
(3,2,0,'Khichuri'),
(4,2,0,'Bhaat'),
(5,2,0,'Biriyani');

INSERT INTO `ss_food_sub_catagory`
VALUES(1,1,"Rooti with Eggs","sub_catagory1.jpg",15),
(2,1,"Rooti with Bhaji","sub_catagory1.jpg",25),
(3,2,"Parata with Daal","sub_catagory1.jpg",35),
(4,2,"Parata with Meet","sub_catagory1.jpg",40);

INSERT INTO `ss_drinks` 
VALUES(1,"drinks1.jpg","Coke",35),
(2,"drinks2.jpg","Pepsi",45),
(3,"drinks3.jpg","Juice",55);


temp1[0]["food"]

temp1[0]["food"][0]["foodSubCatagory"]