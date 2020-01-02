create table users (id bigint not null auto_increment, first_name varchar(50), last_name varchar(50), username varchar(100), uuid BINARY(16) not null, primary key (id)) engine=MyISAM
alter table users add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
alter table users add constraint UK_6km2m9i3vjuy36rnvkgj1l61s unique (uuid)
