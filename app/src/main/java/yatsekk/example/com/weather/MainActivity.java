package yatsekk.example.com.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Date date = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateTime = findViewById(R.id.date_and_time);
        dateTime.setText(date.toString());

        makeToastAndLog("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        makeToastAndLog("onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        makeToastAndLog("onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        makeToastAndLog("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeToastAndLog("onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        makeToastAndLog("onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        makeToastAndLog("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        makeToastAndLog("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeToastAndLog("onDestroy");
    }

    private void makeToastAndLog(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        Log.d(TAG, "makeToastAndLog: " + text);
    }
}
