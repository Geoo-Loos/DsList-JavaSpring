package com.devsuperior.dslist.jogodto;

import com.devsuperior.dslist.entities.Jogo;

public class jogoMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgURL;
    private String shortDescription;

    public jogoMinDTO() {
    }

    public jogoMinDTO(Jogo entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgURL = entity.getImgURL();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgURL() {
        return imgURL;
    }

    public String getShortDescription() {
        return shortDescription;
    }

}
