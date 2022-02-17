
import java.util.Scanner;

public class desafio2 {

    public static  Scanner pwd;
    public static void main(String[] args){
       
        Scanner pwd=new Scanner(System.in);
        String senha;
    
        
        System.out.printf("Informe uma senha que possua:\n - 6 Digitos \n - Contem no minimo 1 digito \n - Contem no minimo 1 letra em minusculo. \n");
        System.out.printf(" - Contem no minimo 1 letra em maiusculo \n - Contem no minimo 1 caractere especial. \n");
        System.out.printf("Digite abaixo: \n");
        senha = pwd.next(); //atribuo o valor do scanner pwd na string senha


        int tamanhosenha = senha.length(); //caluclo o comprimento da string senha
        
        //Laco para percorrer toda string fazendo a contagem minima de digitos
       while (tamanhosenha < 6) {
        System.out.println("Sua senha possui apenas " + tamanhosenha + " digitos");
        
        
            System.out.printf("Minimo de 6 digitos:\n");
            senha = pwd.next();
            tamanhosenha = senha.length();
       }
        
        System.out.println("Sua senha possui 6 digitos ou mais!");
        
            


    
    
    
    }    

}
