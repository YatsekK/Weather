package yatsekk.example.com.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    private Button showWeatherButton;
    private EditText cityNameEditText;
    CheckBox comfortCheckBox;
    CheckBox humidityCheckBox;
    CheckBox barometerCheckBox;
    CheckBox windCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        comfortCheckBox = findViewById(R.id.comfort_checkbox);
        humidityCheckBox = findViewById(R.id.humidity_checkbox);
        barometerCheckBox = findViewById(R.id.barometer_checkbox);
        windCheckBox = findViewById(R.id.wind_checkbox);

        cityNameEditText = findViewById(R.id.city_editText);

        showWeatherButton = findViewById(R.id.show_weather_button);
        showWeatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CurrentWeatherDetailActivity.class);
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
                startActivity(intent);
            }
        });
    }
}
