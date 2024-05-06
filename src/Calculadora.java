public class Calculadora {
    /**
     * Usado para melhorar a documentação de arquivos java 
     * @param numeroUm
     * @param numeroDois
     * @return 
     */
    public int somar(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); // Criando uma instância de Calculadora
        int resultado = calc.somar(3, 6); // Chamando o método somar usando a instância criada
        System.out.println("A soma é: " + resultado);
    }
}
