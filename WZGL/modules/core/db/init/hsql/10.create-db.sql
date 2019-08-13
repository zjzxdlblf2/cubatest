-- begin FRAMEWORK_BASE_BILL
alter table FRAMEWORK_BASE_BILL add column JE decimal(19, 2) ^
alter table FRAMEWORK_BASE_BILL add column GYS varchar(255) ^
alter table FRAMEWORK_BASE_BILL add column GGXH varchar(255) ^
alter table FRAMEWORK_BASE_BILL add column LXR varchar(255) ^
alter table FRAMEWORK_BASE_BILL add column DTYPE varchar(100) ^
update FRAMEWORK_BASE_BILL set DTYPE = 'framework_BaseBill' where DTYPE is null ^
-- end FRAMEWORK_BASE_BILL
-- begin WZGL_HTMX
create table WZGL_HTMX (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    HT_ID varchar(36),
    CLMC varchar(255),
    --
    primary key (ID)
)^
-- end WZGL_HTMX
