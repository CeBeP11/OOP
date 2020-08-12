package ru.geekbrains.main.site.at;

import ru.geekbrains.main.site.at.obstacles.Treadmill;
import ru.geekbrains.main.site.at.obstacles.Wall;
import ru.geekbrains.main.site.at.participants.Cat;
import ru.geekbrains.main.site.at.participants.man;
import ru.geekbrains.main.site.at.participants.robot;
import ru.geekbrains.main.site.at.participants.Runner;
import ru.geekbrains.main.site.at.obstacles.Obstacles;



public class Start {
    public static void main(String[] args) {

        Cat catTobi = new Cat("Tobi", 14, 7);
        Cat catSimba = new Cat("Simba", 12, 5);
        Cat catKot = new Cat("Kot", 14, 8);

        man manToha = new man("Toha", 10, 4);
        man manStepa = new man("Stepa", 15, 3);
        man manIgor = new man("Igor", 14, 5);

        robot robotKonserva = new robot("Konserva", 15, 6);
        robot robotTitan = new robot("Titan", 20, 18);
        robot robotTank = new robot("Tank", 10, 7);


        Runner[] runners = {catTobi, catSimba, catKot, manToha, manStepa, manIgor, robotKonserva, robotTitan, robotTank};

        Obstacles wall = new Wall(10);
        Obstacles wall1 = new Wall(2);
        Obstacles wall2 = new Wall(3);

        Obstacles treadmill = new Treadmill(10);
        Obstacles treadmill1 = new Treadmill(12);
        Obstacles treadmill2 = new Treadmill(8);


        Obstacles[] obstacles = {wall, wall1, wall2, treadmill, treadmill1, treadmill2};


        System.out.println("Гонка началась!");


        for (int i = 0; i < obstacles.length; i++) {
            System.out.println("\n\nИспытание " + (i + 1));

            for (Runner runner : runners) {
                if (runner.getSuccess()) {
                    System.out.println("------------");
                    obstacles[i].check(runner);
                }

            }
        }
    }
}