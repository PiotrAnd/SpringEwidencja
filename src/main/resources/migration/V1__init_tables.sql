
CREATE TABLE car50a (
	id bigint NOT NULL AUTO_INCREMENT,
	nr_sprawy varchar(20) NULL,
	marka_pojazdu varchar(30) NULL,
	nr_rejestracyjny varchar(30) NULL,
	wlasciciel varchar(50) NULL,
	PRIMARY KEY(ID)
	);

create sequence hibernate_sequence;

INSERT INTO car50a(ID,nr_sprawy,marka_pojazdu,nr_rejestracyjny,wlasciciel)VALUES
(NULL,'DGK-I.7235.1.2019','Opel Astra','BIA 8989V','Adam Grucha');
INSERT INTO car50a(ID,nr_sprawy,marka_pojazdu,nr_rejestracyjny,wlasciciel)VALUES
(NULL,'DGK-I.7235.2.2019','Fiat Panda','BIA 8984V','Marek Grucha');

alter sequence hibernate_sequence restart with 500;
