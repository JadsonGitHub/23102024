import java.text.DecimalFormat;
import java.util.Scanner;
//  Q3
//  Informar um saldo e imprimir o saldo com reajuste de 1%.
public class Q3
{
    private double balance;

    public Q3()
    {
        // construtor
    }
    public void balance()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println();
            System.out.print("Digite o valor do saldo: ");
            setBalance(sc.nextDouble());
        }
    }
    public void compute()
    {
        setBalance(getBalance()*1.01);
    }
    public void result()
    {        
        DecimalFormat df = new DecimalFormat("0.00");
        //NumberFormat df = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        //df.applyPattern("R$ #,##0.00");
        System.out.println();
        System.out.print("Saldo reajustado: " + df.format(getBalance()) + "\n");
        System.out.println();        
        System.out.println("π sem formato: " + Math.PI);
        System.out.println("π Com formato: " + df.format(Math.PI));
        String eh = "\u001B[3;1mE\u001B[0m";
        System.out.println(eh + " Sem formato: " + Math.E);
        System.out.println(eh + " Com formato: " + df.format(Math.E));
        System.out.println();
        String italic = "\u001B[3mItálico (ANSI)\u001B[0m";
        System.out.println();
        String bold = "\u001B[1mNegrito (ANSI)\u001B[0m";
        //String test = "\\u001B[1;3m   TESTE   (ANSI)\u001B[0m";
        System.out.println(italic);
        System.out.println(bold);
        System.out.println();
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
