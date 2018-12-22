package yatsekk.example.com.weather;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class HourWeatherListAdapter extends RecyclerView.Adapter<HourWeatherListAdapter.HourWeatherViewHolder> {

    private List<Weather> weatherData = new ArrayList();

    public HourWeatherListAdapter() {
        createWeatherData();
    }

    @NonNull
    @Override
    public HourWeatherListAdapter.HourWeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.hour_weather_list_item, parent, false);
        return new HourWeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HourWeatherListAdapter.HourWeatherViewHolder holder, int i) {
        Weather weather = weatherData.get(i);
        holder.applyWeatherData(weather);

    }

    @Override
    public int getItemCount() {
        return weatherData.size();
    }

    private void createWeatherData() {
        weatherData.add(new Weather("-8°", "-8°", "1 m/s", "95%"));
        weatherData.add(new Weather("-8°", "-8°", "1 m/s", "92%"));
        weatherData.add(new Weather("-8°", "-8°", "1 m/s", "90%"));
        weatherData.add(new Weather("-8°", "-10°", "1 m/s", "87%"));
        weatherData.add(new Weather("-7°", "-10°", "1 m/s", "86%"));
        weatherData.add(new Weather("-7°", "-10°", "2 m/s", "84%"));
        weatherData.add(new Weather("-7°", "-10°", "2 m/s", "83%"));
        weatherData.add(new Weather("-7°", "-10°", "2 m/s", "83%"));
        weatherData.add(new Weather("-6°", "-10°", "2 m/s", "83%"));
        weatherData.add(new Weather("-6°", "-11°", "3 m/s", "83%"));
        weatherData.add(new Weather("-7°", "-11°", "3 m/s", "82%"));
        weatherData.add(new Weather("-7°", "-12°", "4 m/s", "82%"));
    }

    static class HourWeatherViewHolder extends RecyclerView.ViewHolder {

        private final TextView temperature;
        private final TextView temperatureComfort;
        private final TextView wind;
        private final TextView humidity;

        public HourWeatherViewHolder(@NonNull View itemView) {
            super(itemView);
            temperature = itemView.findViewById(R.id.hour_temperature);
            temperatureComfort = itemView.findViewById(R.id.hour_comfort_t);
            wind = itemView.findViewById(R.id.hour_wind);
            humidity = itemView.findViewById(R.id.hour_humidity);
        }

        public void applyWeatherData(Weather weather) {
            temperature.setText(weather.getTemperature());
            temperatureComfort.setText(weather.getComfortTemperature());
            wind.setText(weather.getWind());
            humidity.setText(weather.getHumidity());
        }
    }
}
