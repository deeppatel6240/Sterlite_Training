CREATE TABLE login (
    username  VARCHAR2(20) PRIMARY KEY,
    password  VARCHAR2(30) NOT NULL
);

INSERT INTO login VALUES (
    'deep',
    'deep12'
);

INSERT INTO login VALUES (
    'raj',
    'raj12'
);


SELECT
    *
FROM
    login;
    
COMMIT;

