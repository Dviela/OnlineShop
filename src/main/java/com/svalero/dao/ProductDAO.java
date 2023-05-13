package com.svalero.dao;
import com.svalero.domain.Product;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;
public interface ProductDAO {
    @SqlQuery("SELECT * FROM PRODUCTOS")
    @UseRowMapper(ProductMapper.class)
    List<Product> getProduct();

    @SqlQuery("SELECT * FROM PRODUCTOS WHERE id = ?")
    @UseRowMapper(ProductMapper.class)
    Product getProduct(int id);

    @SqlUpdate("INSERT INTO PRODUCTOS (NOMBRE, DESCRIPCION, PRECIO, IMAGEN) VALUES (?, ?, ?, ?)")
    void addProduct(String name, String description, int price, String image);

    @SqlUpdate("DELETE FROM PRODUCTOS WHERE ID_PRODUCTO = ?")
    void removeProduct(int id);

    @SqlUpdate("UPDATE PRODUCTOS SET NOMBRE = ?, DESCRIPCION = ?, PRECIO = ?, IMAGEN = ? WHERE ID_PRODUCTO = ?")
    void editProduct(String name, String description, int price, String image, int id);

    @SqlUpdate("UPDATE PRODUCTOS SET NOMBRE = ?, DESCRIPCION = ?, PRECIO = ? WHERE ID_PRODUCTO = ?")
    void editProduct(String name, String description, int price, int id);
}

