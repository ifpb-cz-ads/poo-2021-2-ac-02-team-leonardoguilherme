/* Não conseguiu rodar, por causa dos seus tipos que são diferentes, logo causa uma incompatibilidade entre os dois numeros, fazendo com que não aconteça a operação.
A forma de arrumar seria colocando a primeira variavel com o tipo inteiro, já que o seu valor é do tipo int e o outro numero também é inteiro. */

// forma de fazer sem erro
public class BMExercicio04 {
    public static void main(String [] args){
        int long1 = 100;
        int int1 = 200;
        int int2 = int1 + long1;
        System.out.print(int2);
    }      
}
