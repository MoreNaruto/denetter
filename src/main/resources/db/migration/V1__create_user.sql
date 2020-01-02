CREATE TABLE users (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  uuid binary(16) NOT NULL,
  username varchar(100) NOT NULL,
  first_name varchar(50) NOT NULL,
  last_name varchar(50) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;