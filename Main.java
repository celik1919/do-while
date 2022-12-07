import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner mec=new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do{
            System.out.print("Şifre Giriniz: ");
            pass = mec.nextInt();
            if (pass == 123){
                System.out.println("Doğru");
                askPassword=false;
            }else{
                System.out.println("Yanlış");
            }
        }while (askPassword);
    }
}