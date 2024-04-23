package inheritance;

import java.time.LocalDate;

public class MainManusia {
    public static void main(String[] args) {
        Manusia manusia = new Manusia("Bro", true, "234354", true);
        System.out.println(manusia.toString());
        Manusia manusia2 = new Manusia("Girls", false, "234354", true);
        System.out.println(manusia2.toString());
        Manusia manusia3 = new Manusia("Bere bere", true, "234354", false);
        System.out.println(manusia3.toString());

        MahasiswaFilkom filkom = new MahasiswaFilkom("Samuel Nathanael Sitompul", true, "23423423", false,
                "235150407111034", 3.88);
        System.out.println(filkom.toString());
        MahasiswaFilkom filkom2 = new MahasiswaFilkom("Samuel Nathanael", true, "23423423", false,
                "235150407111034", 3.2);
        System.out.println(filkom2.toString());
        MahasiswaFilkom filkom3 = new MahasiswaFilkom("Samuel", true, "23423423", false,
                "235150407111034", 2.9);
        System.out.println(filkom3.toString());
        Pekerja pekerja = new Pekerja("bro", true, "2313243", true, 450000.0, LocalDate.of(2022, 5, 15), 2);
        System.out.println(pekerja.toString());
        Pekerja pekerja2Pekerja = new Pekerja("Anti", true, "2313243", false, 250000.0, LocalDate.of(2015, 3, 15), 0);
        System.out.println(pekerja2Pekerja.toString());
        Pekerja pekerja3 = new Pekerja("Tejo", true, "2313243", true, 150000.0, LocalDate.of(2004, 1, 15), 10);
        System.out.println(pekerja3.toString());
        Manajer manajer = new Manajer("sneed", true, "213133445", false, 7500, LocalDate.of(2009, 3, 10), 0,
                "Teknikal");
        System.out.println(manajer.toString());
    }
}