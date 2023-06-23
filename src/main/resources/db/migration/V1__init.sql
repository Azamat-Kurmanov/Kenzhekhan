create table seasons (
   id              bigserial primary key,
   title           varchar(255) unique
);

insert into seasons (title) values ('Зима'), ('Весна'), ('Лето'), ('Осень');

create table warehouse (
   id              bigserial primary key,
   title           varchar(255) unique
);

insert into warehouse (title) values ('6-ой склад'), ('Новый склад'), ('Кенжехан-2');

create table goodsKind (
   id              bigserial primary key,
   title           varchar(255) unique
);

insert into goodsKind (title) values ('Одежда');

create table typeOfGoods(
   id              bigserial primary key,
   title           varchar(255) unique
);

insert into typeOfGoods (title) values ('Верхняя'), ('Нижняя');

create table subTypeOfGoods(
   id              bigserial primary key,
   title           varchar(255) unique
);

insert into subTypeOfGoods (title) values ('Взрослая'), ('Детская');

create table gender (
   id              bigserial primary key,
   title           varchar(255) unique
);

insert into gender (title) values ('Мужской'), ('Женский');

create table categories
(
   id                   bigserial primary key,
   title                varchar(255),
   goods_kind_id        bigint references goodsKind (id),
   seasons_id           bigint references seasons (id),
   sub_type_of_goods_id bigint references subTypeOfGoods (id),
   gender_id            bigint references gender (id),
   created_at           timestamp default current_timestamp,
   updated_at           timestamp default current_timestamp
);

create table provider (
                              id                bigserial primary key,
                              full_name         varchar(255),
                              address           varchar(255),
                              phone             varchar(255),
                              email             varchar(255)
);

create table goods (
   id                bigserial primary key,
   title             varchar(255),
   item_number       varchar(255),
   good_size         int not null,
   price             numeric(8, 2),
   color             varchar(255),
   quantity          int not null,
   description       varchar(255),
   press_number      varchar(255),
   warehouse_id      bigint references warehouse (id),
   provider_id       bigint references provider (id),
   created_at        timestamp default current_timestamp,
   updated_at        timestamp default current_timestamp
);


