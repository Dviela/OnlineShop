package com.svalero.dao;
import com.svalero.domain.Product;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;
public interface ProductDAO {
    @SqlQuery("SELECT * FROM OnlineShop")
    @UseRowMapper(ProductMapper.class)
    List<Product> getProduct();

    @SqlQuery("SELECT * FROM OnlineShop WHERE id = ?")
    @UseRowMapper(ProductMapper.class)
    Product getProduct(int id);

    @SqlUpdate("INSERT INTO OnlineShop (name, description, price, image) VALUES (?, ?, ?, ?)")
    void addProduct(String name, String description, int price, String image);

    @SqlUpdate("DELETE FROM OnlineShop WHERE id = ?")
    void removeProduct(int id);

    @SqlUpdate("UPDATE OnlineShop SET name = ?, description = ?, price = ?, image = ? WHERE id = ?")
    void editProduct(String name, String description, int price, String image, int id);

    @SqlUpdate("UPDATE OnlineShop SET name = ?, description = ?, price = ? WHERE id = ?")
    void editProduct(String name, String description, int price, int id);
}

