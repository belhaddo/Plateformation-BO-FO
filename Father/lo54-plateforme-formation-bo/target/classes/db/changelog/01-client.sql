-liquibase formatted sql

--changeset client:1
CREATE TABLE IF NOT EXISTS CLIENT
 (
   ID BIGINT(4) NOT NULL AUTO_INCREMENT ,
   LASTNAME VARCHAR(255) NOT NULL  ,
   FIRSTNAME VARCHAR(255) NOT NULL  ,
   ADDRESS VARCHAR(255) NOT NULL  ,
   PHONE VARCHAR(255) NOT NULL  ,
   EMAIL VARCHAR(255) NULL
   , PRIMARY KEY (ID)
 );
--rollback drop table client;

--changeset client:2
