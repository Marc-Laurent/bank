/*==============================================================*/
/* Database name:  DATABASE_1                                   */
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     28/03/2019 16:06:15                          */
/*==============================================================*/


drop database if exists bank;

/*==============================================================*/
/* Database: DATABASE_1                                         */
/*==============================================================*/
create database bank;

use bank;

/*==============================================================*/
/* Table: ACCOUNT                                               */
/*==============================================================*/
create table ACCOUNT
(
   ACC_ID               varchar(36) not null default 'newid()',
   USER_ID              varchar(36) not null,
   ACC_MODIFICATION     datetime not null,
   ACC_SUPPRESSION      datetime,
   ACC_VALEUR           decimal not null,
   ACC_TYPE             varchar(200) not null,
   ACC_DEVISE           varchar(50) not null,
   ACC_REFERENCE        varchar(100) not null,
   ACC_LABEL            varchar(100),
   ACC_DESCRIPTION      varchar(500),
   IS_TRANSACTABLE      bool not null,
   primary key (ACC_ID)
);

/*==============================================================*/
/* Index: IDX_ACCID                                             */
/*==============================================================*/
create unique index IDX_ACCID on ACCOUNT
(
   ACC_ID
);

