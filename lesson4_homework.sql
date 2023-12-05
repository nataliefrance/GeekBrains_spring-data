BEGIN;

DROP TABLE IF EXISTS products CASCADE;
CREATE TABLE products (id bigserial PRIMARY KEY, title VARCHAR(255), cost bigint);
INSERT INTO products (title, cost) VALUES
('juice', 100),
('water', 150),
('bread', 99),
('pancakes', 99),
('tomatoes', 250),
('cucumbers', 200),
('onion', 50),
('potatoes', 50),
('apples', 199),
('pears', 249),
('oranges', 189),
('milk', 89),
('sour cream', 99),
('cake', 399),
('pizza', 550),
('lemons', 160),
('candy', 60),
('croissant', 50),
('chocolate', 149),
('cookie', 79);

COMMIT;