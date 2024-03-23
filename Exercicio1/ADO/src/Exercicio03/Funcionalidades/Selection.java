package Exercicio03.Funcionalidades;

import Exercicio03.Curto.Curto;

public class Selection implements Curto{
    public void curto(int[] v){
        int i,j,min,aux;
        for(i=0;i<v.length-1;i++){
       min=i;
        for(j=i+1;j<v.length;j++)
       if(v[j]<v[min])
       min=j;
        aux=v[i];
        v[i]=v[min];
        v[min]=aux;
           }
           }

}
