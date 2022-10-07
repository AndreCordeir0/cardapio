package com.example.cardapio.enums;

public enum FiltroEnum {

CARNES("Carne"),
MASSAS("Massa");

    private final String nomeFiltro;

    private FiltroEnum(String str){
        nomeFiltro = str;
    }

    public static void main(String[] args) {
        System.out.println(FiltroEnum.CARNES.nomeFiltro);
    }
}
