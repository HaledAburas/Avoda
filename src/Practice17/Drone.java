package Practice17;

public class Drone extends Helicopter{
    public Drone(String m_manufacturer, float m_max_speeed, float m_max_altitude, String m_engine_power) {
        super(m_manufacturer, m_max_speeed, m_max_altitude, m_engine_power);
    }

    public void takeOff()
    {
        System.out.println("taking off");
    }

}
