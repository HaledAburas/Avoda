package Practice14;

import java.util.Scanner;

public class Main {

    //4. dog class
    public static void createdog() {
        //5 add bark
        dog4 d1 = new dog4("bucky", 4, "dalmati");

        d1.bark();

    }

    //7. toString

    public static void printDog() {
        dog4 d2 = new dog4("lcuky", 2, "pincher");
        System.out.println(d2);


    }


    public static void main(String[] args) {
        printDog();

        System.out.println("serailnum = " + FootBallTeam.serialNum);

        FootBallTeam team1 = new FootBallTeam("brazileo", "brazil", 0);
        System.out.println("serailnum = " + FootBallTeam.serialNum);



        Scanner sc = new Scanner(System.in);
        System.out.println("serailnum = " + FootBallTeam.serialNum);
        for (int i = 0; i < 11; i++) {

            team1.addplayer(sc.next());


        }
      //  team1.replace("asi","trtr");
        System.out.println(team1);

        //13 weather
        Weather w1 = new Weather(32.2,1.0,false,26.0);





        //14 movie
        Movie m1 = new Movie("matrix", "24.06.99", 9.5f, "science fiction");
        Movie m2 = new Movie("ddddd","ddddd",2.2f,"fff");
        System.out.println("the movie "+m1.movie_name );
        m1.isWonOscar();
        System.out.println("the movie"+m2.movie_name);
        m2.isWonOscar();

        //15 Practice14.BankAccount.Memory

        Memory.add(1);
        Memory.add(1.2f);
        Memory.add("shalom");

        //16 bank

        BankAccount b1 = new BankAccount("timmy",-51000.0,10);
        BankAccount b2 = new BankAccount("rammy",1000.0,10,false);
        b1.checkbalance();
        b2.checkbalance();

        b2.withdraw(100);

        System.out.println("b1 is trying to withdraw");
        b1.withdraw(100);








    }


//9 Meals


    public static void createmeals() {

        Meal m1 = new Meal("burger", false, 15f);
        Meal m2 = new Meal("pasta", true, 20f);
        System.out.println(m1);

        Meal meals[] = new Meal[3];
        meals[0] = new Meal("sss",true,15f);
    }

    //10. house

    public void createHouses(){

        Houses h1 = new Houses("adress1",1f,"name1");
        Houses h2 = new Houses("adress2",1f,"name2");
    }
}












