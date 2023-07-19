package com.example.thirdweekstreams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamTest {

    @Test
    public void taskStreams() {

        int[] zahlen = new int [] {9,1,8,2,7,3,6,4,5};
        Arrays.stream(zahlen).sorted().forEach(System.out::println);

        //Für Aufgabe 2 und 3:

        List<Integer> numbers = List.of(9, 1, 8, 2, 7, 3, 6, 4, 5);
        //Aufgabe 2: Addition
        int sumArr;
        sumArr = numbers.stream().reduce(0, (sum, x) -> sum + x);
        System.out.println(sumArr);

        //Aufgabe 3: Multiplikation
        int proArr;
        proArr = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(proArr);

    }

    //Erklärungen Elvedin
    //Filtering()
    @Test
    public void demoStreams() {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        //Grundlage mit List<Integer> angelegt

        List<Integer> numbersGreaterThan5 = numbers.stream().filter(x -> {
            //Schreibweise für einen stream mit filter
                    if (x > 5) {
                        return true;
                        //ich will die Nummer haben - bitte in die Liste packen
                    }

                    return false;
                    //ich wille Nummer nicht in die Liste haben - auslassen
                }).toList();
                //Umwandlung am Ende zu einer Liste ist erforderlich
        // Übliche Vorgehensweise wird durch stream() ersetzt und entsprechend verkürzt
//        for (int i = 0; i < numbers.size(); i++) {
//            //ForSchleife um durch die Ausgangsliste numbers zu iterieren
//            if( numbers.get(i) > 5) {
//                //if-Bedingung
//                numbersGreaterThan5.add(numbers.get(i));
//            }
//        }

        System.out.println(numbersGreaterThan5);
        //Ausgabe der neuen ArrayList
    }

    //Mapping
    @Test
    public void map() {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> numbersPlus1 = numbers.stream().map(x -> x + 1).toList();
        //Kurzschreibweise mittels Lambda

// Übliche Schreibweise bisher wird durch stream() map ersetzt
//        List<Integer> numbersPlus1 = new ArrayList<>();
//
//        for (int i = 0; i < numbers.size(); i++) {
//            //Forschleife um durch die Ausgangsliste numbers zu iterieren
//            numbersPlus1.add(numbers.get(i) + 1);
//        }

        System.out.println(numbersPlus1);
    }

    //REDUCE
    @Test
    public void reduce() {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        //Ausgangsliste
        int sum = 0;
        //Variable für die Summe mit 0 erstellen

        for (int i = 0; i < numbers.size(); i++) {
            //Forschleife um durch die Ausgangsliste numbers zu iterieren
            sum += numbers.get(i);
            //vorhergehende Summe wird stets mit dem nächsten Wert aus numbers addiert
        }

        System.out.println(sum);
    }

}