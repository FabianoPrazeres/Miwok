/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numeros = (TextView) findViewById(R.id.numbers);
        TextView cores = (TextView)findViewById(R.id.colors);
        TextView familia = (TextView)findViewById(R.id.family);
        TextView frases = (TextView)findViewById(R.id.phrases);

        numeros.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numerosIntent = new Intent(MainActivity.this, NumerosActivity.class);

                // Start the new activity
                startActivity(numerosIntent);
            }
        });

        cores.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coresIntent = new Intent(MainActivity.this, CoresActivity.class);
                startActivity(coresIntent);
            }
        });

        familia.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familiaIntent = new Intent(MainActivity.this, FamiliaActivity.class);
                startActivity(familiaIntent);
            }
        });

        frases.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent frasesIntent = new Intent(MainActivity.this, FrasesActivity.class);
                startActivity(frasesIntent);
            }
        });
    }

}
