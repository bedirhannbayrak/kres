DROP TABLE IF EXISTS `ders`;
DROP TABLE IF EXISTS `ders_ogretmen`;
DROP TABLE IF EXISTS `ogrenci`;
DROP TABLE IF EXISTS `ogretmen`;
DROP TABLE IF EXISTS `sinif`;
DROP TABLE IF EXISTS `sinif_ogrenci`;
DROP TABLE IF EXISTS `veli`;
DROP TABLE IF EXISTS `veli_cocuklar`;
DROP TABLE IF EXISTS `yonetici`;

create table ders
(
    id  int          not null
        primary key,
    ad  varchar(255) null,
    kod varchar(255) null
);

create table ogretmen
(
    id       int          not null
        primary key,
    ad       varchar(255) null,
    soyad    varchar(255) null,
    brans    varchar(255) null,
    sinif_id int          null
);

create table ders_ogretmen
(
    ders_id     int not null,
    ogretmen_id int not null,
    constraint FKgu5g30oyeauqtfqurhuwami6k
        foreign key (ders_id) references ders (id),
    constraint FKplwebhm00y17ajgbs94c740tu
        foreign key (ogretmen_id) references ogretmen (id)
);

create table sinif
(
    id          int          not null
        primary key,
    no          varchar(255) null,
    ogretmen_id int          null,
    constraint FK1b3k5l7pxponitdlpn6r88a38
        foreign key (ogretmen_id) references ogretmen (id)
);

alter table ogretmen
    add constraint FK177bic84bck4olmn3sgop7lg9
        foreign key (sinif_id) references sinif (id);

create table veli
(
    id    int          not null
        primary key,
    ad    varchar(255) null,
    soyad varchar(255) null
);

create table ogrenci
(
    id          int          not null
        primary key,
    ad          varchar(255) null,
    soyad       varchar(255) null,
    dogum_yili  int          null,
    ogretmen_id int          null,
    sinif_id    int          null,
    veli_id     int          null,
    constraint FK37cx1j76j8m1w4ybiul6136ge
        foreign key (veli_id) references veli (id),
    constraint FK9hkcga3bwljql1mo1egdces8m
        foreign key (sinif_id) references sinif (id),
    constraint FKjc4vifs8l96h7nki6e102di48
        foreign key (ogretmen_id) references ogretmen (id)
);

create table sinif_ogrenci
(
    sinif_id   int not null,
    ogrenci_id int not null,
    constraint UK_5aiqvru3crrp43qy9jkxu7w56
        unique (ogrenci_id),
    constraint FK4809y8dppg47ymuu2wq4buwi3
        foreign key (sinif_id) references sinif (id),
    constraint FKqnas3vukqxowve5onobnvj52
        foreign key (ogrenci_id) references ogrenci (id)
);

create table veli_cocuklar
(
    veli_id     int not null,
    cocuklar_id int not null,
    constraint UK_svorgn1wwgtcd1cvffrkvfuen
        unique (cocuklar_id),
    constraint FK611i5u8clwf8po8x4r11j6ru2
        foreign key (cocuklar_id) references ogrenci (id),
    constraint FKkof0oduvpr7i44p2cs9ra5vvj
        foreign key (veli_id) references veli (id)
);

create table yonetici
(
    id            int          not null
        primary key,
    ad            varchar(255) null,
    soyad         varchar(255) null,
    kullanici_adi varchar(255) null,
    sifre         varchar(255) null
);

