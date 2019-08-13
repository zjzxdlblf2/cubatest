-- begin WZGL_HTMX
alter table WZGL_HTMX add constraint FK_WZGL_HTMX_ON_HT foreign key (HT_ID) references FRAMEWORK_BASE_BILL(ID)^
create index IDX_WZGL_HTMX_ON_HT on WZGL_HTMX (HT_ID)^
-- end WZGL_HTMX
