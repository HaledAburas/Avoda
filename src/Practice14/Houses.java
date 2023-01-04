package Practice14;

public class Houses {

    final String Adress;
    final float area;
    String Owner_name;

    public Houses(String adress, float area, String owner_name) {
        Adress = adress;
        this.area = area;
        Owner_name = owner_name;
    }

    public Houses(String adress, float area) {
        Adress = adress;
        this.area = area;
    }
}