package com.bouncesite.repo;

import com.bouncesite.model.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StatsRepo {
    @Autowired
    private JdbcTemplate template;

    public Statistics fetchStats() {
        String sql = "SELECT id, sphere_collision_count, wall_collision_count FROM statistics;";
        RowMapper<Statistics> rowMapper = new BeanPropertyRowMapper<>(Statistics.class);
        return template.queryForObject(sql, rowMapper);
    }
}