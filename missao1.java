import java.util.ArrayList;
import java.util.Scanner;

public class missao1 {
    public static void main(String[] args) {
        int bigNum = 0;
        int smallNum = 0;
        int numSorteio = 0;
        
        ArrayList<Integer> num = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        
        do{ 
            System.out.println("Insira o número sorteado: ");
             numSorteio = input.nextInt();
             if(numSorteio == -1){
                break;
             }
             num.add(numSorteio);
             if(bigNum<numSorteio){
                bigNum = numSorteio;
             }
             if(smallNum>numSorteio||smallNum==0){
                smallNum = numSorteio;
             }
        }while(numSorteio!=-1);
    System.out.println("Os números sorteados são: "+num);
   System.out.println("A quantidade de números é: "+num.size());
    System.out.println("O maior número é: "+bigNum);
    System.out.println("O menor número é: "+smallNum);
    
    
    input.close();}
}
