CREATE TABLE cidade (
    id int NOT NULL PRIMARY KEY,
    nomeCidade VARCHAR(50) NOT NULL,
    cep int NOT NULL,

    ALTER TABLE `cidade` ADD CONSTRAINT `fk_cidade` FOREIGN KEY(`nomeCidade`)REFERENCES `cidade`(`nomeCidade`)
)
