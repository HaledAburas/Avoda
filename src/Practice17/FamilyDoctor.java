package Practice17;

public class FamilyDoctor {
    private boolean isBusy;
    private String clinic;

    public boolean isBusy() {
        return isBusy;
    }

    public String getClinic() {
        return clinic;
    }

    public void setBusy(boolean busy) {
        this.isBusy = busy;
    }

    public void acceptClient() {
        if (this.isBusy == true) {
            System.out.println("is busy");
        } else {
            System.out.println("Welcome");
        }
    }

        public void finishApointment()
        {
            this.isBusy=false;
        }
}
