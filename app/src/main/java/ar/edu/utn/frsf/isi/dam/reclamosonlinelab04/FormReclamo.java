package ar.edu.utn.frsf.isi.dam.reclamosonlinelab04;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.List;

import ar.edu.utn.frsf.isi.dam.reclamosonlinelab04.dao.ReclamoDaoHTTP;
import ar.edu.utn.frsf.isi.dam.reclamosonlinelab04.modelo.TipoReclamo;

public class FormReclamo extends AppCompatActivity {

    EditText frmReclamoTitulo;
    EditText frmReclamoDetalle;
    Spinner frmReclamoSpinner;
    Button btnGuardar;
    ReclamoDaoHTTP daoHTTP = new ReclamoDaoHTTP();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_reclamo);

        btnGuardar = (Button) findViewById(R.id.frmReclamoGuardar);
        frmReclamoTitulo = (EditText) findViewById(R.id.frmReclamoTextReclamo);
        frmReclamoDetalle = (EditText) findViewById(R.id.frmReclamoTextDetReclamo);
        frmReclamoSpinner = (Spinner) findViewById(R.id.frmReclamoCmbTipo);

        //hacerlo en AsyncTask
        // List<TipoReclamo> tipoReclamos = daoHTTP.tiposReclamo();
        //ArrayAdapter adapterTiposReclamos = new ArrayAdapter<TipoReclamo>(this,android.R.layout.simple_spinner_item,tipoReclamos);
        //frmReclamoSpinner.setAdapter(adapterTiposReclamos);




    }
}
