CREATE TABLE CUSTOMER(
    CUSTOMER_ID NUMBER PRIMARY KEY,
    CUSTNAME NVARCHAR2(50) NOT NULL,
    CITY NVARCHAR2(50) NOT NULL,
    SALESMAN_ID NUMBER,
    CONSTRAINT SALESMAN_FK FOREIGN KEY (SALESMAN_ID) REFERENCES SALESMAN(SALESMAN_ID)
);
