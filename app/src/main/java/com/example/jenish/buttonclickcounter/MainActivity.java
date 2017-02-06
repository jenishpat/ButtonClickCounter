package com.example.jenish.buttonclickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private static final String TAG = "MainActivity";
    private

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG, "onCreate: in");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        textView.setMovementMethod(new ScrollingMovementMethod());

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result = editText.getText().toString();
                result = result + "\n";
                textView.append(result);
                editText.setText("");
            }
        };
        button.setOnClickListener(ourOnClickListener);
        Log.d(TAG, "onCreate: out");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: Start");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: InstanceRestored");
    }

    /**
     * Dispatch onResume() to fragments.  Note that for better inter-operation
     * with older versions of the platform, at the point of this call the
     * fragments attached to the activity are <em>not</em> resumed.  This means
     * that in some cases the previous state may still be saved, not allowing
     * fragment transactions that modify the state.  To correctly interact
     * with fragments in their proper state, you should instead override
     * {@link #onResumeFragments()}.
     */
    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: Resume");
    }

    /**
     * Dispatch onPause() to fragments.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Pause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: InstanceSaved");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: Destroy");
    }
}
