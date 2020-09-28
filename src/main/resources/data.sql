
DROP TABLE IF EXISTS books;

CREATE TABLE books (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  author VARCHAR(250) NOT NULL,
  isbn VARCHAR(250) DEFAULT NULL
);

INSERT INTO books (name, author, isbn) VALUES
  ('Aliko', 'Bill Dangote', '234234-2342'),
  ('einstein', 'Jack Alakija', 'rerwer-werawer');