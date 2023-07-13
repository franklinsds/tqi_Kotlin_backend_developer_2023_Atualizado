CREATE TABLE carrinho (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   qtde_produtos INT NOT NULL,
   nome_produtos VARCHAR(255),
   preco_unit BIGINT NOT NULL,
   total_compra BIGINT NOT NULL,
   customer_id BIGINT,
   CONSTRAINT pk_carrinho PRIMARY KEY (id)
);

ALTER TABLE carrinho ADD CONSTRAINT FK_CARRINHO_ON_CUSTOMER FOREIGN KEY (customer_id) REFERENCES customer (id);