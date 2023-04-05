package com.example;

public class FaturamentoDistribuidora {

        static double SP = 67836.43;
        static double RJ = 36678.66;
        static double MG = 29229.88;
        static double ES = 27165.48;
        static double Outros = 19849.53;

        static double total =SP+RJ+MG+ES+Outros;
    static void start(){
       
        SP = SP/total * 100;
        RJ = RJ/total * 100;
        MG = MG/total * 100;
        ES = ES/total * 100;
        Outros = Outros/total * 100;

        System.out.printf("SP:  %.2f%% %n",SP);
        System.out.printf("RJ: %.2f%% %n",RJ);
        System.out.printf("MG: %.2f%% %n",MG);
        System.out.printf("ES: %.2f%% %n",ES);
        System.out.printf("Outros: %.2f%% %n",Outros);
        
    }
    
}
