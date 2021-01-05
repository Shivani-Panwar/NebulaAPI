package com.myproject.myapi.dao;

import com.myproject.myapi.model.ApiLogs;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Repository
public interface ApiLogInterface extends CrudRepository<ApiLogs, String> {
    @Modifying
    @Query(value= "INSERT INTO apilogs(adminID, callDate, callTime, result, errorCount) VALUES(:id,:date,:time,:result,:errors)",nativeQuery = true)
    @Transactional
    public void apiLogDets(@Param("id") String id, @Param("date") LocalDate date, @Param("time") LocalTime time, @Param("result") String result, @Param("errors") int errors);
}
