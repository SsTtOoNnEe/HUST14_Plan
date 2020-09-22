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
-- Dumping data for table `diary_info`
--

LOCK TABLES `diary_info` WRITE;
/*!40000 ALTER TABLE `diary_info` DISABLE KEYS */;
INSERT INTO `diary_info` VALUES (1,'Nong hao! Good afternoon. It is a great honor for me to be here in Shanghai, and to have this opportunity to speak with all of you. I\'d like to thank Fudan University\'s President Yang for his hospitality and his gracious welcome. I\'d also like to thank our outstanding Ambassador, Jon Huntsman, who exemplifies the deep ties and respect between our nati ons. I don\'t know what he said, but I hope it was good. (Laughter.)','2020-09-12','Come On'),(4,'This is my second diary','2020-09-17','Funny Day'),(5,'hhhhh','2020-09-18','Good Boy'),(6,'Hello,zhiwen!','2020-09-18','Good Night'),(7,'Hello,peng!','2020-09-18','Honey'),(8,'奥力给','2020-09-18','Beef'),(10,'aoliegei','2020-09-18','Celtics'),(13,'奥力给','2020-09-20','Mud'),(16,' Text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting,remaining essentially unchanged.','2020-09-21','Title'),(17,' Text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown\r\n                                                printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting,\r\n                                                remaining essentially unchanged.','2020-09-21','Lakers Champion'),(19,'This is my second diary.Foever God!','2020-09-22','Clippers'),(21,'It&rsquo；s the answer told by lines that stretched around schools and churches in numbers this nation has never seen， by people who waited three hours and four hours， many for the first time in their lives， because they believed that this time must be different， that their voices could be that difference。','2020-09-22','Yep'),(22,'It&rsquo；s the answer told by lines that stretched around schools and churches in numbers this nation has never seen， by people who waited three hours and four hours， many for the first time in their lives， because they believed that this time must be different， that their voices could be that difference。','2020-09-22','whats your problems'),(24,'Text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.','2020-09-22','Funny Mud Pee');
/*!40000 ALTER TABLE `diary_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `friend_info`
--

LOCK TABLES `friend_info` WRITE;
/*!40000 ALTER TABLE `friend_info` DISABLE KEYS */;
INSERT INTO `friend_info` VALUES (1,3,3),(2,3,7),(3,3,8),(4,3,10),(5,24,6),(6,24,8),(7,25,3),(8,25,6),(9,25,7),(10,25,8),(11,25,9),(12,3,1),(13,3,9),(14,3,14),(15,3,20),(16,3,16),(17,3,18),(18,3,21),(19,3,24),(20,3,6),(21,3,13),(22,28,26),(23,28,3),(24,28,7),(25,28,9),(26,28,11),(27,28,14),(28,29,1),(29,29,3),(30,29,6),(31,29,7),(32,30,1),(33,30,6),(34,30,8),(35,30,10),(36,30,27),(37,30,3),(38,3,11),(39,3,17),(40,3,22),(41,32,1),(42,32,3),(43,32,6),(44,3,25),(45,3,27),(46,3,28),(47,3,30),(48,3,32),(49,33,1),(50,33,3),(51,33,6),(52,33,8),(53,33,9),(54,33,10);
/*!40000 ALTER TABLE `friend_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `friend_list`
--

LOCK TABLES `friend_list` WRITE;
/*!40000 ALTER TABLE `friend_list` DISABLE KEYS */;
INSERT INTO `friend_list` VALUES (1,6,7),(2,6,8),(3,7,8),(4,8,9),(5,8,10);
/*!40000 ALTER TABLE `friend_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `manager_info`
--

LOCK TABLES `manager_info` WRITE;
/*!40000 ALTER TABLE `manager_info` DISABLE KEYS */;
INSERT INTO `manager_info` VALUES (1,'Shijianhan','123456',0,'2020-09-11','123@qq.com','shijianhan','123123123'),(2,'Manager_MrZ','1275127312683',1,'2020-09-28 00:00:00.0','ajgajdags@qq.com','456787','123123123'),(3,'Manager_S','12312313',1,'2020-09-13 00:00:00.0','12312312@qq.com','456787','qeqe1313123'),(4,'xuzhiwen','123123123123123',0,'2020-09-19 00:00:00.0','Michael@qq.com','123123123','8791236796'),(5,'woshiliuyihang','678',1,'2020-09-16 00:00:00.0','asd@qq.com','387248132746823','8791236796'),(6,'Caruso','456787',0,'2020-09-16 00:00:00.0','asdasd@qq.com','123','12672812344'),(7,'xianqiangqiangqiang','123123123',1,'2020-09-29 00:00:00.0','12312312@qq.com','shijianhan','qeqe1313123'),(8,'dapangzi','123123123',1,'2020-09-11 00:00:00.0','12312312@qq.com','','8791236796');
/*!40000 ALTER TABLE `manager_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `task_info`
--

LOCK TABLES `task_info` WRITE;
/*!40000 ALTER TABLE `task_info` DISABLE KEYS */;
INSERT INTO `task_info` VALUES (2,'如何成为刘逸航','123',0,NULL,50),(4,'RapeLIUyihang','400',0,NULL,300),(5,'Talking to the Moon','250',0,NULL,100),(9,'AVENGERS','234',0,NULL,94),(11,'FunnyMudPee','456',0,NULL,278),(15,'RapeYihangLiu','250',0,NULL,34),(16,'Xiaowangyu','123',0,NULL,50),(17,'WOSHILIUYIHANG','380',0,NULL,266),(18,'RapeLIUliuLIU','250',0,NULL,120),(19,'woshizhiwen','234',0,NULL,98),(20,'RapeYOU','234',0,NULL,123),(21,'RapeLiBaizhen','567',0,NULL,67),(28,'woshijiangxianqiang','123',0,NULL,12323),(29,'Ironman','89',0,NULL,89),(30,'shijianhan','456',0,NULL,456),(34,'我要上jiaoda','123',0,NULL,122),(37,'我要上华科jiyuan','12',0,NULL,6),(38,'我要上孵蛋','20',0,NULL,18);
/*!40000 ALTER TABLE `task_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_info`
--

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
INSERT INTO `user_info` VALUES (1,'Goodboy_01','1234565675',0,'2019-03-19','HUST-SSE','123456@qq.com','Funny Mud Pee','2','1233454667',10,'1,'),(3,'shijianhan','123456',1,'2020-09-13','husT123','123@QQ.COM','奥力给啊是大','9,17,37,','5796356787',234,'4,16,17,19,24,'),(6,'Ficus222','123456',0,'1998-09-12','hust','adada@qq.com','222','8,','12335578',125,'1,'),(8,'Michael','456787',1,'2000-03-23','pku','adada@qq.com','999','17,','213436567',999,'1,'),(9,'James','456787',1,'2008-08-08','tsu','asdasd@ww.com','000','8,','365872165',22,'1,'),(10,'Davis','456787',1,'1222-06-30','CMU','asdasd@ww.com','222','9,','778998432123',333,'1,'),(11,'Caruso','456787',1,'1878-07-09','CMU','31231@oo.com','777','2,','23434y6',44,'1,'),(13,'Precious','987123',0,'2020-07-23','NYU','1234234@qq.com','999','2,','1242462365',55,'1,'),(14,'Towns','456787',1,'2021-07-06','whu','23314324@ee.com','asdasd','2,','3456325',657,'1,'),(16,'Howard','098123',0,'1678-02-04','hust','31231@oo.com','333','9,','34575',600,'1,'),(17,'Yamy','456787',0,'1290-04-05','pku','123123@qq.com','111','2,11','1235654',550,'1,'),(18,'Mr.Z','456787',0,'2007-12-12','NYU','1234234@qq.com','123','2,','456',500,'1,21,'),(20,'Dupengpengpengpeng','456787',1,'2007-09-08','tsu','asdasd@ww.com','111hhh','2,','123123',300,'1,'),(21,'Xuzhiwen','456787',1,'1999-07-07','NYU','qweqweq@qq.com','2314345','2,','123435',250,'1,'),(22,'liuyihang','456787',1,'2020-10-04','hust','1234234@qq.com','999','10,','234234',200,'1,'),(24,'YihangLiu','12389076534',1,'2020-09-30','md','31231@oo.com','123','11,','72838172',123123,'1,'),(27,'Manager_Y','387248132746823',1,'2020-09-14','pku','123123@qq.com','123123','9,20,21,','5796356787',345,'1,'),(28,'jiangxianqiang','123123123',1,'2020-09-30','hust','1234234@qq.com','aoligei,qianggechongchongchong!','28,29,30,','0987654321',200,'1,5,'),(30,'woshidupengpeng','123123123',1,'2019-04-19','HUST','31231@oo.com','奥力给！','2,','13456762345',NULL,'1,8,'),(32,'pengdudududududdu','qweqweqweqweqwe',1,'2020-09-04','CMU','asdasd@ww.com','aoligei','2,34,','72838172',NULL,'1,10,'),(33,'xiaopangzi','123123123',0,'2020-09-24','CMU','123123@qq.com','我要上华科','2,38,','72838172',NULL,'1,22,');
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

-- Dump completed on 2020-09-22 17:11:54
