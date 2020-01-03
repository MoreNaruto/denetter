
create table user (id bigint not null auto_increment, age integer not null, birthday datetime not null, created_at timestamp not null, email varchar(255), first_name varchar(100), last_name varchar(100), phone varchar(255), role integer not null, updated_at timestamp, username varchar(100), uuid BINARY(16) not null, primary key (id)) engine=MyISAM
alter table user add constraint UK_sb8bbouer5wak8vyiiy4pf2bx unique (username)
alter table user add constraint UK_1xc1iry6gqjrvh5cpajiq7l2f unique (uuid)
create table user (id bigint not null auto_increment, age integer not null, birthday datetime not null, created_at timestamp not null, email varchar(255), first_name varchar(100), last_name varchar(100), phone varchar(255), role integer not null, updated_at timestamp, username varchar(100), uuid BINARY(16) not null, primary key (id)) engine=MyISAM
alter table user add constraint UK_sb8bbouer5wak8vyiiy4pf2bx unique (username)
alter table user add constraint UK_1xc1iry6gqjrvh5cpajiq7l2f unique (uuid)
