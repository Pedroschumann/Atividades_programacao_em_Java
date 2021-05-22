import java.util.Scanner;

public class Unidade5_23 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
        String maisVendedores = entradas.next();

        float totalVendas = 0;
        String nomeVendedor = "";

        while(!maisVendedores.equalsIgnoreCase("n")){
            if(maisVendedores.equalsIgnoreCase("s")){
                System.out.print("Digite o nome do vendedor: ");
                nomeVendedor = entradas.next();
    
                System.out.print("Digite quantos produtos o vendedor vendeu: ");
                float numeroProdutos = entradas.nextFloat();

                for(int cont = 1; cont<=numeroProdutos; cont ++){
                System.out.print("Digite o preço unitário do produto "+cont+": ");
                float precoUnitario = entradas.nextFloat();
        
                System.out.print("Digite a quantidade vendida do produto: ");
                int quantidadeVendido = entradas.nextInt();

                totalVendas += precoUnitario*quantidadeVendido;
                }
            }else{
                System.out.println("Você digitou a opção errada, informe apenas 's' ou 'n'");
            }
            
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            maisVendedores = entradas.next();
        }
        float salario = totalVendas*0.3f;

        System.out.println("O vendedor "+nomeVendedor+
        " teve um total de vendas de R$ "+totalVendas+" reais. \nSalário: R$"+salario);

        entradas.close();
    }
}
