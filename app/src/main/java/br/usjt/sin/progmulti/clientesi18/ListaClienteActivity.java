package br.usjt.sin.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaClienteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cliente);
        Intent intent = getIntent();
        String texto = intent.getStringExtra(MainActivity.BUSCA);
        ListView listView = findViewById(R.id.lista_clientes);
        ArrayList<String> clientes = this.clientes();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, clientes);
        listView.setAdapter(adapter);
    }

    private ArrayList<String> busca(String chave){
        return null;
    }

    private ArrayList <String> clientes() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Carlos Drummond de Andrade");
        lista.add("Manuel Bandeira");
        lista.add("Olavo Bilac");
        lista.add("VinÃ­cius de Moraes");
        lista.add("CecÃ­lia Meireles");
        lista.add("Castro Alves");
        lista.add("GonÃ§alves Dias");
        lista.add("Ferreira Gullar");
        lista.add("Machado de Assis");
        lista.add("MÃ¡rio de Andrade");
        lista.add("Cora Coralina");
        lista.add("Manoel de Barros");
        lista.add("JoÃ£o Cabral de Melo Neto");
        lista.add("Casimiro de Abreu");
        lista.add("Paulo Leminski");
        lista.add("Ãlvares de Azevedo");
        lista.add("Guilherme de Almeida");
        lista.add("Alphonsus de GuimarÃ£es");
        lista.add("MÃ¡rio Quintana");
        lista.add("GregÃ³rio de Matos");
        lista.add("Augusto dos Anjos");

    return clientes();
    }
}
