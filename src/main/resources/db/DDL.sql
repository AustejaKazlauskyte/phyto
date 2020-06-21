CREATE TABLE herb
(
    id bigint unsigned auto_increment primary key,
    name varchar(250) not null,
    characteristic_id bigint unsigned not null,
    foreign key (characteristic_id) references characteristic (id),
    medical_condition_id bigint unsigned not null,
    foreign key (medical_condition_id) references medical_condition (id)
);

CREATE TABLE medical_condition (

    id bigint unsigned auto_increment primary key,
    title varchar(250) not null,
    herb_id bigint unsigned not null,
    foreign key (herb_id) references herb (id),
    characteristic_id bigint unsigned not null,
    foreign key (characteristic_id) references characteristic (id)
);

CREATE TABLE characteristic (

    id bigint unsigned auto_increment primary key,
    title varchar(250) not null,
    herb_id bigint unsigned not null,
    foreign key (herb_id) references herb (id),
    medical_condition_id bigint unsigned not null,
    foreign key (medical_condition_id) references medical_condition (id),
    is_child tinyint(1) not null,
    is_pregnant tinyint(1) not null,
    has_high_blood_pressure tinyint(1) not null
);

CREATE TABLE herb_characteristic (

    herb_id bigint unsigned not null,
    foreign key (herb_id) references herb (id),
    characteristic_id bigint unsigned not null,
    foreign key (characteristic_id) references characteristic (id),
    unique (herb_id, characteristic_id)
);

CREATE TABLE herb_medical_condition (

    herb_id bigint unsigned not null,
    foreign key (herb_id) references herb (id),
    medical_condition_id bigint unsigned not null,
    foreign key (medical_condition_id) references medical_condition (id),
    unique (herb_id, medical_condition_id)
);

CREATE TABLE characteristic_medical_condition (

    characteristic_id bigint unsigned not null,
    foreign key (characteristic_id) references characteristic (id),
    medical_condition_id bigint unsigned not null,
    foreign key (medical_condition_id) references medical_condition (id),
    unique (characteristic_id, medical_condition_id)
);

