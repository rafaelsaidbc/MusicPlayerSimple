package com.example.android.calendario;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rafael Said on 16/08/17.
 */


/**
 * {@link CalendarioAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Calendario} objects.
 */
public class CalendarioAdapter extends ArrayAdapter<Calendario> {

    /**
     * Create a new {@link CalendarioAdapter} object.
     */
    public CalendarioAdapter(Context context, ArrayList<Calendario> calendarios) {
        super(context, 0, calendarios);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.calendario_info, parent, false);
        }
        // Get the {@link Calendario} object located at this position in the list
        Calendario currentCalendario = getItem(position);

        //procura o dataTextView no layout calendario_info.xml usando a referência pelo ID
        //data_text_view
        TextView dataTextView = (TextView) listItemView.findViewById(R.id.data_text_view);
        // pega a Data do Jogo do objeto currentCalendario  e coloca no local definido para data
        dataTextView.setText(currentCalendario.getDataJogo());

        //procura o horaTextView no layout calendario_info.xml usando a referência pelo ID
        //hora_text_view
        TextView horaTextView = (TextView) listItemView.findViewById(R.id.hora_text_view);
        // pega a Hora do Jogo do objeto currentCalendario  e coloca no local definido para hora
        horaTextView.setText(currentCalendario.getHoraJogo());

        //procura o timeTextView no layout calendario_info.xml usando a referência pelo ID
        //times_text_view
        TextView timesTextView = (TextView) listItemView.findViewById(R.id.times_text_view);
        // pega os Times que Vão Jogar do objeto currentCalendario e coloca no local definido
        // para os times
        timesTextView.setText(currentCalendario.getTimesJogo());

        //procura o localTextView no layout calendario_info.xml usando a referência pelo ID
        //local_text_view
        TextView localTextView = (TextView) listItemView.findViewById(R.id.local_text_view);
        // pega o Local do Jogo no objeto currentCalendario e coloca no local definido para o
        //local do jogo
        localTextView.setText(currentCalendario.getLocalJogo());

        // Return the whole list item layout (containing 4 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
