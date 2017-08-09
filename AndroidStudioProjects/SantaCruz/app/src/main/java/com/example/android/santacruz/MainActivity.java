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
package com.example.android.santacruz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(com.example.android.santacruz.R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView jogadores = (TextView) findViewById(R.id.jogadores);

        // Set a click listener on that View
        jogadores.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent jogadoresIntent = new Intent(MainActivity.this, com.example.android.santacruz.JogadoresActivity.class);

                // Start the new activity
                startActivity(jogadoresIntent);
            }
        });

        // Find the View that shows the family category
        TextView resultados = (TextView) findViewById(R.id.resultados);

        // Set a click listener on that View
        resultados.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent resultadosIntent = new Intent(MainActivity.this, com.example.android.santacruz.ResultadosActivity.class);

                // Start the new activity
                startActivity(resultadosIntent);
            }
        });

        // Find the View that shows the colors category
        TextView calendario = (TextView) findViewById(R.id.calendario);

        // Set a click listener on that View
        calendario.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent calendarioIntent = new Intent(MainActivity.this, com.example.android.santacruz.CalendarioActivity.class);

                // Start the new activity
                startActivity(calendarioIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView fotos = (TextView) findViewById(R.id.fotos);

        // Set a click listener on that View
        fotos.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent fotosIntent = new Intent(MainActivity.this, com.example.android.santacruz.FotosActivity.class);

                // Start the new activity
                startActivity(fotosIntent);
            }
        });
    }
}
