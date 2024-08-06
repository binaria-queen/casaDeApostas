CREATE TABLE eventos (
    idEvento INT AUTO_INCREMENT PRIMARY KEY,
    idAposta INT NOT NULL,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    dataHoraEvento TIMESTAMP,
    odds CLOB, -- Utilizamos CLOB para armazenar JSON como texto
    dataHoraAposta TIMESTAMP
);
