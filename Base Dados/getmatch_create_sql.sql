create table users(
	users_id serial not null,
	user_name varchar(30),
	telefone int,
	data_nasc date not null,
	emaill varchar(30),
	senha varchar(30),
	primary key (users_id)
);

Create table jogo(
jogo_id serial not null,
	jogo_nome varchar(30),
	numero_maximo int,
	descricao varchar(30),
	primary key(jogo_id)
);

create table estado_jogo(
estado_jogo_id serial not null,
	estado varchar(30),
	primary key(estado_jogo_id)
);
create table modalidade_jogo(
modalidade_jogo_id serial not null,
	primary key(modalidade_jogo_id)
);

create table participante(
participante_id serial not null,
	nome varchar(30),
	tipo_desporto varchar(30),
	primary key(participante_id)
);

create table campo(
campo_id serial not null,
	campo_nome varchar(40),
	localizacao varchar(40),
	dias_disponiveis date,
	horarios_disponiveis date,
	primary key(campo_id)
);

create table tipo_campo(
tipo_campo_id serial not null,
	estrutura varchar(30),
	primary key(tipo_campo_id)
);

create table modalidade_campo(
modalidade_campo_id serial not null,
	primary key(modalidade_campo_id)
);

create table participante_jogo(
	participante_jogo_id serial not null,
	primary key(participante_jogo_id)
);

alter table jogo
add constraint jogo_fk_users
foreign key(jogo_id) references users(users_id)
on delete no action on update no action;

alter table jogo
add constraint jogo_fk_modalidade_jogo
foreign key(jogo_id) references modalidade_jogo(modalidade_jogo_id)
on delete no action on update no action;

alter table campo
add constraint campo_fk_jogo
foreign key(campo_id) references jogo(jogo_id)
on delete no action on update no action;

alter table tipo_campo
add constraint campo_fk_campo
foreign key(tipo_campo_id) references campo(campo_id)
on delete no action on update no action;

alter table modalidade_campo
add constraint modalidade_campo_fk_campo
foreign key(modalidade_campo_id) references campo(campo_id)
on delete no action on update no action;

alter table modalidade_campo
add constraint modalidade_campo_fk_modalidade_jogo
foreign key(modalidade_campo_id) references modalidade_jogo(modalidade_jogo_id)
on delete no action on update no action;

alter table participante
add constraint participante_fk_users
foreign key(participante_id) references users(users_id)
on delete no action on update no action;

alter table participante
add constraint participante_fk_jogo
foreign key(participante_id) references jogo(jogo_id)
on delete no action on update no action;

alter table participante_jogo
add constraint participante_jogo_fk_participante
foreign key(participante_jogo_id) references participante(participante_id)
on delete no action on update no action;

alter table participante_jogo
add constraint participante_jogo_fk_estado_jogo
foreign key(participante_jogo_id) references estado_jogo(estado_jogo_id)
on delete no action on update no action;
