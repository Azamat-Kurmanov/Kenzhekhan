create table dictionary_tables (
    id             bigserial primary key,
    name_ru        varchar(255) unique not null,
    title          varchar(255) unique not null,
    description    varchar(255),
    user_id        varchar(255),
    created_at     timestamp default CURRENT_TIMESTAMP,
    updated_at     timestamp default CURRENT_TIMESTAMP
);

insert into dictionary_tables (name_ru, title, description, user_id)
values ('Сезоны', 'seasons', '', 'AZAMAT'), ('Склад', 'warehouse', '', 'AZAMAT'), ('Вид товара', 'goodsKind', '', 'AZAMAT'), ('Тип товара', 'typeOfGoods', '', 'AZAMAT'), ('Подтип товара','subTypeOfGoods', '', 'AZAMAT'), ('Половой признак','gender', '', 'AZAMAT');

create table dictionary_values(
    id             bigserial primary key,
    title          varchar(255) not null,
    tbl_id         bigint not null references dictionary_tables (id),
    user_id        varchar(255),
    created_at     timestamp default CURRENT_TIMESTAMP,
    updated_at     timestamp default CURRENT_TIMESTAMP
);

insert into dictionary_values (title, tbl_id, user_id) values ('Зима', 1, 'AZAMAT'), ('Весна', 1, 'AZAMAT'), ('Лето', 1, 'AZAMAT'), ('Осень', 1, 'AZAMAT');
insert into dictionary_values (title, tbl_id, user_id) values ('6-ой склад', 2, 'AZAMAT'), ('Новый склад', 2, 'AZAMAT'), ('Кенжехан-2', 2, 'AZAMAT');
insert into dictionary_values (title, tbl_id, user_id) values ('Одежда', 3, 'AZAMAT'), ('Верхняя', 4, 'AZAMAT'), ('Нижняя', 4, 'AZAMAT');
insert into dictionary_values (title, tbl_id, user_id) values ('Взрослая', 5, 'AZAMAT'), ('Детская', 5, 'AZAMAT'), ('Мужской', 6, 'AZAMAT'), ('Женский', 6, 'AZAMAT');

create table categories
(
   id                   bigserial primary key,
   title                varchar(255),
   goods_kind_id        bigint not null,
   seasons_id           bigint not null,
   sub_type_of_goods_id bigint not null,
   gender_id            bigint not null,
   user_id              varchar(255),
   created_at           timestamp default current_timestamp,
   updated_at           timestamp default current_timestamp
);

create table provider (
  id                bigserial primary key,
  first_name        varchar(255),
  last_name         varchar(255),
  middle_name       varchar(255),
  country           varchar(255),
  region            varchar(255),
  city_village      varchar(255),
  address           varchar(255),
  phone             varchar(255),
  email             varchar(255),
  user_id           varchar(255),
  created_at        timestamp default current_timestamp,
  updated_at        timestamp default current_timestamp
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
   warehouse_id      bigint not null,
   provider_id       bigint not null,
   category_id       bigint not null,
   cur_year          int not null,
   user_id           varchar(255),
   created_at        timestamp default current_timestamp,
   updated_at        timestamp default current_timestamp
);


