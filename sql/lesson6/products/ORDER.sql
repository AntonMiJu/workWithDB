CREATE TABLE ORDERS(
    ID NUMBER,
    CONSTRAINT ORDER_ID PRIMARY KEY (ID),
    CUSTOMER_ID NUMBER,
    CONSTRAINT CUSTOMER_FK FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMERS(ID),
    EMPLOYEE_ID NUMBER,
    CONSTRAINT EMPLOYEE_FK FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEES(ID),
    ORDER_DATE TIMESTAMP,
    REQUIRED_DATE TIMESTAMP,
    SHIPPED_DATE TIMESTAMP,
    SHIP_VIA NUMBER,
    CONSTRAINT SHIPPER_FK FOREIGN KEY (SHIP_VIA) REFERENCES SHIPPERS(ID),
    FREIGHT NUMBER(5,2),
    SHIP_NAME NVARCHAR2(50),
    SHIP_ADDRESS NVARCHAR2(50),
    SHIP_CITY NVARCHAR2(20),
    SHIP_REGION NVARCHAR2(60),
    SHIP_POSTAL_CODE NUMBER,
    SHIP_COUNTRY NVARCHAR2(20)
);