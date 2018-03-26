CREATE TABLE `user` (
  `user_id` varchar(10) NOT NULL default '',
  `user_name` varchar(50) default NULL,
  `user_age` varchar(50) default NULL,
  `department_id` int(10) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;