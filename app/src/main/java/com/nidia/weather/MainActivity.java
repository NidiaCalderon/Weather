package com.nidia.weather;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.nidia.weather.adaptadores.Adaptador;
import com.nidia.weather.adaptadores.Categoria;

import java.util.ArrayList;


public class MainActivity extends Activity {

    ListView listado;
    ArrayList<Categoria> categoria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listado = (ListView) findViewById(R.id.listado);
        categoria = new ArrayList<Categoria>();
        categoria.add(new Categoria("Lunes", "Nublado        33c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Martes", "Nublado       33c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Miércoles", "Soleado    45c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Jueves", "Soleado       45c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Viernes", "Soleado      45c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Sábado", "Soleado       45c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Domingo", "Nublado      33c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Lunes", "Nublado        33c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Lunes", "Nublado        33c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Martes", "Nublado       33c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Miércoles", "Soleado    45c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Jueves", "Soleado       45c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Viernes", "Soleado      45c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Sábado", "Soleado       45c", R.drawable.ic_launcher));
        categoria.add(new Categoria("Domingo", "Nublado      33c", R.drawable.ic_launcher));


        Adaptador adapter = new Adaptador(categoria, MainActivity.this.getApplicationContext());
        listado.setAdapter(adapter);


        listado.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                                           @Override
                                           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                               Categoria item = categoria.get(position);
                                               Toast.makeText(getApplicationContext(), "Eligió el Día: " + item.getDia(), Toast.LENGTH_LONG).show();
                                               //String valor =(String)parent.getItemAtPosition(position);
                                               Intent nuevo = new Intent(MainActivity.this,SecondActivity.class);
                                               nuevo.putExtra("días",item.getDia());
                                               startActivity(nuevo);

                                           }
                                       }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}