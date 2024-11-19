insert into user_details (id, name, birth_date)
values (10001, 'Sarath', current_date());

insert into user_details (id, name, birth_date)
values (10002, 'Rajesh', current_date());

insert into user_details (id, name, birth_date)
values (10003, 'Praveen', current_date());

insert into post (id, user_id, description)
values (20001, 10001, 'I Want to learn AWS');

insert into post (id, user_id, description)
values (20002, 10001, 'I Want to learn Devops');

insert into post (id, user_id, description)
values (20003, 10002, 'I Want to learn Android');

insert into post (id, user_id, description)
values (20004, 10002, 'I Want to google Cloud');