package com.example.danielchung.tarea_recyleviewer_01;

public class Cachorro_Perfil {

    private String strNomCahorro;
    private int imgFoto;

    public int getIntEstrella() {
        return intEstrella;
    }

    public void setIntEstrella(int intEstrella) {
        this.intEstrella = intEstrella;
    }

    private int intEstrella;

    public Cachorro_Perfil(int Foto,String NomCachorro) {
        imgFoto=Foto;
        strNomCahorro=NomCachorro;
    }

    public String getStrNomCahorroNomCahorro() {
        return strNomCahorro;
    }

    public void setStrNomCahorro(String strNomCahorro) {
        this.strNomCahorro = strNomCahorro;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(int imgFoto) {
        this.imgFoto = imgFoto;
    }
}
