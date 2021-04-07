import java.lang.Math; // headers MUST be above the first class


public class CoeficienteDeCorrelacao {
  
  public static void main(String[] args) {
   double nElementos = 10;
   double somaDeX = 599;
   double somaDeY = 2430;
   double somaDeXY = 137808;
   double somaDex2 = 37611;
   double somaDey2 = 625802;
   double somaDeX22 = 358801;
   double somaDeY22 = 5904.900;
   
   double vezesXY = 0.0;
   double XYdivN = 0.0;
   double parteDeCima = 0.0;
   
   double divBaixo1 = 0.0;
   double parentese1 = 0.0;
   double divBaixo2 = 0.0;
   double parentese2 = 0.0;
   double juntar = 0.0;
   double parteDeBaixo = 0.0;
   
   double resultado = 0.0;
   
   // parte de cima
    
   vezesXY = somaDeX * somaDeY;
   
   XYdivN = vezesXY / nElementos;
   
   parteDeCima = somaDeXY - XYdivN;
   
   // parte de baixo esquerda
   
   divBaixo1 = somaDeX22 / nElementos;
   
   parentese1 = somaDex2 - divBaixo1;
    
   // parte de baixo direita
   
   divBaixo2 = somaDeY22 / nElementos;
   
   parentese2 = somaDey2 - divBaixo2;
   
   // juntar as duas parte de baixo
   
   juntar = parentese1 * parentese2;
   
   parteDeBaixo = Math.sqrt(juntar);
   
   // juntas parte de cima e de baixo
   
   resultado = parteDeCima / parteDeBaixo;
   
   System.out.println("O Coeficiente de Pearson é: " + resultado + ".");
   
  }
}