package com.example.user.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String instanceState;
        if (savedInstanceState == null){
            instanceState = getString(R.string.firstRun);
        }
        else{
            instanceState = getString(R.string.repeadRun);
        }
        Toast.makeText(getApplicationContext(), String.format("%s - %s", instanceState,
                getString(R.string.onCreate)), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(getString(R.string.tagMainActivity), getString(R.string.onStart));
        Toast.makeText(getApplicationContext(), R.string.onStart, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        Log.d(getString(R.string.tagMainActivity), getString(R.string.onRestoreInstanceState));
        Toast.makeText(getApplicationContext(), String.format("%s %s",getString(R.string.repeadRun),
                getString(R.string.onRestoreInstanceState)), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(getString(R.string.tagMainActivity), getString(R.string.onResume));
        Toast.makeText(getApplicationContext(), R.string.onResume, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(getString(R.string.tagMainActivity), getString(R.string.onPause));
        Toast.makeText(getApplicationContext(), R.string.onPause, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
        Log.d(getString(R.string.tagMainActivity), getString(R.string.onSaveInstState));
        Toast.makeText(getApplicationContext(), R.string.onSaveInstState, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(getString(R.string.tagMainActivity), getString(R.string.onStope));
        Toast.makeText(getApplicationContext(), R.string.onStope, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(getString(R.string.tagMainActivity), getString(R.string.onRestart));
        Toast.makeText(getApplicationContext(), R.string.onRestart, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(getString(R.string.tagMainActivity), getString(R.string.onDestroy));
        Toast.makeText(getApplicationContext(), R.string.onDestroy, Toast.LENGTH_SHORT).show();
    }
}
