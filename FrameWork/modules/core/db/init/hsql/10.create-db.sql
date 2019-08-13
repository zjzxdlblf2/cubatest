-- begin FRAMEWORK_BASE_BILL
create table FRAMEWORK_BASE_BILL (
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
    CODE varchar(255),
    BIZDATE timestamp,
    BZJG_ID varchar(36),
    --
    primary key (ID)
)^
-- end FRAMEWORK_BASE_BILL
