package com.example.cebancpizza;


import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Pantalla1 extends ActionBarActivity {
	private EditText eNom;
	private EditText eDir;
	private EditText eTlf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
        eNom=(EditText) findViewById(R.id.etNombre);
    	eDir=(EditText) findViewById(R.id.etDireccion);
    	eTlf=(EditText) findViewById(R.id.etTelefono);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pantalla1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void btnSigOnClick(View view){
    	String nombre=eNom.getText().toString();
    	String direccion=eDir.getText().toString();
    	String telefono=eTlf.getText().toString();
    	if (nombre.equals("")||direccion.equals("")||telefono.equals("")){
    		Context context = getApplicationContext();
    		CharSequence text = "Algun campo vacio";
    		int duration = Toast.LENGTH_SHORT;

    		Toast toast = Toast.makeText(context, text, duration);
    		toast.show();
    	}else{
    		Intent i =new Intent(this,Pantalla2.class);
        	i.putExtra("nomb", nombre);
        	i.putExtra("dir", direccion);
        	i.putExtra("tlf",telefono);
        	startActivity(i);
    	}
    }
}
