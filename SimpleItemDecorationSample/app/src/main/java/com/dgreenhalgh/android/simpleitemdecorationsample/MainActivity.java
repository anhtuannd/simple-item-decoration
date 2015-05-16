package com.dgreenhalgh.android.simpleitemdecorationsample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button mLinearLayoutManagerSampleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayoutManagerSampleButton = (Button) findViewById(R.id.activity_main_linearLayoutManagerButton);
        mLinearLayoutManagerSampleButton.setOnClickListener(mLinearLayoutManagerSampleButtonClickListener);
    }

    private View.OnClickListener mLinearLayoutManagerSampleButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Context context = view.getContext();

            Intent linearLayoutManagerSampleIntent = LinearLayoutManagerSampleActivity.newIntent(context);
            context.startActivity(linearLayoutManagerSampleIntent);
        }
    };
}
