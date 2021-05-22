import java.util.Scanner;

public class Problema12_extra {
    public static void main(String[] args) {
        //Entradas: nome, horas trabalhadas e número de dependentes
        //Saídas: nome, salário bruto e salário líquido
        //Teste: pedro.. 100.. 5 => pedro: salário bruto de: R$ 1300 reais. Salário líquido de: $R 1165 reais.
        Scanner entradas = new Scanner(System.in);
        
        String nome = entradas.next();
        int horas = entradas.nextInt();
        int nDependentes = entradas.nextInt();

        float salarioTrabalho = horas * 10;
        float salarioFamilia = nDependentes * 60;

        float salarioBruto = salarioFamilia + salarioTrabalho;

        float salarioLiquido = salarioTrabalho-((salarioTrabalho*0.085f)+(salarioTrabalho*0.05f))+salarioFamilia; 

        System.out.println("Nome: "+nome);
        System.out.println("Salário Bruto: R$ "+salarioBruto);
        System.out.println("Salário Líquido: R$ "+salarioLiquido);

        entradas.close();
    }
}
