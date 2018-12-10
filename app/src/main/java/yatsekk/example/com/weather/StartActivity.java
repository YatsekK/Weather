package yatsekk.example.com.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    private EditText cityNameEditText;
    private CheckBox comfortCheckBox;
    private CheckBox humidityCheckBox;
    private CheckBox barometerCheckBox;
    private CheckBox windCheckBox;

    private final View.OnClickListener showWeatherButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), CurrentWeatherDetailActivity.class);
            setBundle(intent);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setViews();
    }


    private void setBundle(Intent intent) {
        String cityName = cityNameEditText.getText().toString();

        boolean comfortChecked = comfortCheckBox.isChecked();
        boolean humidityChecked = humidityCheckBox.isChecked();
        boolean barometerChecked = barometerCheckBox.isChecked();
        boolean windChecked = windCheckBox.isChecked();

        intent.putExtra(CurrentWeatherDetailActivity.EXTRA_CITY, cityName);
        intent.putExtra(CurrentWeatherDetailActivity.EXTRA_COMFORT, comfortChecked);
        intent.putExtra(CurrentWeatherDetailActivity.EXTRA_HUMIDITY, humidityChecked);
        intent.putExtra(CurrentWeatherDetailActivity.EXTRA_BAROMETER, barometerChecked);
        intent.putExtra(CurrentWeatherDetailActivity.EXTRA_WIND, windChecked);
    }

    private void setViews() {
        cityNameEditText = findViewById(R.id.city_editText);

        comfortCheckBox = findViewById(R.id.comfort_checkbox);
        humidityCheckBox = findViewById(R.id.humidity_checkbox);
        barometerCheckBox = findViewById(R.id.barometer_checkbox);
        windCheckBox = findViewById(R.id.wind_checkbox);

        Button showWeatherButton = findViewById(R.id.show_weather_button);
        showWeatherButton.setOnClickListener(showWeatherButtonClickListener);
    }
}
