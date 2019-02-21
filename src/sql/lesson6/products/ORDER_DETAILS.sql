CREATE TABLE ORDER_DETAILS(
    ORDER_ID NUMBER,
    CONSTRAINT ORDER_FK FOREIGN KEY (ORDER_ID) REFERENCES ORDERS(ID),
    PRODUCT_ID NUMBER,
    CONSTRAINT PRODUCT_FK FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCTS(ID),
    CONSTRAINT ORDER_DETAILS_PK PRIMARY KEY (ORDER_ID,PRODUCT_ID),
    UNIT_PRICE NUMBER(7,2),
    QUANTITY NUMBER,
    DISCOUNT NUMBER(5,2)
);