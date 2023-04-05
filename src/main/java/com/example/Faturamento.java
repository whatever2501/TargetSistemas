package com.example;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Faturamento {

    public static void start() throws JsonParseException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        File file = new File("src/main/java/com/example/dados.json");
        DiaFaturamento[] faturamento = mapper.readValue(file, DiaFaturamento[].class);

        int media = 0;
        int soma = 0;
        int anterior = 99999999;
        int anteriorM = 0;
        int menor = 0;
        int maior = 0;
        int diasZero = 0;
        int diasMaiorQMedia = 0;
        for(int x = 0; x < faturamento.length;x++){
            soma  +=   (int) faturamento[x].getValor();
           
           int atual = (int) faturamento[x].getValor();
            if(atual < anterior){
                menor = atual;
                anterior = atual;
            }
            if(atual > anteriorM){
                maior = atual;
                anteriorM = atual;
            }
            if(faturamento[x].getValor() == 0){
                diasZero += 1;
            }
            
            media = soma/faturamento.length-diasZero;

        }
        for(int x = 0 ; x < faturamento.length; x++){
            if(faturamento[x].getValor() > media){
                diasMaiorQMedia += 1;
            }
        }

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês: "+menor);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: "+ maior);
        System.out.println(" Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.: "  + diasMaiorQMedia);

    }
    
}
