import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue antreanList = new Queue(10);
        while (true){
            String[] command = scan.nextLine().split(" ");
            if (command[0].equals("DAFTAR")){
                antreanList.enqueue(command[1]);
                System.out.println(command[1] + " BERHASIL MASUK ANTREAN");
            } else if (command[0].equals("CETAK")) {
                antreanList.print();
            } else if (command[0].equals("LAYANI")) {
                String data = antreanList.dequeue();
                System.out.println(data + " DILAYANI");
            }
        }
    }
}
