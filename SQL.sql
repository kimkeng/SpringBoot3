INSERT INTO test (author) VALUES ('홍길동');
INSERT INTO test (author) VALUES ('이순신');

SELECT id, author FROM test;

UPDATE test SET author='오로라' WHERE id=1;

DELETE FROM test WHERE id=3;test