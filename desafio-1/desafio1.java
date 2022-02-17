import java.util.Scanner; // metodo para receber inputs no terminal;
public class desafio1 {
    public static void main(String[] args) {
		
    
        Scanner matriz=new Scanner(System.in);
        char simbolo = '*' ;
        System.out.println("Numero de linhas e Colunas: "); //println pula linha
        
        int n=matriz.nextInt();	 //captura proximo inteiro da var matriz
                       
        
        int i =1;
        int j; 
        
        while(i<=n){
                   j=0;
                   while(j++<(n-i)) {
                            System.out.print(" "); //funcao para percorrer ate a penultima posicao informada
                           }
                   j=0;
                         while(j<i) { 
                                   System.out.print(simbolo); //preenche ultima posicao com *
                                   j++; //saida do loop
                           }

                         System.out.println(); // pula para proxima linha
                         i++;
                   }             
        }
            
}
