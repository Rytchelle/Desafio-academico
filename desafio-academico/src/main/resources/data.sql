
INSERT INTO Categoria (id, descricao) VALUES (1, 'Curso');
INSERT INTO Categoria (id, descricao) VALUES (2, 'Oficina');


INSERT INTO Bloco (id, inicio, fim) VALUES (1, '2017-09-25 08:00:00', '2017-09-25 11:00:00');
INSERT INTO Bloco (id, inicio, fim) VALUES (2, '2017-09-25 14:00:00', '2017-09-25 18:00:00');
INSERT INTO Bloco (id, inicio, fim) VALUES (3, '2017-09-26 08:00:00', '2017-09-26 11:00:00');


INSERT INTO Atividade (id, nome, descricao, preco) VALUES
    (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00);
INSERT INTO Atividade (id, nome, descricao, preco) VALUES
    (2, 'Oficina de Github', 'Controle versões de seus projetos', 50.00);


INSERT INTO Participante (id, nome, email) VALUES (1, 'José Silva', 'jose@gmail.com');
INSERT INTO Participante (id, nome, email) VALUES (2, 'Tiago Faria', 'tiago@gmail.com');
INSERT INTO Participante (id, nome, email) VALUES (3, 'Maria do Rosário', 'maria@gmail.com');
INSERT INTO Participante (id, nome, email) VALUES (4, 'Teresa Silva', 'teresa@gmail.com');
