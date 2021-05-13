DROP SCHEMA IF EXISTS slack_developers CASCADE;

CREATE SCHEMA slack_developers;

CREATE TABLE slack_developers.CANDIDATE_DETAILS(
   ID              INT PRIMARY KEY     	NOT NULL,
   NAME            TEXT    				NOT NULL,
   AGE             INT     				NOT NULL,
   PHONE_NUMBER    VARCHAR(20) 			NOT NULL,
   EMAIL_ID        VARCHAR(40) 			NOT NULL,
   PHOTO		   OID,
   CURRENT_COMPANY VARCHAR(20) 			NOT NULL,
   OPPORTUNITY	   VARCHAR(20) 			NOT NULL
);

INSERT INTO slack_developers.CANDIDATE_DETAILS VALUES (1, 'Nitesh',29,'07349043216','niteshakhouri123@gmail.com',null,'Deloitte','Open for change' );

INSERT INTO slack_developers.CANDIDATE_DETAILS VALUES (2, 'Roshan',28,'09538795682','roshan7raka@gmail.com',null,'American Express','Open for change' );

INSERT INTO slack_developers.CANDIDATE_DETAILS VALUES (3, 'Sumukh',28,'08793237807','gawsh4@gmail.com',null,'Deloitte','Open for change' )
