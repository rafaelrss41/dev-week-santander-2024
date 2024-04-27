package com.myproject.sdw.domain.ports;

import com.myproject.sdw.domain.model.Champions;
import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {

    List<Champions> findAll();


    Optional<Champions> findById(Long id);

}
