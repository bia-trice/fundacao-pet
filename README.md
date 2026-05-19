# 🐾 Fundação Pet — README

## 📌 Apresentação do Projeto

A **Fundação Pet** é uma iniciativa criada com o propósito de ajudar animais em situação de rua, especialmente no combate à fome e à falta de cuidados básicos. O projeto nasce da necessidade urgente de enfrentar uma realidade cada vez mais comum nas cidades: o grande número de animais abandonados que vivem sem acesso a alimentação adequada, cuidados veterinários e proteção.

Além disso, a solução foi desenvolvida como um **website responsivo**, pensado para **fácil manipulação em celulares e tablets**, garantindo acessibilidade para o maior número possível de pessoas, facilitando doações, acesso à informação e uso da plataforma em qualquer lugar.

### 🐶 Problema

A problemática dos animais em situação de rua vai muito além da ausência de um lar. Milhares de cães e gatos vivem diariamente expostos à fome, doenças, maus-tratos e condições climáticas extremas. A falta de alimentação adequada compromete diretamente a saúde desses animais, tornando-os mais vulneráveis a doenças, desnutrição e até à morte.

Sem acesso regular à comida, muitos animais precisam disputar restos de alimento no lixo ou depender da boa vontade de pessoas, o que não garante uma nutrição adequada. Isso gera fraqueza, baixa imunidade e aumenta significativamente o risco de doenças graves.

Além disso, muitos desses animais não recebem qualquer tipo de acompanhamento veterinário, o que agrava ainda mais seu estado de saúde. Problemas como infecções, parasitas, ferimentos e doenças crônicas são comuns e frequentemente ignorados por falta de recursos e informação.

Outro fator agravante é a falta de conscientização da população sobre temas como:
- Abandono de animais  
- Importância da castração  
- Vacinação adequada  
- Alimentação correta  
- Denúncia de maus-tratos  

Sem educação e engajamento social, o ciclo de abandono e sofrimento continua se perpetuando, aumentando o número de animais nas ruas e agravando ainda mais a situação.

Diante desse cenário, a Fundação Pet busca atuar não apenas oferecendo ajuda direta, mas também promovendo conscientização e educação por meio da tecnologia.

### 💡 Proposta da Solução

A solução consiste em um **site interativo, educativo e acessível**, que conecta tecnologia, inteligência artificial e impacto social.

O principal diferencial do projeto é a **IA Pet**, uma ferramenta inteligente que auxilia na orientação alimentar de animais, considerando informações como:

- Tipo de animal  
- Idade  
- Porte  
- Peso  
- Sintomas  
- Alimentação atual  

A partir desses dados, o sistema gera:
- Sugestão de alimentação ideal  
- Quantidade diária estimada  
- Alertas de possíveis problemas  
- Grau de risco  
- Aviso: *"Essa ferramenta não substitui consulta veterinária"*  

Além disso, o site conta com diversas funcionalidades:

- 📢 **Tela de conscientização**  
  Apresenta a missão, visão e como a fundação atua.

- 🍽️ **Sistema de doações**  
  As doações são convertidas em ração, que é distribuída por meio de comedouros automáticos.

- 📊 **Transparência financeira**  
  Exibição do total arrecadado, destino dos recursos e relatórios mensais.

- 📚 **Área educacional**  
  Conteúdos sobre abandono, castração, vacinação, alimentação correta e denúncias de maus-tratos.

- 🚨 **Tela de emergência**  
  Lista de sinais graves e orientações sobre quando procurar um veterinário, além de ONGs parceiras.

- 🤝 **Comunidade**  
  Espaço para usuários pedirem ajuda, postarem dúvidas, relatarem casos, curtir e comentar.

- 💰 **Tela de doação**  
  Valores rápidos e personalizados com impacto direto (ex: “sua doação compra 3kg de ração”).

- 📸 **Campanhas ativas**  
  Exibição de ações realizadas e fotos ajudando animais.

---

## 🎯 Objetivos do Projeto

- Combater a fome de animais em situação de rua  
- Promover conscientização sobre a causa animal  
- Utilizar tecnologia para auxiliar na saúde e bem-estar dos pets  
- Incentivar doações de forma transparente e acessível  
- Criar uma comunidade engajada em ajudar animais  
- Reduzir o abandono por meio da educação  
- Facilitar o acesso à informação sobre cuidados básicos e emergenciais  
- Garantir acessibilidade com uma plataforma adaptada para dispositivos móveis  

---

## 👩‍💻 Participantes

**Equipe Patas 🐾**

- **Biatrice Montes Fontes** — Desenvolvimento no FlutterFlow, idealização e pesquisa  
- **Luiza Helena Eckardt Pitzer** — Desenvolvimento Back-end, idealização e pesquisa  
- **Maria Luisa Almeida Pereira** — Banco de Dados, idealização e pesquisa  

---

## 🛠️ Tecnologias Utilizadas

- **FlutterFlow** — Desenvolvimento da interface e estrutura do site  
- **Visual Studio Code (VS Code)** — Ambiente de desenvolvimento  
- **DBeaver** — Gerenciamento e modelagem do banco de dados  

---

## ❤️ Impacto Esperado

A Fundação Pet busca gerar impacto real na vida de animais em situação de rua, utilizando tecnologia como ponte entre pessoas dispostas a ajudar e animais que precisam de cuidados.

Mais do que uma plataforma digital, o projeto representa um movimento de empatia, responsabilidade e transformação social, tornando mais fácil ajudar — diretamente pelo celular, de forma simples, rápida e acessível.

https://prod.liveshare.vsengsaas.visualstudio.com/join?78E70534DB682BBC09380136AABF6203C773

banco: 
create database fundacaopet;

create table usuario( 
id_usuario serial primary key, 
nome varchar (100) not null,
email varchar (150) unique not null, 
senha varchar (8) not null, 
cidade varchar (100) not null 
);

create table campanha ( 
id_campanha serial primary key, 
titulo varchar(150) unique not null, 
descricao text, meta_valor decimal (10, 2) not null, 
valor_arrecadado decimal (10,2) not null, 
data_inicio date, 
data_fim date, 
status varchar (20) default 'ativa' 
);

create table doacao ( 
id_doacao serial primary key, 
id_usuario int references usuario(id_usuario), 
id_campanha int references campanha(id_campanha), 
valor decimal (10,2) not null, 
tipo_doacao varchar (20), 
forma_pagamento varchar(20), 
status_pagamento varchar(20), 
data_doacao timestamp 
);

CREATE TABLE publicacao (
id_publicacao SERIAL PRIMARY KEY, 
id_usuario INT REFERENCES usuario(id_usuario), 
titulo VARCHAR(150), 
descricao TEXT,
data_publicacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);

CREATE TABLE comentario ( 
id_comentario SERIAL PRIMARY KEY, 
id_publicacao INT REFERENCES publicacao(id_publicacao), 
id_usuario INT REFERENCES usuario(id_usuario), 
texto TEXT, data_comentario TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);

CREATE TABLE relatorio ( 
id_relatorio SERIAL PRIMARY KEY, 
mes_referencia VARCHAR(20), 
total_arrecadado DECIMAL(10,2), 
descricao TEXT, 
data_publicacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);

CREATE TABLE analise_pet_ia (
id SERIAL PRIMARY KEY,
tipo_animal VARCHAR(100),
idade VARCHAR(50),
porte VARCHAR(50),
peso VARCHAR(50),
sintomas TEXT,
alimentacao_atual TEXT,
resposta_ia TEXT,
grau_risco VARCHAR(20),
data_analise TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
[https://prod.liveshare.vsengsaas.visualstudio.com/join?D57A4BAB8FD536EDDD3DF9E7F2089353A599]

