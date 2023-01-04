package Practice17;

import java.util.Date;

public class Helicopter extends aircraft{
    private String m_engine_power;

    public Helicopter(String m_manufacturer, float m_max_speeed, float m_max_altitude, String m_engine_power) {
        super(m_manufacturer, m_max_speeed, m_max_altitude);
        this.m_engine_power = m_engine_power;
    }

    public void Takeoff()
    {
        System.out.println("taking off");
    }




}
