package com.example.android.calendario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_calendario);

        ArrayList<Calendario> calendarios = new ArrayList<Calendario>();
        calendarios.add(new Calendario("20/08 - ", "09:00", "Santa Cruz x Alvorada", "Cachoeirinha"));
        calendarios.add(new Calendario("27/08 - ", "08:00", "Couceiro x Santa Cruz", "Couceiro"));
        calendarios.add(new Calendario("24/09 - ", "08:00", "Nova Aliança x Santa Cruz", "Couceiro"));
        calendarios.add(new Calendario("08/10 - ", "horário não definido", "Bom pra Bicho x Santa Cruz", "Porto Firme"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        CalendarioAdapter adapter = new CalendarioAdapter(this, calendarios);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // lista_info_jogadores.xml file.
        ListView listView = (ListView) findViewById(R.id.lista_calendario);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }

}