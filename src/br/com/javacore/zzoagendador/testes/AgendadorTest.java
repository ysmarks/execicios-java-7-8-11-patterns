package br.com.javacore.zzoagendador.testes;

import java.util.*;

public class AgendadorTest {

    public static void main(String[] args) {
        /*Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        }, 1000, 10000);*/
        int num = 897033; // Seu numero
        /*String numStr = Integer.toString(num); // Converte o mesmo em uma String
        //char numArr[] = numStr.toCharArray(); // Converte a String em um Array de chars
        char[] numArr = String.valueOf( num ).toCharArray();
        for(char i : numArr) {
            System.out.print(i);
        }*/
        List<String> numAsList = new ArrayList<>();
        for (int i = 0; i < Integer.toString(num).length(); i++) {
            numAsList.add(i, Integer.toString(num).substring(i, i + 1));
        }
        Collections.sort(numAsList, Collections.reverseOrder());
        String numAsString = "";
        for (String digit : numAsList) {
            numAsString = numAsString.concat(digit);
        }
        System.out.println(Integer.parseInt(numAsString));

    }


}
