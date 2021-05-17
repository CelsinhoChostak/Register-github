CREATE TABLE cidade (
    id int NOT NULL PRIMARY KEY,
    idestado int NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    cep int NOT NULL
)
 ALTER TABLE `cidade` ADD CONSTRAINT `fk_cidade` FOREIGN KEY(`cidade`)REFERENCES `cidade`(`cidade`)
