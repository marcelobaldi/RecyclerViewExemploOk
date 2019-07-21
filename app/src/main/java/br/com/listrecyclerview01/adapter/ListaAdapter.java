package br.com.listrecyclerview01.adapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import br.com.listrecyclerview01.R;
import br.com.listrecyclerview01.model.Cliente;

public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ListaHolder> {
    //Objetos Obrigatórios à Receber Nesta Classe
    private Context             contexto;                //Contexto Activity Anterior (Toast) - (this)
    private ArrayList<Cliente>  listaValoresAdapter;     //Lista Com Valores

    //Construtor Dos Objetos Obrigatórios (quando a outra classe acessar, já passar)
    public ListaAdapter(Context contexto, ArrayList<Cliente> listaValoresAdapter) {
        this.contexto = contexto;
        this.listaValoresAdapter = listaValoresAdapter;
    }

    //Método Recycle - Layout ListaAdapter
    @NonNull @Override public ListaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lista_adapter, viewGroup, false);
        ListaHolder viewHolder = new ListaHolder(view);
        return viewHolder;
    }

    //Método Recycle -  Exibir Lista e Ação nos Itens (colocar o final)
    @Override public void onBindViewHolder(@NonNull final ListaHolder listaHolder, final int i) {
        //Exibir Valores
        Cliente itemAtual = listaValoresAdapter.get(i);
        listaHolder.codigoX.setText(String.valueOf(itemAtual.getCod()));
        listaHolder.nomeX.setText(itemAtual.getNome());

        //Ação Nos Itens - Código
        listaHolder.codigoX.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
            Toast.makeText(contexto, String.valueOf(listaValoresAdapter.get(i).getCod()), Toast.LENGTH_SHORT).show();
        }});

        //Ação Nos Itens - Botão de Comando
        listaHolder.btnAdd.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View view) {
            Toast.makeText(contexto, String.valueOf(listaValoresAdapter.get(i).getCod()), Toast.LENGTH_SHORT).show();
        }});
    }

    //Método Recycle - Tamanho da Lista
    @Override public int getItemCount() {
        return listaValoresAdapter.size();
    }

    //Classe Lista Holder (nós)
    public static class ListaHolder extends RecyclerView.ViewHolder{
        //Objetos da Lista
        public TextView codigoX, nomeX;
        public Button   btnAdd;

        //Construtor Desta Classe Vazio e Depois Identificar os Objetos
        public ListaHolder(@NonNull View itemView) { super(itemView);
            codigoX  =  (TextView) itemView.findViewById(R.id.codXml);
            nomeX    =  (TextView) itemView.findViewById(R.id.nomeXml);
            btnAdd   =  (Button) itemView.findViewById(R.id.btnAddXml);
        }
    }
}




//01.Fazer a Lista RecyclerView;
//02.


//OnBindViewHolder - Verificar se veio todos os da lista (pois só aparece 1 (o da posição 0)).      Esta vindo todos da lista !!!
// Log.d("myLog", listaValoresAdapter.get(0).getNome().toString());
//         Log.d("myLog", listaValoresAdapter.get(1).getNome().toString());
//         Log.d("myLog", listaValoresAdapter.get(2).getNome().toString());





//- builder partner;
  //      - injeção de dependencias;



///Dúvidas - Classes e Construtores
//Como Fazer Sem o Construtor do Context e ArrayList? (o do contexto eu sei);
//Como Fazer Com o Construtor do Context e o Construtor do ArrayList;
//Como Fazer Com o Construtor Vazio (contexto) e o Construtor do ArrayList;

//Criar a Classe ListaAdapter (nós);
//Herdar a Classe RecylcerView.Adapter (java), Que Herda a Classe Holder (nós);
//Implementar os Métodos Obrigatórios da Classe RecyclerView.Adapter;
//Criar a Classe ListaHolder (nós), que Herda a Classe RecyclerView.ViewHolder;

//Classe Lista Holder
//Declarar os Objetos
//Fazer Construtor da Classe Em Branco. pq pede construtor ?!
//Identificar os Objetos no Construtor;

//Criar o Contexto da Actitivity (Comando Toast, Etc);

//Array da Classe Dados;
//Construtor Desta Classe ListaAdapter com o Array Criado;
//Construtor Vazio para o contexto;

//Método - Tela dos Itens da Linha;
//Método - Ação nos Itens (só copiei tb).  //colocar final no I!!!!!!
//Método - Tamanho da Lista;


//não entendi os métodos = só copio!!!!!!!

//https://www.youtube.com/watch?v=ovmWgYxOCug&index=5&list=PLk7v1Z2rk4hjHrGKo9GqOtLs1e2bglHHA
