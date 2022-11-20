create table users(
	usr_id serial not null,
	usr_name varchar(30),
	usr_telefone int,
	usr_data_nasc date not null,
	usr_emaill varchar(30),
	usr_senha varchar(30),
	primary key (usr_id)
);

Create table jogo(
jogo_id serial not null,
	jogo_nome varchar(30),
	jogo_numero_maximo int,
	jogo_descricao varchar(30),
	urs_id int not null,
	primary key(jogo_id)
);

create table estado_participante_jogo(
estado_participante_jogo_id serial not null,
	estado_jogo_nome varchar(30),
	primary key(estado_jogo_id)
);

create table participante(
participante_id serial not null,
	part_nome varchar(30),
	part_tipo_desporto varchar(30),
	jogo_id int not null,
	usr_id int not null,
	primary key(participante_id)
);

create table participante_jogo(
	pajo_id serial not null,
	pajo_usr_id int not null,
	pajo_jogo_id int not null,
	primary key(participante_jogo_id)
);


create table modalidade_jogo(
modalidade_jogo_id serial not null,
jogo_id int not null,
	primary key(modalidade_jogo_id)
	
);

create table campo(
campo_id serial not null,
	campo_nome varchar(40),
	campo_localizacao varchar(40),
	campo_dias_disponiveis date,
	campo_horarios_disponiveis date,
	tipo_campo_id int not null,
	primary key(campo_id)
);

create table tipo_campo(
tipo_campo_id serial not null,
	estrutura_tipo_campo varchar(30),
	primary key(tipo_campo_id)
);

create table modalidade_campo(
modalidade_campo_id serial not null,
campo_id int not null,
	primary key(modalidade_campo_id)
);



alter table participante
add constraint participante_fk_users
foreign key(pajo_usr_id) references users(usr_id)
on delete no action on update no action;

alter table participante
add constraint participante_fk_jogo
foreign key(pajo_jogo_id) references jogo(jogo_id)
on delete no action on update no action;

alter table jogo
add constraint mjogo_fk_modalidade_jogo
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

alter table participante_jogo
add constraint participante_jogo_fk_participante
foreign key(participante_jogo_id) references participante(participante_id)
on delete no action on update no action;

alter table participante_jogo
add constraint participante_jogo_fk_estado_participante_jogo
foreign key(participante_jogo_id) references estado_participante_jogo(estado_participante_jogo_id)
on delete no action on update no action;
