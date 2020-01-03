CREATE TABLE user (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  uuid binary(16) NOT NULL,
  username varchar(100) NOT NULL,
  first_name varchar(50) NOT NULL,
  last_name varchar(50) DEFAULT NULL,
  email varchar(100) NOT NULL,
  age int DEFAULT 0,
  birthday date DEFAULT NULL,
  role varchar(30) NOT NULL,
  phone varchar(20) DEFAULT NULL,
  create_at timestamp NOT NULL,
  updated_at timestamp DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;