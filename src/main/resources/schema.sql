CREATE TABLE IF NOT EXISTS
    EMPLOYEE (
                 id INT NOT NULL AUTO_INCREMENT,
                 first_name VARCHAR(255),
    last_name VARCHAR(255),
    department VARCHAR(255),
    salary DECIMAL(15,5),
    PRIMARY KEY (id)
    );