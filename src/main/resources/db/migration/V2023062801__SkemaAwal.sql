create table users
(
    id       varchar(255) not null,
    active   bit          not null,
    password varchar(20)  not null,
    username varchar(20)  not null,
    primary key (id)
);

alter table users
    add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)
