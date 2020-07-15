create table user
(
    id int unsigned auto_increment primary key,
    email varchar(250) unique,
    password varchar(60),
    name varchar(50)
);

CREATE TABLE herb
(
    id bigint unsigned auto_increment primary key,
    name varchar(250),
    characteristic_id bigint unsigned,
    medical_condition_id bigint unsigned
);

CREATE TABLE medical_condition (

    id bigint unsigned auto_increment primary key,
    title varchar(250),
    herb_id bigint unsigned,
    foreign key (herb_id) references herb (id)
);

CREATE TABLE characteristic (

    id bigint unsigned auto_increment primary key,
    title varchar(250),
    herb_id bigint unsigned,
    foreign key (herb_id) references herb (id),
    is_child tinyint(1),
    is_pregnant tinyint(1),
    has_high_blood_pressure tinyint(1)
);

CREATE TABLE herb_characteristic (

    herb_id bigint unsigned,
    foreign key (herb_id) references herb (id),
    characteristic_id bigint unsigned,
    foreign key (characteristic_id) references characteristic (id),
    unique (herb_id, characteristic_id)
);

CREATE TABLE herb_medical_condition (

    herb_id bigint unsigned,
    foreign key (herb_id) references herb (id),
    medical_condition_id bigint unsigned,
    foreign key (medical_condition_id) references medical_condition (id),
    unique (herb_id, medical_condition_id)
);


ALTER TABLE herb ADD FOREIGN KEY (characteristic_id) REFERENCES characteristic(id);

ALTER TABLE herb ADD FOREIGN KEY (medical_condition_id) REFERENCES medical_condition(id);
