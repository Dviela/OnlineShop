package com.svalero.dao;

import com.svalero.domain.Purchase;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import com.svalero.util.DateUtils;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PurchaseMapper implements RowMapper<Purchase> {
    @Override
    public Purchase map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new Purchase(rs.getInt("id"),
                DateUtils.getLocalDate(rs.getDate("date"))
        );
    }

}
