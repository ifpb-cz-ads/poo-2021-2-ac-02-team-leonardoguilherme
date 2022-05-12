public class BMExercicio03 {
    public static void main(String [] args){
        double item1 = 2.95;
        double item2 = 3.50;
        System.out.println("O item 1 custa " + item1 + " e o item 2 custa " + item2);
        double soma = item1 + item2;
        System.out.println("Resultado da soma dos itens é " + soma);
        final double taxaCalculada = soma * 0.0825;
        System.out.println("a taxa é " + taxaCalculada);
        item1 += taxaCalculada;
        item2 += taxaCalculada;
        double novoCusto = item1 + item2;
        boolean muitoCaro = novoCusto > 10;
        System.out.println("muitoCaro = " + muitoCaro);
    }
}
