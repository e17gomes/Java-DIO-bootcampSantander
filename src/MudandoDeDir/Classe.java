package MudandoDeDir;
import java.util.Scanner;

public class Classe{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.nextLine();
        String sName = scanner.nextLine();

        String nomeCompleto = funcaoNome(fName, sName);
        System.out.println(nomeCompleto);

        scanner.close();

    }

    public static String funcaoNome (String fName, String sName){
        return fName + " " + sName;

    }
}
