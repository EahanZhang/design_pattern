package observer_pattern.weather_station;

/**
 * Created by Pudding-hcy on 2019/11/7.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
