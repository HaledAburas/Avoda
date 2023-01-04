package Practice14;

import lombok.ToString;

@ToString


public class dog4 {
    String name;
    int age;
    String race;

    public dog4(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public void bark(){
        System.out.println("Woof! Woof!");
    }

    //7 add toString


}
