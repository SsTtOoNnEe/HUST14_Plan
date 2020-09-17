-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hust_plan
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `friend_info`
--

DROP TABLE IF EXISTS `friend_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `friend_info` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `User_ID` int(11) DEFAULT NULL,
  `Friend_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friend_info`
--

LOCK TABLES `friend_info` WRITE;
/*!40000 ALTER TABLE `friend_info` DISABLE KEYS */;
INSERT INTO `friend_info` VALUES (1,3,3),(2,3,7),(3,3,8),(4,3,10),(5,24,6),(6,24,8),(7,25,3),(8,25,6),(9,25,7),(10,25,8),(11,25,9),(12,3,1),(13,3,9),(14,3,14),(15,3,20),(16,3,16),(17,3,18),(18,3,21),(19,3,24),(20,3,6),(21,3,13);
/*!40000 ALTER TABLE `friend_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `friend_list`
--

DROP TABLE IF EXISTS `friend_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `friend_list` (
  `pkid` int(11) NOT NULL AUTO_INCREMENT,
  `User_ID` int(11) DEFAULT NULL,
  `Friend_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`pkid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friend_list`
--

LOCK TABLES `friend_list` WRITE;
/*!40000 ALTER TABLE `friend_list` DISABLE KEYS */;
INSERT INTO `friend_list` VALUES (1,6,7),(2,6,8),(3,7,8),(4,8,9),(5,8,10);
/*!40000 ALTER TABLE `friend_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manager_info`
--

DROP TABLE IF EXISTS `manager_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `manager_info` (
  `Manager_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Manager_name` varchar(45) DEFAULT NULL,
  `Manager_pwd` varchar(45) DEFAULT NULL,
  `Manager_sex` int(11) DEFAULT NULL,
  `Manager_bir` varchar(45) DEFAULT NULL,
  `Manager_email` varchar(45) DEFAULT NULL,
  `Manager_key` varchar(45) DEFAULT NULL,
  `Manager_phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Manager_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manager_info`
--

LOCK TABLES `manager_info` WRITE;
/*!40000 ALTER TABLE `manager_info` DISABLE KEYS */;
INSERT INTO `manager_info` VALUES (1,'Shijianhan','123456',0,'2020-09-11','123@qq.com','shijianhan','123123123'),(2,'Manager_MrZ','1275127312683',1,'2020-09-28 00:00:00.0','ajgajdags@qq.com','456787','123123123'),(3,'Manager_S','12312313',1,'2020-09-13 00:00:00.0','12312312@qq.com','456787','qeqe1313123'),(4,'xuzhiwen','123123123123123',0,'2020-09-19 00:00:00.0','Michael@qq.com','123123123','8791236796');
/*!40000 ALTER TABLE `manager_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task_info`
--

DROP TABLE IF EXISTS `task_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `task_info` (
  `Task_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Task_name` varchar(45) DEFAULT NULL,
  `Task_time` varchar(45) DEFAULT NULL,
  `Task_type` int(11) DEFAULT NULL,
  `Task_severity` int(11) DEFAULT NULL,
  `Task_leftTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`Task_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task_info`
--

LOCK TABLES `task_info` WRITE;
/*!40000 ALTER TABLE `task_info` DISABLE KEYS */;
INSERT INTO `task_info` VALUES (2,'LoopAbove','888',2,1,200),(4,'RapeLIUyihang','400',0,NULL,300),(5,'Talking to the Moon','250',0,NULL,100),(9,'Avengers','234',0,NULL,95),(11,'FunnyMudPee','456',0,NULL,278),(15,'RapeYihangLiu','250',0,NULL,34),(16,'Xiaowangyu','123',0,NULL,50),(17,'WOSHILIUYIHANG','380',0,NULL,267),(18,'RapeLIUliuLIU','250',0,NULL,120),(19,'woshizhiwen','234',0,NULL,98),(20,'RapeYOU','234',0,NULL,123),(21,'RapeLiBaizhen','567',0,NULL,67);
/*!40000 ALTER TABLE `task_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_info` (
  `User_ID` int(11) NOT NULL AUTO_INCREMENT,
  `User_name` varchar(45) DEFAULT NULL,
  `User_pwd` varchar(45) DEFAULT NULL,
  `User_sex` int(11) DEFAULT NULL,
  `User_bir` date DEFAULT NULL,
  `User_tagSchool` varchar(45) DEFAULT NULL,
  `User_email` varchar(45) DEFAULT NULL,
  `User_slogan` varchar(45) DEFAULT NULL,
  `Tasks_ID` varchar(45) DEFAULT NULL,
  `User_phone` varchar(45) CHARACTER SET latin2 COLLATE latin2_general_ci DEFAULT NULL,
  `User_learningTime` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`User_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_info`
--

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
INSERT INTO `user_info` VALUES (1,'Goodboy_01','123456',0,'2019-03-27','HUST-SSE','123456@qq.com','Funny Mud Pee','2',NULL,NULL),(3,'shijianhan','123456',0,'2020-09-11','husT123','123@QQ.COM','AOLIGEI','2,9,17,','5796356787',NULL),(6,'Ficus222','123456',0,NULL,'hust','adada@qq.com','222','8,',NULL,NULL),(7,'Joker','7654321',1,NULL,'whu','adada@qq.com','aoligei','10,',NULL,NULL),(8,'Michael','456787',1,NULL,'pku','adada@qq.com','999','17,',NULL,NULL),(9,'James','456787',1,NULL,'tsu','asdasd@ww.com','000','8,',NULL,NULL),(10,'Davis','456787',1,NULL,'CMU','asdasd@ww.com','222','9,',NULL,NULL),(11,'Caruso','456787',1,NULL,'CMU','31231@oo.com','777','2,','',NULL),(13,'Precious','987123',0,NULL,'NYU','1234234@qq.com','999','2,',NULL,NULL),(14,'Towns','456787',1,NULL,'whu','23314324@ee.com','asdasd','2,',NULL,NULL),(16,'Howard','098123',0,NULL,'hust','31231@oo.com','333','9,','34575','600'),(17,'Yamy','456787',0,NULL,'pku','123123@qq.com','111','2,11','1235654','550'),(18,'Mr.Z','456787',0,NULL,'NYU','1234234@qq.com','123','2,','456','500'),(19,'Mr.S','456787',1,NULL,'pku','asdasd@ww.com','123123','2,','123345','400'),(20,'Dupengpengpengpeng','456787',1,NULL,'tsu','asdasd@ww.com','111hhh','2,','123123','300'),(21,'Xuzhiwen','456787',1,NULL,'NYU','qweqweq@qq.com','2314345','2,','123435','250'),(22,'liuyihang','456787',1,'2020-10-04','hust','1234234@qq.com','999','10,','234234','200'),(24,'YihangLiu','12389076534',1,'2020-09-30','md','31231@oo.com','123','11,','72838172',NULL),(25,'Wangyu','123123123',1,'2020-09-18','hust','31231@oo.com','aoligei','9,','5796356787',NULL),(26,'Texs','21387462876',0,'2020-09-27','CMU','123123@qq.com','123123123','9,','0987654321',NULL),(27,'Manager_Y','387248132746823',1,'2020-09-14','pku','123123@qq.com','123123','9,20,21,','5796356787',NULL);
/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'hust_plan'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-17 15:58:18
