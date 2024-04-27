package com.myproject.sdw.application;

import com.myproject.sdw.domain.model.Champions;
import com.myproject.sdw.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {
    public List<Champions> findAll(){

        return repository.findAll();
    }
}
