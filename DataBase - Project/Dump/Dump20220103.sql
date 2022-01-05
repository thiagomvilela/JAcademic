CREATE DATABASE  IF NOT EXISTS `jacademic` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `jacademic`;
-- MariaDB dump 10.19  Distrib 10.6.5-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: jacademic
-- ------------------------------------------------------
-- Server version	10.6.5-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `note`
--

DROP TABLE IF EXISTS `note`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `note` (
  `id_student` int(11) NOT NULL,
  `id_teacher` int(11) NOT NULL,
  `first_note` decimal(4,2) NOT NULL,
  `second_note` decimal(4,2) NOT NULL,
  `final_note` decimal(4,2) DEFAULT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`id_student`,`id_teacher`),
  KEY `id_teacher` (`id_teacher`),
  CONSTRAINT `note_ibfk_1` FOREIGN KEY (`id_student`) REFERENCES `student` (`id_student`),
  CONSTRAINT `note_ibfk_2` FOREIGN KEY (`id_teacher`) REFERENCES `teacher` (`id_teacher`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `note`
--

LOCK TABLES `note` WRITE;
/*!40000 ALTER TABLE `note` DISABLE KEYS */;
INSERT INTO `note` VALUES (1,1,10.00,9.00,NULL,'Aprovado'),(1,2,8.50,10.00,NULL,'Aprovado'),(2,1,8.50,8.50,NULL,'Aprovado'),(2,2,7.50,7.50,NULL,'Aprovado'),(3,1,9.00,8.00,NULL,'Aprovado'),(3,2,6.50,7.50,NULL,'Aprovado'),(4,1,5.50,6.00,7.50,'Aprovado'),(4,2,7.00,8.00,NULL,'Aprovado'),(5,1,10.00,7.50,NULL,'Aprovado'),(5,2,5.50,7.50,6.50,'Reprovado'),(6,1,5.00,4.00,6.50,'Reprovado'),(6,2,3.50,2.50,7.00,'Aprovado'),(7,1,9.50,7.50,NULL,'Aprovado'),(7,2,4.50,10.00,NULL,'Aprovado'),(8,1,6.50,4.00,6.00,'Reprovado'),(8,2,6.00,8.00,NULL,'Aprovado'),(9,1,5.50,7.50,8.00,'Aprovado'),(9,2,10.00,9.00,NULL,'Aprovado');
/*!40000 ALTER TABLE `note` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `id_student` int(11) NOT NULL AUTO_INCREMENT,
  `name_student` varchar(60) NOT NULL,
  PRIMARY KEY (`id_student`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Arthur Vinícius Bezerra Da Silva'),(2,'Beatriz Gonçalves Fontes'),(3,'Bruno Cesar Soares Dos Santos'),(4,'Camila Pâmela Bacelar Barbosa Farias'),(5,'Camila Siqueira Lins'),(6,'Carlos Eduardo Da Silva'),(7,'Clésio Salles'),(8,'Clodoaldo Braga Batista Dos Santos'),(9,'Ednilson Vicente Calixto'),(10,'Eduardo Henrique Guerra Coitinho'),(11,'Elton Emanuel Soares Santos'),(12,'Eridiana Angelica Dias Do Nascimento'),(13,'Estevão Lucas Ramos Da Silva'),(14,'Everton Pedrosa'),(15,'Ismael Silva'),(16,'Ítalo Silva'),(17,'Janderson Araujo'),(18,'Joelma Ceciliana De Sena'),(19,'Jose Junior'),(20,'Larissa Silva'),(21,'Leandro José Da Silva Filho'),(22,'Luciana Carla Alves Costa De Araújo'),(23,'Marcos André Monteiro De Barros'),(24,'Maria Letícia Da Silva Manguinho'),(25,'Matheus Bezerra'),(26,'Matheus Trajano Costa'),(27,'Meydson Lenyerge Lima Baracho'),(28,'Paulo Carlos Da Silva Filho'),(29,'Pedro Moura'),(30,'Rackel Ramos'),(31,'Reyvson Albuquerque'),(32,'Robert França'),(33,'Ryan Silva De Menezes'),(34,'Tarcisio Varjão Gomes Da Silva Filho'),(35,'Thayná Ribeiro Parahyba'),(36,'Thiago Vilela'),(37,'Vanik Lima'),(38,'Vinicius Ferreira De Lima'),(39,'Vitória Carla Costa De Lira'),(40,'Wagner Vidal Xavier Da Silva'),(41,'Yuri Pereira');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `id_teacher` int(11) NOT NULL AUTO_INCREMENT,
  `name_teacher` varchar(60) NOT NULL,
  PRIMARY KEY (`id_teacher`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'Anderson Apolinio Lira Queiroz'),(2,'Antônio Correia de Sá Barreto Neto'),(3,'Bruno Falcão de Souza Cartaxo'),(4,'Danilo Farias Soares da Silva'),(5,'Flávio Rosendo da Silva Oliveira'),(6,'Jéssica Priscila Rivas dos Santos'),(7,'Mércio Antônio Oliveira de Andrade');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-03 13:13:41
