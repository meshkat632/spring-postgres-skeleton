DROP TABLE IF EXISTS Greeting;
CREATE TABLE Greeting (  
  ID SERIAL PRIMARY KEY,
  referenceId CHAR(255) NOT NULL,
  text CHAR(255) NOT NULL,
  version int NOT NULL,
  createdBy CHAR(100) NOT NULL,
  createdAt DATE NOT NULL,
  updatedBy CHAR(100) DEFAULT NULL,
  updatedAt DATE DEFAULT NULL
);
