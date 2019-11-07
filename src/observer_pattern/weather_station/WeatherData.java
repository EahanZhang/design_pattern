package observer_pattern.weather_station;

import java.util.ArrayList;

/**
 * Created by Pudding-hcy on 2019/11/7.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature; // 气温
    private float humidity; // 湿度
    private float pressure; //大气压

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);

        if (index >= 0) {
            observers.remove(index);
        }
        // TODO 异常情况处理：若Observer不在list中?
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer curObserver = (Observer) observers.get(i);
            curObserver.update(temperature, humidity, pressure);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /**
     * 一旦气量数据发生变化，该方法被调用
     */
    public void measurementsChanged() {
        // TODO
        notifyObserver();
    }

    /**
     * 该函数用于测试
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        // 修改值
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
