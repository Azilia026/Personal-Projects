import java.util.Scanner;
public class aaah{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String jon = input.nextLine();
        String doc = input.nextLine();
        
            int chJon = 0;
            for(int i = 0; i<jon.length(); i++){
                chJon++;
            }
            int chDoc = 0;
            for(int i = 0; i<doc.length(); i++){
                chDoc++;
            }
            
            if(chJon>=chDoc)
                System.out.println("go");
            else if(chJon<chDoc)
                System.out.println("no");
        
    }
}