
import java.text.DecimalFormat;
import java.util.Scanner;

//  Q4
//  Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um 
//  usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o 
//  resultado. (1SM=R$1.412,00)
public class Q4
{
    private double wage, income;

    public Q4()
    {
        //  contrutor
    }
    public void readWage()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite o valor do salario minimo atual: ");
        setWage(sc.nextDouble());
    }
    public void readIncome()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite o seu salario: ");
        setIncome(sc.nextDouble());
    }
    public void calculate()
    {
        Scanner sc = new Scanner(System.in);
        sc.close();
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println();
        System.out.println("Voce recebe " + df.format(getIncome()/getWage()) + " salarios minimos");
        System.out.println();
        System.out.println("Equivalente a: " + df.format(getIncome()/getWage()*100) + "%");
        System.out.println();
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
}