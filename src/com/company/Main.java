package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String enteredLine;
        String answer;
        String[] word;
        //enteredLine = "!abcd qwerty, gikm! opsta."; //for test
        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");

        ArrayList<String> selectedWord = new ArrayList<>();
        do{
            System.out.println("Enter line");
            enteredLine = in.nextLine();
            word = pattern.split(enteredLine);
            boolean temp = false;
            for (String s : word) {
                for (int j = 0; j < s.length()-1; j++) {
                    if (s.charAt(j) <= s.charAt(j+1)) {
                        temp = true;
                    } else {
                        temp = false;
                        break;
                    }
                }
                if (temp) {
                    selectedWord.add(s);
                }
            }

            if(!selectedWord.isEmpty()){
                System.out.println("Selected words:");
                for (String s : selectedWord) {

                    System.out.println(s);
                }
            }
            else{
                System.out.println("Not found");
            }
            selectedWord.clear();
            System.out.println("Enter extra line? Yes\\No");
            answer = in.nextLine();
        }while (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"));
        in.close();

        String cup = "┊┊┊┊┊╭╯╭╯┊┊┊┊┊┊┊\n" +
                "┊┊╱▔╭╯╭╯▔╲┊┊┊┊┊┊\n" +
                "┊▕╲▂▂▂▂▂▂╱▏┊┊┊┊┊\n" +
                "┊┊▏┈╱╲╱╲┈▕━╮┊┊┊┊\n" +
                "┊┊▏┈╲┈┈╱┈▕┊┃┊┊┊┊\n" +
                "┊┊▏┈┈╲╱┈┈▕━╯┊┊┊┊\n" +
                "┊┊╲▂▂▂▂▂▂╱┊┊┊┊┊┊";
        System.out.println(cup);

    }
}
