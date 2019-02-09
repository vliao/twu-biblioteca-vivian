SELECT name FROM member WHERE member.id IN (SELECT member_id FROM checkout_item GROUP BY member_id HAVING COUNT(member_id) >1);
