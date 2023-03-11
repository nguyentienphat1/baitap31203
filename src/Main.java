import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int thu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thu");
        thu= scanner.nextInt();
        switch (thu){
            case 1:
                System.out.println("chu nhat");
                break;
            case 2:
                System.out.println("thu hai");
                break;
            case 3:
                System.out.println("thu ba");
                break;
            case 4:
                System.out.println("thu tu");
                break;
            case 5:
                System.out.println("thu nam");
                break;
            case 6:
                System.out.println(" thu sau");
                break;
            case 7:
                System.out.println("thu bay");
                break;
            default:
            System.out.println("khong thuoc thu nao");
        }
    }
}