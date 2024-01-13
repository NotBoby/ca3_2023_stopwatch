package at.wifi.stopwatch.program;

import at.wifi.stopwatch.models.StopWatch;

import java.sql.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) {
        StopWatch Watch = new StopWatch();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Drücken Sie 1 um die Stopwatch zu starten");
        int i = scan.nextInt();

        if(i == 1){
            Watch.start();
        }

        System.out.println("Drücken Sie 2 um die Stopwatch zu stoppen oder 3 für einen reset");
        int p = scan.nextInt();
        if(p == 2){
            Watch.stop();
        }else if(p == 3){
            Watch.reset();
            System.out.println("Drücken Sie 1 um die Stopwatch zu starten");
            int r = scan.nextInt();

            if(r == 1){
                Watch.start();
            }
            System.out.println("Drücken Sie 2 um die Stopwatch zu stoppen");
            int t = scan.nextInt();

            if(t == 2){
                Watch.stop();
            }
        }


        Watch.difference();

        System.out.println(Watch);
    }
}