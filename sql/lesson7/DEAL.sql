CREATE TABLE DEAL(
    DEAL_ID NUMBER PRIMARY KEY,
    CUSTOMER_ID NUMBER,
    CONSTRAINT CUSTOMER_FK FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID),
    AMOUNT NUMBER NOT NULL,
    DEAL_DATE TIMESTAMP NOT NULL
);
