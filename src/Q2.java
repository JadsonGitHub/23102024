import java.util.Scanner;
//  Q2
//  Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
//  A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
public class Q2
{
    private int num[] = new int[] {4, 5, 6, 7, 8, 9};
    private int avg1, avg2; 

    public Q2()
    {
        //  constructor
    }
    public Q2(int[] num)
    {
        this.num = num;
    }
    public void quest()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Deseja digitar os 6 numeros? (s/n):\t");
            String yes = sc.next().toLowerCase();
            if (yes.equals("s"))
            {
                System.out.println("Digite os números:");
                for (int i = 0; i < num.length; i++) num[i] = sc.nextInt();
            }
            /*/
            for (int i : num) 
            {
                System.out.println("num ant: " + num[i]);
                System.out.println(" i  ant: " + i);

                num[i] = sc.nextInt();
                
                System.out.println("num dps: " + num[i]);
                System.out.println(" i  dps: " + i);
            }
            /*/
        }
    }
    public void average()
    {
        this.avg1 = (this.num[3] + this.num[4] + this.num[5])/3;
        this.avg2 = (this.num[0] + this.num[1] + this.num[2])/3;
    }
    public void result()
    {
        System.out.print("Numeros: | ");
        for (int i : num) System.out.print(i + " | ");
        System.out.println();
        System.out.println("Media 1: " + (double)this.avg1);
        System.out.println("Media 2: " + (double)this.avg2);
        System.out.println();
        System.out.println("Soma das medias: " + (this.avg1 + this.avg2));
        System.out.println("Media das medias: " + (double)(this.avg1 + this.avg2)/2);
        System.out.println();
    }
}