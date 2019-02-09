INSERT INTO book VALUES (11, "The Pragmatic Programmer");

INSERT INTO member VALUES (43, "Vivian Liao");

INSERT INTO checkout_item VALUES (43, 11, NULL);

SELECT member.name FROM member, checkout_item, book WHERE book.title = 'The Pragmatic Programmer' AND book.id = checkout_item.book_id AND checkout_item.member_id = member.id;