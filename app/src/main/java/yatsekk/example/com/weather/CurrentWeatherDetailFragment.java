package yatsekk.example.com.weather;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CurrentWeatherDetailFragment extends Fragment {

    public static final String EXTRA_CITY = "city";
    public static final String EXTRA_COMFORT = "comfort";
    public static final String EXTRA_HUMIDITY = "humidity";
    public static final String EXTRA_BAROMETER = "barometer";
    public static final String EXTRA_WIND = "wind";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_current_weather_detail, container, false);
        return view;
    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_current_weather_detail);

        Intent intent = getIntent();
        setViews(intent);
    }*/

    /*private void setViews(Intent intent) {

        TextView dateTime = findViewById(R.id.date_and_time);
        dateTime.setText(new Date().toString());

        TextView cityLocated = findViewById(R.id.city_located);
        String cityLocatedName = intent.getStringExtra(EXTRA_CITY);
        cityLocated.setText(cityLocatedName);

        TextView comfortT = findViewById(R.id.comfort_t_textView);
        boolean comfortChecked = intent.getBooleanExtra(EXTRA_COMFORT, false);
        comfortT.setVisibility(comfortChecked ? View.VISIBLE : View.INVISIBLE);

        TextView humidity = findViewById(R.id.humidity_textView);
        // Почему я не могу создать Checkbox прямо тут? Почему он в этом случае null?
        // CheckBox humidityCheckBox = findViewById(R.id.humidity_checkbox);
        boolean humidityChecked = intent.getBooleanExtra(EXTRA_HUMIDITY, false);
        humidity.setVisibility(humidityChecked ? View.VISIBLE : View.INVISIBLE);

        TextView barometer = findViewById(R.id.barometer_textView);
        boolean barometerChecked = intent.getBooleanExtra(EXTRA_BAROMETER, false);
        barometer.setVisibility(barometerChecked ? View.VISIBLE : View.INVISIBLE);

        TextView wind = findViewById(R.id.wind_textView);
        boolean windChecked = intent.getBooleanExtra(EXTRA_WIND, false);
        wind.setVisibility(windChecked ? View.VISIBLE : View.INVISIBLE);
    }*/
}
