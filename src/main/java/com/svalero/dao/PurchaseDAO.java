package com.svalero.dao;
import com.svalero.domain.Purchase;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.time.LocalDate;
import java.util.List;

public interface PurchaseDAO {
    @SqlQuery("SELECT * FROM OnlineShop")
    @UseRowMapper(PurchaseMapper.class)
    List<Purchase> getPurchase();

    @SqlQuery("SELECT * FROM OnlineShop WHERE id = ?")
    @UseRowMapper(PurchaseMapper.class)
    Purchase getPurchase(int id);

    @SqlUpdate("INSERT INTO OnlineShop (date) VALUES (?)")
    void addPurchase(LocalDate date);

    @SqlUpdate("DELETE FROM OnlineShop WHERE id = ?")
    void removePurchase(int id);
}

