package Exercicio03.Funcionalidades;

import Exercicio03.Curto.Curto;

public enum Func implements Curto{


 Insertion
  {
   
    public void curto(int[] v) {
      Insertion i = new Insertion();
      i.curto(v);
      
    }
  },
  
  Selection
  {
   
    public void curto(int[] v) {
      Selection s = new Selection();
      s.curto(v);
    }
  },
  Bubble{
    
    public void curto(int[] v) {
      Burbble b = new Burbble();
      b.curto(v);
      
    }
  };
  
}
