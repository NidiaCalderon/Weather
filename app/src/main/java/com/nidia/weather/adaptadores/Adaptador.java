package com.nidia.weather.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nidia.weather.R;

import java.util.ArrayList;

/**
 * Created by Nidia on 05/07/2015.
 */
public class Adaptador extends BaseAdapter {

    private ArrayList<Categoria> categoria;
    private LayoutInflater inflater;
    Context contexto;

    public Adaptador(ArrayList<Categoria> cat,Context con)
    {
        this.categoria=cat;
        inflater=LayoutInflater.from(con);
        this.contexto=con;

    }

    @Override
    public int getCount() {
        return categoria.size();
    }

    @Override
    public Object getItem(int position) {
        return categoria.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=inflater.inflate(R.layout.lista,null);
        Categoria cat=categoria.get(position);
        ImageView img = (ImageView) convertView.findViewById(R.id.imagen);
        TextView dia = (TextView) convertView.findViewById(R.id.dia);
        TextView tiempo = (TextView) convertView.findViewById(R.id.grados);

        img.setImageDrawable(contexto.getResources().getDrawable(cat.getImagen()));

        dia.setText(cat.getDia());
        tiempo.setText(cat.getTiempo());

        return convertView;
    }
}
