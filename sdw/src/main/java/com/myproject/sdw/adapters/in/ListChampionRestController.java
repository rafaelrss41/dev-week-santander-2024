package com.myproject.sdw.adapters.in;


import com.myproject.sdw.application.ListChampionsUseCase;
import com.myproject.sdw.domain.model.Champions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions")
public record ListChampionRestController(ListChampionsUseCase useCase) {


    @GetMapping()
    public List<Champions> findAllChampions(){
        return useCase.findAll();
    }

}
