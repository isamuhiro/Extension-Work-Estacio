DROP TABLE IF EXISTS chamados;
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS categoria;
DROP TABLE IF EXISTS departamento;

CREATE TABLE departamento (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome TEXT NOT NULL
);

INSERT INTO departamento (nome) VALUES ('TI');
INSERT INTO departamento (nome) VALUES ('RH');
INSERT INTO departamento (nome) VALUES ('Financeiro');


CREATE TABLE categoria (
   id INTEGER PRIMARY KEY AUTOINCREMENT,
   nome TEXT NOT NULL
);

INSERT INTO categoria (nome) VALUES ('Infraestrutura');
INSERT INTO categoria (nome) VALUES ('Suporte');
INSERT INTO categoria (nome) VALUES ('Desenvolvimento');

CREATE TABLE usuario (
     id INTEGER PRIMARY KEY AUTOINCREMENT,
     nome TEXT NOT NULL,
     departamento_id INTEGER,
     email TEXT UNIQUE NOT NULL,
     senha TEXT NOT NULL,
     FOREIGN KEY (departamento_id) REFERENCES departamento(id)
);

INSERT INTO usuario (nome, departamento_id, email, senha) VALUES ('João Silva', 1, 'joao@empresa.com', 'senha123');
INSERT INTO usuario (nome, departamento_id, email, senha) VALUES ('Maria Souza', 2, 'maria@empresa.com', 'senha123');
INSERT INTO usuario (nome, departamento_id, email, senha) VALUES ('Carlos Lima', 3, 'carlos@empresa.com', 'senha123');

CREATE TABLE chamados (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome TEXT NOT NULL,
  descricao TEXT,
  status TEXT NOT NULL,
  prioridade TEXT NOT NULL,
  responsavel_ID INTEGER,
  categoria INTEGER,
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  update_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (responsavel_ID) REFERENCES usuario(id),
  FOREIGN KEY (categoria) REFERENCES categoria(id)
);

INSERT INTO chamados (nome, descricao, status, prioridade, responsavel_ID, categoria) VALUES ('Problema de rede', 'Usuário sem internet', 'aberto', 'alta', 1, 1);
INSERT INTO chamados (nome, descricao, status, prioridade, responsavel_ID, categoria) VALUES ('Erro no sistema', 'Sistema travando na tela de login', 'em andamento', 'média', 2, 2);
INSERT INTO chamados (nome, descricao, status, prioridade, responsavel_ID, categoria) VALUES ('Solicitação de software', 'Usuário solicitou licença do software X', 'fechado', 'baixa', 3, 3);