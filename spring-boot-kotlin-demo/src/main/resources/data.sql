INSERT INTO restaurants (name, location, lat, lng) VALUES ('test', 'Helsinki', 123, 456);

INSERT INTO menus (restaurant_id, menu_date, title, menu_text) VALUES (1, CURRENT_DATE(), 'Soups', 'Hello, World!');

INSERT INTO customer (id, first_name, last_name) VALUES (1, 'Jack', 'Bauer');
INSERT INTO customer (id, first_name, last_name) VALUES (2, 'Chloe', 'O"Brian');
INSERT INTO customer (id, first_name, last_name) VALUES (3, 'Kim', 'Bauer');
INSERT INTO customer (id, first_name, last_name) VALUES (4, 'David', 'Palmer');
INSERT INTO customer (id, first_name, last_name) VALUES (5, 'Michelle', 'Dessler');

INSERT INTO document (id, code, name, status, type, version, owner, created_dated, last_modified_dated) VALUES (1, 'DOC001', 'First Document', 1, 100, 1, 502, CURRENT_DATE(), CURRENT_DATE());