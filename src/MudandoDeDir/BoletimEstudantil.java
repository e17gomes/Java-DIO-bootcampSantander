package MudandoDeDir;
import javax.swing.JOptionPane;

public class BoletimEstudantil {
    public static void main(String[] args) {
      String notaUm =  JOptionPane.showInputDialog("Insira sua Primeira nota");
      int notaUmInt = Integer.parseInt(notaUm);
      String notaDois = JOptionPane.showInputDialog("Digite a Segunda nota");
      int notaDoisInt = Integer.parseInt(notaDois);  
      String notaTres = JOptionPane.showInputDialog("Digite a Terceira nota");
      int notaTresInt = Integer.parseInt(notaTres);  

      int media = (notaUmInt + notaDoisInt + notaTresInt)/3;

      if(media<5)
      System.out.println("Reprovado com " + media + " de nota");
      else if (media == 6) System.out.println("Prova Opcional para aumentar a nota e substituir a menor");
      else System.out.println("APROVADO ");
    }
}
