create table item (
  id bigint not null primary key,
  name varchar(255) not null,
  description text not null,
  item_status varchar(20) not null,
  created_at timestamp not null default current_timestamp,
  updated_at timestamp not null default current_timestamp
);