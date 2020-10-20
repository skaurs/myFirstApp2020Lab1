package edu.uw.tcss450.myfirstapp2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import edu.uw.tcss450.myfirstapp2020.databinding.ActivityDisplayMessageBinding;

public class DisplayMessageActivity extends AppCompatActivity {

    private ActivityDisplayMessageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDisplayMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = binding.textView;
        textView.setText(message);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Lifecycle", "Display has started");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("Lifecycle", "Display on restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "Display has resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Lifecycle", "Display has paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Lifecycle", "Display on destroy");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Lifecycle", "Display on destroy");
    }
}