package com.alberovalley.listatonta1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class PrincipalActivity extends Activity implements OnClickListener {
	
	private ListView lista;
	private EditText entrada;
	private Button boton;
	private ArrayAdapter<String> adaptador;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        lista = (ListView)findViewById(R.id.lista);
        entrada = (EditText)findViewById(R.id.entrada);
        boton = (Button)findViewById(R.id.boton);
        boton.setOnClickListener(this);
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        lista.setAdapter(adaptador);
    }

	public void onClick(View v) {
		if(v.getId() == R.id.boton){
			String entrado = entrada.getText().toString();
			if (!entrado.equalsIgnoreCase("")){
				adaptador.add(entrado);
				entrada.setText("");
			}
		}
		
	}
}