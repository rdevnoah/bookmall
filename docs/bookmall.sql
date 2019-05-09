show tables;


select * from book;
desc book;
desc cart;
desc category;
desc member;
desc orders;
desc orders_book;

drop table book;
drop table cart;
drop table category;
drop table member;
drop table orders;
drop table orders_book;

alter table orders change no no int unsigned auto_increment not null;

select * from member;


insert into member values(null, '김영호', PASSWORD('1234'), '010-4532-3018', 'zzagam2@gmail.com');
insert into member values(null, '서장규', PASSWORD('5678'), '010-3333-4444', 'janggyu@naver.com');
insert into member values(null, '강수진', PASSWORD('1212'), '010-5555-6666', 'sujin@gmail.com');
insert into member values(null, '이정은', PASSWORD('5555'), '010-7777-8888', 'jungeun@gmail.com');
insert into member values(null, '김성주', PASSWORD('ghghsdf'), '010-0000-9999', 'sungjoo@gmail.com');

select no, name, passwd, phone, email from member
order by no asc;


desc category;
select * from category;


select no, name from category order by no asc;
insert into category values(null,'소설');


desc book;
select * from book;

insert into book values(null, '대규모 서비스를 지탱하는 기술', 20000, 3);

insert into book values(null, '시집', 13500, 4);


select no, title, price, category_no from book;

desc cart;

desc orders_book;

ALTER TABLE `orders_book`
	ADD CONSTRAINT `PK_orders_book` -- 주문도서 기본키
		PRIMARY KEY (
			`order_no`, -- 주문번호
			`book_no`   -- 책 번호
		);

ALTER TABLE `cart`
	ADD CONSTRAINT `PK_cart` -- 장바구니 기본키
		PRIMARY KEY (
			`member_no`, -- 고객번호
			`book_no`    -- 책번호
		);
		
		
alter table `orders`
	add amount INT; 		
		
select * from cart;

insert into cart values(1, 1, 2);
insert into cart values(1, 3, 1);


delete from cart where member_no=1 and book_no=1;
-- 도서 제목, 수량, 가격

select sum(b.price * c.amount) as price 
from book b, cart c, member m
where c.member_no = m.no
and c.book_no = b.no
and m.no=1;


desc orders;

alter table `orders`
	add order_date DATE not null;


-- 주문번호, 주문자, 결제금액, 배송지

insert into orders values(null, 2, 50000, '서울');




desc orders;

select no, member_no, price, address from orders where member_no=2;


desc orders_book;

select last_insert_id();
SELECT DATE_FORMAT(now(), '%Y-%m-%d');

alter table orders drop order_date;


desc orders;

-- 주문번호, 주문자 이름, 주문자 이메일, 결제금액, 배송지

select o.no, m.name, m.email, o.price, o.address
from orders o, member m
where o.member_no = m.no
and m.no=2;

select * from orders where member_no=2;

select * from orders_book;
insert into orders_book values(1, 2, 2);
insert into orders_book values(1, 3, 1);
insert into orders_book values(1, 1, 3);


-- 도서번호, 도서제목, 수량

select b.no, b.title, ob.count
from book b, orders_book ob
where b.no = ob.book_no
and ob.order_no=1;

select * from orders_book where order_no = 4;