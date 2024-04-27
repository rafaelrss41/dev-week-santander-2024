package com.myproject.sdw.domain.model;

public record Champions(
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl

) {
    public void teste(){
        Champions champ;
        champ = new Champions(1L,"","","","");
    }
}
