public class CBBAtividadePratica4{
    public static void main(String[] args){
        int metroCubico = 100;
        System.out.println("O metro cúbico custa R$" + metroCubico + " reais.");
        int custo1, custo2, custo3;
        int cubagem1 = 20;
        int cubagem2 = 43;
        int cubagem3 = 55;
        custo1 = metroCubico * cubagem1;
        custo2 = metroCubico * cubagem2;
        custo3 = metroCubico * cubagem3;
        System.out.println("Se a piscina possuir 20 metros quadrados o valor a ser desembolsado é: R$" + custo1 + " reais");
        System.out.println("Se a piscina possuir 43 metros quadrados o valor a ser desembolsado é: R$" + custo2 + " reais");
        System.out.println("Se a piscina possuir 55 metros quadrados o valor a ser desembolsado é: R$" + custo3 + " reais");
    }
}