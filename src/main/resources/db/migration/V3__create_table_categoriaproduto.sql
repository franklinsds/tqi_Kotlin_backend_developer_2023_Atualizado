CREATE TABLE categoriaproduto (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   nome_categoria VARCHAR(255),
   customer_id BIGINT,
   CONSTRAINT pk_categoriaproduto PRIMARY KEY (id)
);

ALTER TABLE categoriaproduto ADD CONSTRAINT FK_CATEGORIAPRODUTO_ON_CUSTOMER FOREIGN KEY (customer_id) REFERENCES customer (id);