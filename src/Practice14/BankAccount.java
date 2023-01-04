package Practice14;

import java.util.Arrays;
import java.util.Random;

public class BankAccount {
    String ownerName;
    double balance;
    int creditscore; //1-100
    boolean isFrozen;

    public BankAccount(String ownerName, double balance, int creditscore, boolean isFrozen) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.creditscore = creditscore;
        this.isFrozen = isFrozen;
    }

    public BankAccount(String ownerName, double balance, int creditscore) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.creditscore = creditscore;
    }

    public void withdraw(int withdraw) {
        if (isFrozen == false) {
            this.balance = this.balance - withdraw;
        } else {
            System.out.println("your account is forzen can not withdraw");
        }
        System.out.println("your balance is "+this.balance);
    }
        public void deposit ( int deposit){
            this.balance = balance + deposit;
        }
        public void checkbalance () {
            if (this.balance < -10000 && this.balance>-50000) {
                this.creditscore = creditscore - 10;
                System.out.println("your balance is less than -10,000 your credit score penalty is -10"+this.creditscore+" your balance is "+this.balance);
            } else if (balance < -50000) {
                this.creditscore = creditscore - 10;
                this.isFrozen = true;
                System.out.println("your account is less than -50000 your account is frozen and penalty of 10 credeit score your balance is "+this.balance+" your credit score "+this.creditscore);
            }
            else {
                System.out.println("your balance is "+this.balance);
            }

        }

    public static class Meal {
        String name;
        boolean vegan;
        float price;

        public Meal(String name, boolean vegan, float price) {
            this.name = name;
            this.vegan = vegan;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Practice14.BankAccount.Meal{" +
                    "name='" + name + '\'' +
                    ", vegan=" + vegan +
                    ", price=" + price +
                    '}';
        }



    }

    public static class Memory {
        static int integer;
        static float DeciNum;
        static String STRING;

        public static void add(int i) {
            integer = i;
        }
        public static void add(float f){
            DeciNum = f;
        }
        public static void add(String s){
            STRING = s;
        }
    }

    public static class FootBallTeam8 {


     static String name;
     static  String country;
       static String players [];
        static int teamrate;
        static int serialNum = 0;


        public FootBallTeam8(String name, String country, int teamrate) {
            this.name = name;
            this.country = country;
            this.players = new String[11];
            this.teamrate = teamrate;
            serialNum++;
        }
        public void changeRating(int d) {
            this.teamrate = d;
        }

        /* public void addplayer(String name){
            if(playersNum<players.length) {
                players[playersNum] = name;
                playersNum++;
            }


            else {
                System.out.println("reached limit you can use replace");

            }




        }

         */

        public void addplayer(String name){

            for(int i= 0 ; i<players.length;i++)
            {
                if(players[i]==null){
                    players[i]= name;
                    break;
                }
            }
        }



        public void replace(String oldPalyer, String newPlayer)
        {
            for (int i = 0; i< players.length;i++)
            {
                if(players[i].equals(oldPalyer)) players[i]=newPlayer;
            }
        }

        @Override
        public String toString() {
            return "Practice14.BankAccount.FootBallTeam8{" +
                    "name='" + name + '\'' +
                    ", country=' " + country + '\'' +
                    ", players= " + Arrays.toString(players) +
                    ", teamrate= " + teamrate +
                    ",serealnum= " + serialNum +
                    '}';
        }
    }

    public static class Movie {

        final String movie_name;
        final String Release_date;
        float rate;
        String Genre;
        static int movie_counter;
        static final int RatingForOscar = 9;

        public Movie(String movie_name, String release_date, float rate, String genre) {
            this.movie_name = movie_name;
            Release_date = release_date;
            this.rate = rate;
            Genre = genre;
            movie_counter++;
        }

        @Override
        public String toString() {
            return "Practice14.BankAccount.Movie{" +
                    "movie_name='" + movie_name + '\'' +
                    ", Release_date='" + Release_date + '\'' +
                    ", rate=" + rate +
                    ", Genre='" + Genre + '\'' +
                    '}';
        }

        public void resetCounter() {

            this.movie_counter = 0;


        }

        public boolean isWonOscar() {
            if (rate <= RatingForOscar) {
                System.out.println("didnt win");

                return false;
            }
            else {
                System.out.println("won");
                return true;

            }


        }
    }

    public static class Weather {
        Random r = new Random();
        double Celcius;
        double RainChance;
        boolean cloudy;
        double Humidity;

        public Weather(double celcius, double RainChance, boolean cloudy, double humidity) {
            this.Celcius = celcius;
            this.RainChance = RainChance;
            this.cloudy = cloudy;
            this.Humidity = humidity;
        }


        public void changeRainChance(double rainChance){
          if(RainChance >=0 && RainChance <=100)
            {
                this.RainChance = rainChance;
            }
        }





      /*  public void changeChanceOfRain(double newchance)
        {
            newchance = r.nextDouble(0,100);
           this.RainChane = newchance;
        }

       */



        public void printTempFahrenheit(double fahrenheit) {

            fahrenheit = (Celcius * 8.1 + 32);
            System.out.println("Celcius convereted to farnheit =" + fahrenheit);
            }

        @Override
        public String toString() {
            return "Practice14.BankAccount.Weather{" +
                    "Celcius=" + Celcius +
                    ", RainChane=" + RainChance +
                    ", couldy=" + cloudy +
                    ", Humidity=" + Humidity +
                    '}';
        }
    }

    public static class Practice14 {


        /*

        1.
        מחלקה היא קטע בתוכנה שנכילה בתוכו הכדרות לתכונות ופעולות ומהווה בסיס לתכנות מונחה עצמים
        משתמשים במחלקות כדי לעבוד בשיטת תכנות מונחת עצמים שעוזר לנו לקצר את הקוד ולפשט אותו



        2.
         מופע הוא עצם השייך למחלקה  ומכילה מידע המתאר אותו




        3.
        example exmp = new example{}



        6.
       .ממירה לך את האובייקט שעליו מופעלת הפונקציה לטיפוס מסוג מחרוזת. toString

       11.

      final הוא שדה עם ערך קבוע שלט משתנה במהלך ריצת התוכנית
      static הוא שדה ששיך למחלקה כך שאפ הוא משתנה באחד האובייקטים הוא ישתנה עבור כול האובייקטים

        */


    }
}

