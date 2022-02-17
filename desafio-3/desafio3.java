import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class anagrama {

    public static void main(String[] args){

        HashMap<String, Integer> map= new HashMap<>(); // HashMap para armazenar pares de chave-valor.
        String anagrama;
        Scanner ent=new Scanner(System.in);
        System.out.printf("Digite sua entrada: \n");
        anagrama = ent.next();
        

        for(int i = 0; i < anagrama.length(); i++){
            for(int j = i; j < anagrama.length(); j++){
                char[] comp1 = anagrama.substring(i, j+1).toCharArray();
                Arrays.sort(comp1);
                String comp = new String(comp1);

                if(map.containsKey(comp)){
                    map.put(comp, map.get(comp)+1);
                }
                else{map.put(comp, 1);}    
            }   

        }
        int contanagrama = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            contanagrama = contanagrama + (n * (n-1))/2;
        }
        System.out.println(contanagrama);
    }

}
