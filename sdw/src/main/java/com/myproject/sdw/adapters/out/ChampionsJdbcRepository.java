package com.myproject.sdw.adapters.out;

import com.myproject.sdw.domain.model.Champions;
import com.myproject.sdw.domain.ports.ChampionsRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;


@Repository
public class ChampionsJdbcRepository implements ChampionsRepository {

   private final JdbcTemplate jdbcTemplate;
   private final RowMapper<Champions> rowMapper;


   public ChampionsJdbcRepository(JdbcTemplate jdbcTemplate){
       this.jdbcTemplate = jdbcTemplate;
       this.rowMapper = (((rs, rowNum) -> new Champions (
                   rs.getLong("id"),
                   rs.getString("name"),
                   rs.getString("role"),
                   rs.getString("lore"),
                    rs.getString("imageUrl")
               )));
   }


    @Override
    public List<Champions> findAll() {
        return jdbcTemplate.query("SELECT * FROM CHAMPIONS", rowMapper);
    }

    @Override
    public Optional<Champions> findById(Long id) {
       String query = "SELECT * FROM CHAMPIONS WHERE ID = ?";
       Champions champion = jdbcTemplate.queryForObject(query, rowMapper, id);
        return Optional.ofNullable(champion);
    }
}
