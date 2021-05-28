drop user if exists 'user_spring5';

create database spring5;

grant all
on spring5.*
to 'user_spring5'@'localhost' identified by 'rootroot';