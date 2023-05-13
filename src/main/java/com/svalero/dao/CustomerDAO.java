package com.svalero.dao;
import com.svalero.domain.Customer;
import com.svalero.domain.Product;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;

public interface CustomerDAO {
    @SqlQuery("SELECT * FROM CLIENTES")
    @UseRowMapper(CustomerMapper.class)
    List<Customer> getCustomer();

    @SqlQuery("SELECT * FROM CLIENTES WHERE id = ?")
    @UseRowMapper(CustomerMapper.class)
    Product getCustomer(int id);

    @SqlUpdate("INSERT INTO CLIENTES (NOMBRE, ADDRESS, EMAIL) VALUES (?, ?, ?)")
    void addCustomer(String name, String address, String email);

    @SqlUpdate("DELETE FROM CLIENTES WHERE ID_CLIENTE = ?")
    void removeCustomer(int id);

   @SqlUpdate("UPDATE CLIENTES SET NOMBRE = ?, ADDRESS = ?, EMAIL = ? WHERE id = ?")
   void editCustomer(String name, String address, String email, int id);

}

