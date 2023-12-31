CREATE TABLE clockRegistry (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    type varchar(255) NOT NULL,
    userId varchar(255) NOT NULL,
    location JSON NOT NULL,
    time TIME NOT NULL,
    date DATE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
