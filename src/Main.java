import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<String> tumpukan = new LinkedList<>();
        {
            tumpukan.add("nama prodi 1: SI");
            tumpukan.add("nama prodi 2: DKV");
            tumpukan.add("nama prodi 3: Manajemen");
            while (!tumpukan.isEmpty()) {
                String nama = tumpukan.remove();
                System.out.println(nama);
            }

        }

            Queue<String> nameQueue = new LinkedList<>();
            nameQueue.add("John");
            nameQueue.add("Alice");
            nameQueue.add("Bob");
            while (!nameQueue.isEmpty()) {
                String name = nameQueue.poll();
                System.out.println(name);
            }
        }
    }


