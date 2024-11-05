import java.util.*;
//    Q1
//    Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//    mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//    (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
public class Q1
{
    private int year, month, day;
    Scanner sc = new Scanner(System.in);

    public Q1()
    {
        sc.useLocale(new Locale ("pt", "BR"));      
        Locale current = Locale.getDefault();
        System.out.println();
        System.out.println("Country  Code: " + current.getCountry());
        System.out.println("Country  Name: " + current.getDisplayCountry());
        System.out.println("Language Code: " + current.getLanguage());
        System.out.println("Language Name: " + current.getDisplayLanguage());
    }
    public void readAge()
    {
        try
        {
            System.out.println();
            System.out.println("Programa para transformar idade em dias");
            System.out.println();
            System.out.print("Digite os anos : ");
            this.setYear(sc.nextInt());
            System.out.print("Digite os meses: ");
            this.setMonth(sc.nextInt());
            System.out.print("Digite os dias : ");
            this.setDay(sc.nextInt());
        }
        catch (InputMismatchException e)
        {
            System.out.println();
            System.out.println("ERRO! DIGITE APENAS NUMEROS!");
            System.out.println();
            System.out.println(e);
            System.out.println();
            System.exit(0);
        }
        catch (Exception e)
        {
            System.out.println();
            System.out.println("ERRO INESPERADO!");
            System.out.println();
            System.out.println(e);
            System.out.println();
            System.exit(1);
        }
    }
    public void convertToDays()
    {
        this.day += this.month * 30;
        this.day += this.year * 365;
    }
    public void printDays()
    {
        System.out.println();
        System.out.println("Essa idade é " + this.getDay() + " dias");
        System.out.println();
    }
    public void query()
    {
        try
        {         
            while (true)
            {
                System.out.print("Deseja transformar outra idade? (s/n):\t");
                String yes = sc.next().toLowerCase();
                System.out.println();
                if (yes.equals("n")) break;                
                clearWindow();
                this.readAge();
                this.convertToDays();
                this.printDays();
            }
        }
        catch (NoSuchElementException e)
        {
            System.out.println();
            System.out.println("ERRO!");
            System.out.println();
            System.out.println(e);
            System.out.println();
            System.exit(0);
        }
        catch (Exception e)
        {
            System.out.println();
            System.out.println("ERRO INESPERADO!");
            System.out.println();
            System.out.println(e);
            System.out.println();
            System.exit(1);
        }
        finally
        {
            sc.close();
        }
    }    
    private static void clearWindow()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
}