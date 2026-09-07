public class Main {
    public static void main(String[]args) {
        WeatherStation ws = new WeatherStation();

        TemperatureDisplay td1 = new TemperatureDisplay("Janttela");
        TemperatureDisplay td2 = new TemperatureDisplay("Kaijala");
        TemperatureDisplay td3 = new TemperatureDisplay("Adala");
        TemperatureDisplay td4 = new TemperatureDisplay("Taigala");

        ws.addObserver(td1);
        ws.addObserver(td2);
        ws.addObserver(td3);
        ws.addObserver(td4);

        Thread weatherThread = new Thread(ws);
        weatherThread.start();
    }
}
