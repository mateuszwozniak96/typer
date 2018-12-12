insert into `user` values(1,'konrad95','konrad@poczta.com','konrad','zadroga','haslo');
insert into `user` values(2,'Ania','ania@poczta.com','ania','pakos','haslo');
insert into `user` values(3,'Matuesz','mateusz@poczta.com','matuesz','wojda','haslo');
insert into `user` values(4,'Pawel','pawel@poczta.com','pawel','rzyszkiewicz','haslo');

insert into league values(1, 'Liga Konrada');
insert into league values(2,'Liga iks de');

insert into membership values(1, 1, 1, 10);
insert into membership values(2, 1, 2, 20);
insert into membership values(3, 1, 3, 30);
insert into membership values(4, 1, 4, 40);
insert into membership values(5, 2, 2, 550);
insert into membership values(6, 2, 3, 510);
insert into membership values(7, 2, 4, 12);

insert into queue values(1,1,1);
insert into queue values(2,1,2);
insert into queue values(3,2,1);
insert into queue values(4,2,2);

insert into match_table values(1, 'Pulawy', 'Naleczow', 1, 2, curdate(),1);
insert into match_table values(2, 'Legia Warszawa', 'Lech Poznan', 2, 2, curdate(),1);
insert into match_table values(3, 'Chelsea', 'Arsenal', 5, 0, curdate(),1);
insert into match_table values(4, 'Naleczow', 'Pulawy', 2, 0, curdate(),2);
insert into match_table values(6, 'Barcelona', 'Chelsea', 1, 4, curdate(),3);
insert into match_table values(7, 'Real Madryt', 'Chelsea', 1, 5, curdate(),4);

insert into bet values(1, 1,2,1,curdate()-1,1);
insert into bet values(2, 5,2,2,curdate()-1,2);
insert into bet values(3, 4,2,3,curdate()-1,3);
insert into bet values(4, 1,3,4,curdate()-1,4);
