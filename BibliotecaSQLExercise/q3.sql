SELECT title FROM book LEFT JOIN checkout_item ON id=checkout_item.book_id WHERE checkout_item.book_id IS NULL;

SELECT title FROM movie LEFT JOIN checkout_item ON id=checkout_item.movie_id WHERE checkout_item.movie_id IS NULL;