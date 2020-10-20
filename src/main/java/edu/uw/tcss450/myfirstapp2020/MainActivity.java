package edu.uw.tcss450.myfirstapp2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import edu.uw.tcss450.myfirstapp2020.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    public static final String EXTRA_MESSAGE = "edu.uw.tcss450.myfirstapp2020.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, binding.editText.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Lifecycle", "App has started");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("Lifecycle", "App on restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "App has resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Lifecycle", "App has paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Lifecycle", "App on destroy");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Lifecycle", "App on destroy");
    }
}