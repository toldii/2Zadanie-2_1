import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("wybierz rozmiar ");
    int a= scan.nextInt();
    char c= '*';
    for (int i = 1; i<=a; i++)
        {
            for(int j=0;j<a-i;j++);
            for (int j = 0; j<i; j++)System.out.print(c);
            System.out.println(" ");
        }
     
  }
}
