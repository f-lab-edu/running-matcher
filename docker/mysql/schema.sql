CREATE DATABASE IF NOT EXISTS `runmble`;

CREATE USER IF NOT EXISTS 'runmble_developer'@'%' IDENTIFIED BY '1q2w3e4r';
GRANT ALL PRIVILEGES ON `runmble`.* TO 'runmble_developer'@'%';
FLUSH PRIVILEGES;

