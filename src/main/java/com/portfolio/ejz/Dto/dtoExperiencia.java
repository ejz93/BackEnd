package com.portfolio.ejz.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String descExp;
    @NotBlank
    private String imgExp;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String descExp, String imgExp) {
        this.nombreExp = nombreExp;
        this.descExp = descExp;
        this.imgExp = imgExp;
    }
    
    //Getters & Setters

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }
    

}