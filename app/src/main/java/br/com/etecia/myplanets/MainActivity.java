package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listaPlanetas;

    String nomePlaneta [] = {"Júpiter", "Lua", "Marte", "Mercúrio", "Neturno", "Plutão", "Saturno", "Sol", "Terra", "Urano", "Vênus"};

    int imagemPlanetas[] = {R.drawable.jupiter, R.drawable.lua,
            R.drawable.marte, R.drawable.mercurio, R.drawable.netuno,
            R.drawable.plutao, R.drawable.saturno, R.drawable.sol,
            R.drawable.terra, R.drawable.urano, R.drawable.venus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPlanetas = findViewById(R.id.idListaPlanetas);

        MyAdapter adapter = new MyAdapter();

        listaPlanetas.setAdapter(adapter);
    }

    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return imagemPlanetas.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            ImageView imgPlanetas;
            TextView txtPlanetas;

            View view1 = getLayoutInflater().inflate(R.layout.modelo_planetas,null);
            txtPlanetas = view1.findViewById(R.id.txtModeloPlaneta);
            imgPlanetas = view1.findViewById(R.id.imgModeloPlaneta);

            txtPlanetas.setText(nomePlaneta[i]);
            imgPlanetas.setImageResource(imagemPlanetas[i]);

            return view1;
        }
    }
}