INSERT INTO product.provider(provider_id, name, address, email, phone, is_delete) VALUES (1, 'provider 1', 'Binh Thanh, Ho Chi Minh', 'provider1@gmail.com', '0900000000', false);
INSERT INTO product.provider(provider_id, name, address, email, phone, is_delete) VALUES (2, 'provider 2', 'Quan 2, Ho Chi Minh', 'provider2@gmail.com', '0900000001', false);
INSERT INTO product.provider(provider_id, name, address, email, phone, is_delete) VALUES (3, 'provider 3', 'Quan 9, Ho Chi Minh', 'provider3@gmail.com', '0900000002', false);
INSERT INTO product.provider(provider_id, name, address, email, phone, is_delete) VALUES (4, 'provider 4', 'Quan 1, Ho Chi Minh', 'provider4@gmail.com', '0900000003', false);
INSERT INTO product.provider(provider_id, name, address, email, phone, is_delete) VALUES (5, 'provider 5', 'Quan 6, Ho Chi Minh', 'provider5@gmail.com', '0900000004', false);

INSERT INTO product.image(image_id, title, url, base64, is_delete) VALUES (1, 'image product 1', 'https://hoclamdev.com/images/product/image1.png', '', false);
INSERT INTO product.image(image_id, title, url, base64, is_delete) VALUES (2, 'image product 2', 'https://hoclamdev.com/images/product/image1.png', '', false);
INSERT INTO product.image(image_id, title, url, base64, is_delete) VALUES (3, 'image product 3', 'https://hoclamdev.com/images/product/image1.png', '', false);
INSERT INTO product.image(image_id, title, url, base64, is_delete) VALUES (4, 'image product 4', 'https://hoclamdev.com/images/product/image1.png', '', false);
INSERT INTO product.image(image_id, title, url, base64, is_delete) VALUES (5, 'image product 5', 'https://hoclamdev.com/images/product/image1.png', '', false);
INSERT INTO product.image(image_id, title, url, base64, is_delete) VALUES (6, 'image category 1', 'https://hoclamdev.com/images/category/image1.png', '', false);
INSERT INTO product.image(image_id, title, url, base64, is_delete) VALUES (7, 'image category 2', 'https://hoclamdev.com/images/category/image1.png', '', false);
INSERT INTO product.image(image_id, title, url, base64, is_delete) VALUES (8, 'image category 3', 'https://hoclamdev.com/images/category/image1.png', '', false);
INSERT INTO product.image(image_id, title, url, base64, is_delete) VALUES (9, 'image category 4', 'https://hoclamdev.com/images/category/image1.png', '', false);
INSERT INTO product.image(image_id, title, url, base64, is_delete) VALUES (10, 'image category 5', 'https://hoclamdev.com/images/category/image1.png', '', false);

INSERT INTO product.category(category_id, name, image_id, description, is_delete) VALUES (1, 'Sach', 6, 'Danh muc sach', false);
INSERT INTO product.category(category_id, name, image_id, description, is_delete) VALUES (2, 'Ghe', 7, 'Danh muc ghe', false);
INSERT INTO product.category(category_id, name, image_id, description, is_delete) VALUES (3, 'Ban', 8, 'Danh muc ban', false);
INSERT INTO product.category(category_id, name, image_id, description, is_delete) VALUES (4, 'May tinh', 9, 'Danh muc may tinh', false);
INSERT INTO product.category(category_id, name, image_id, description, is_delete) VALUES (5, 'Dien thoai', 10, 'Danh muc dien thoai', false);

INSERT INTO product.product(product_id, name, provider_id, category_id, image_id, price, description, is_delete) VALUES (1, 'Sach 1', 1, 1, 1, 14000, 'Sach 1', false);
INSERT INTO product.product(product_id, name, provider_id, category_id, image_id, price, description, is_delete) VALUES (2, 'Ghe 1', 2, 2, 2, 20000, 'Ghe 1', false);
INSERT INTO product.product(product_id, name, provider_id, category_id, image_id, price, description, is_delete) VALUES (3, 'Ban 1', 3, 3, 3, 570000, 'Ban 1', false);
INSERT INTO product.product(product_id, name, provider_id, category_id, image_id, price, description, is_delete) VALUES (4, 'May tinh 1', 4, 4, 4, 10000, 'May tinh 1', false);
INSERT INTO product.product(product_id, name, provider_id, category_id, image_id, price, description, is_delete) VALUES (5, 'Dien thoai 1', 5, 5, 5, 457100, 'Dien thoai 1', false);

INSERT INTO product.product(product_id, name, provider_id, category_id, image_id, price, description, is_delete) VALUES (6, 'Sach 2', 1, 1, 1, 344454, 'Sach 2', false);
INSERT INTO product.product(product_id, name, provider_id, category_id, image_id, price, description, is_delete) VALUES (7, 'Ghe 2', 2, 2, 2, 345345, 'Ghe 2', false);
INSERT INTO product.product(product_id, name, provider_id, category_id, image_id, price, description, is_delete) VALUES (8, 'Ban 2', 3, 3, 3, 3545435, 'Ban 2', false);
INSERT INTO product.product(product_id, name, provider_id, category_id, image_id, price, description, is_delete) VALUES (9, 'May tinh 2', 4, 4, 4, 345345, 'May tinh 2', false);
INSERT INTO product.product(product_id, name, provider_id, category_id, image_id, price, description, is_delete) VALUES (10, 'Dien thoai 2', 5, 5, 5, 3454352, 'Dien thoai 2', false);
