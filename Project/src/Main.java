import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Electrodomestic>listaeElectrodomestics = new ArrayList<>();
        List<Electrodomestic>listaCopy = new ArrayList<>();

        Rentadora r1 = new Rentadora();
        r1.soroll = 10;
        r1.revolucions = 20;
        r1.color = "red";
        r1.nom = "Turbolavadora";
        r1.eficiencia = 90;
        r1.marca = "Semens";
        r1.preu = 1023;

        listaeElectrodomestics.add(r1);

        Rentadora r2 = new Rentadora();
        r2.soroll = 12;
        r2.revolucions = 32;
        r2.color = "blue";
        r2.nom = "TurbolavadoraMax";
        r2.eficiencia = 88;
        r2.marca = "Kia";
        r2.preu = 222;

        listaeElectrodomestics.add(r2);

        Nevera n1 = new Nevera();
        n1.soroll = 13;
        n1.frigories = 40;
        n1.color = "cyan";
        n1.nom = "Neveraguapa";
        n1.eficiencia = 77;
        n1.marca = "Simns";
        n1.preu = 123;

        listaeElectrodomestics.add(n1);

        Nevera n2 = new Nevera();
        n2.soroll = 15;
        n2.frigories = 42;
        n2.color = "negro";
        n2.nom = "Neverita xd";
        n2.eficiencia = 76;
        n2.marca = "Samsin";
        n2.preu = 443;

        listaeElectrodomestics.add(n2);

        Forn f1 = new Forn();
        f1.temperatura = 8000;
        f1.autoneteja = true;
        f1.color = "mas negro";
        f1.nom = "el forno di pietra";
        f1.eficiencia = 3;
        f1.marca = "Simenes2";
        f1.preu = 777;

        listaeElectrodomestics.add(f1);

        Forn f2 = new Forn();
        f2.temperatura = 7000;
        f2.autoneteja = false;
        f2.color = "mas negro aun";
        f2.nom = "el forno di madera";
        f2.eficiencia = 2;
        f2.marca = "Simenes3";
        f2.preu = 123043000;

        listaeElectrodomestics.add(f2);


        for (Electrodomestic obj : listaeElectrodomestics) {
            listaCopy.add(obj.clone());
        }


        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < listaeElectrodomestics.size(); i++) {
            compare(i, listaeElectrodomestics.get(i), listaeElectrodomestics.get(i));
        }

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < listaeElectrodomestics.size(); i++) {
            compare(i, listaeElectrodomestics.get(i), listaCopy.get(i));
        }

        System.out.println("Comparar amb la llista clonada però invertida:");
        for (int i = 0; i < listaeElectrodomestics.size(); i++) {
            compare(i, listaeElectrodomestics.get(i), listaCopy.get(listaCopy.size() - i - 1));
        }


    }
    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els poligons són el mateix objecte");
        } else {
            System.out.print(i + ": Els poligons són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els poligons són idèntics");
            } else {
                System.out.println(i + ": Els poligons NO són identics");
            }
        }
    }
}
