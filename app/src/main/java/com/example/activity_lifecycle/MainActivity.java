package com.example.activity_lifecycle;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, " onCreate activityMain");

    }
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("value", "asdf");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String myString = savedInstanceState.getString("value");
        textView.setText(myString);
    }
        @Override
protected void onStart() {
    super.onStart();
    Log.d(TAG, "onStart Activity Main");
}

    @Override
    protected void onResume() {
        super. onResume();
        Log.d(TAG, " onResume Activity Main");
    }


    @Override
    protected void onPause() {
        super. onPause();
        Log.d(TAG, " onPause Activity Main");
    }


    @Override
    protected void onStop() {
        super. onStop();
        Log.d(TAG, " onStop Activity Main");
    }
    @Override
    protected void onDestroy() {
        super. onDestroy();
        Log.d(TAG, " onDestroy Activity Main");
    }

}