package com.svalero.dao;
import com.svalero.domain.Customer;
import com.svalero.domain.Product;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;

public interface CustomerDAO {
    @SqlQuery("SELECT * FROM OnlineShop")
    @UseRowMapper(CustomerMapper.class)
    List<Customer> getCustomer();

    @SqlQuery("SELECT * FROM OnlineShop WHERE id = ?")
    @UseRowMapper(CustomerMapper.class)
    Product getCustomer(int id);

    @SqlUpdate("INSERT INTO OnlineShop (name, password, email) VALUES (?, ?, ?)")
    void addCustomer(String name, String password, String email);

    @SqlUpdate("DELETE FROM OnlineShop WHERE id = ?")
    void removeCustomer(int id);

    @SqlUpdate("UPDATE OnlineShop SET name = ?, password = ?, email = ? WHERE id = ?")
    void editCustomer(String name, String password, String email, int id);

}

