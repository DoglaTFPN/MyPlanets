package br.com.etecia.myplanets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MostraPlanetaActivity extends AppCompatActivity {

    ImageView imgMostrarPlanetas;
    TextView txtMostrarPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostra_planeta_activity);

        imgMostrarPlanetas = findViewById(R.id.imgMostrarPlaneta);
        txtMostrarPlanetas = findViewById(R.id.txtMostrarPlaneta);

        Intent intent = getIntent();

        String nomePlaneta = intent.getStringExtra("nome_planeta");
        int imagemPlanetas = intent.getIntExtra("img_planeta", 0);

        txtMostrarPlanetas.setText(nomePlaneta);
        imgMostrarPlanetas.setImageResource(imagemPlanetas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }



        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}