package ba.unsa.etf.rpr;

import java.util.Scanner;
public class Main {
    public static int sumaCifara(int n){
        int suma=0;
        do{
            int c=n%10;
            suma=suma+c;
            n=n/10;
        }while(n!=0);
        return suma;
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Unesite n sa tastature: ");
        Scanner ulaz=new Scanner(System.in);
        n=ulaz.nextInt();
        System.out.println("Brojevi djeljivi sa svojim ciframa su: ");
        for(int i=1; i<=n; i++){
            if(i % sumaCifara(i)==0){
                System.out.print(i+" ");
            }
        }



    }
}
