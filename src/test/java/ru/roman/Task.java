package ru.roman;

import java.util.ArrayList;
import java.util.List;

public class Task {
    //Напишите метод  для подсчета количества конкретных слов в строке (уникальное слово - количество повторений).
    //Пример строки:
    //One of the most famous statues in the world stands on an island in New York. This statue is the Statue of Liberty - a woman holding a torch. Visitors can go inside the statue. The statue is so large that as many as twelve people can stand inside the torch.

    public static void main(String[] args) {
        String startingString = "One of the most famous statues in the world stands on an island in New York. This statue is the Statue of Liberty - a woman holding a torch. Visitors can go inside the statue. The statue is so large that as many as twelve people can stand inside the torch.";
        List<String> unfiltered = List.of(startingString.split(" "));
        List<String> filtered = new ArrayList<>();

        for(String element : unfiltered){
            element = element.toLowerCase() ;

            if(element.equals("-") || element.equals("*")){
                continue;
            }

            if(element.endsWith(".")){
                 element = element.replace(".","");
            }
            if(!filtered.contains(element)){
                filtered.add(element);
            }
        }

        System.out.println(filtered);
        System.out.println(filtered.size());
    }
}
