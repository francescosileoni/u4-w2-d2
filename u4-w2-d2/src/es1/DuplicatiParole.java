package es1;



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatiParole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci il numero di elementi (N): ");
        int N = scanner.nextInt();


        Set<String> paroleSet = new HashSet<>();


        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci parola #" + (i + 1) + ": ");
            String parola = scanner.next();
            paroleSet.add(parola);
        }


        System.out.println("Parole duplicate:");
        stampaParoleDuplicate(paroleSet);


        System.out.println("Numero di parole distinte: " + paroleSet.size());


        System.out.println("Elenco delle parole distinte:");
        stampaElencoParoleDistinte(paroleSet);

        scanner.close();
    }


    private static void stampaParoleDuplicate(Set<String> set) {
        Set<String> paroleDuplicate = new HashSet<>();
        Set<String> paroleUniche = new HashSet<>();

        for (String parola : set) {
            if (!paroleUniche.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }
    }


    private static void stampaElencoParoleDistinte(Set<String> set) {
        for (String parola : set) {
            System.out.println(parola);
        }
    }
}
