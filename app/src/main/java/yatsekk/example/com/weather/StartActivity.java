package yatsekk.example.com.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    private Button showWeatherButton;
    private EditText cityNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        cityNameEditText = findViewById(R.id.city_editText);

        showWeatherButton = findViewById(R.id.show_weather_button);
        showWeatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CurrentWeatherDetailActivity.class);
                String cityName = cityNameEditText.getText().toString();
                intent.putExtra("city", cityName);
                startActivity(intent);
            }
        });
    }
}
