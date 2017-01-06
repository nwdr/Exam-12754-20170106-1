package com.webssm.mapper;

import java.sql.SQLException;
import java.util.List;

public interface BaseMapper<T, P> {
    T getById(P id);

    void update(T entity);

    void delete(P id) throws SQLException;

    List<T> select();
    
    T insert(T entity);
}
