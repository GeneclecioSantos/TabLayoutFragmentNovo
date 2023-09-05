package br.com.myskout.tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class CachorroFragment extends Fragment {
    ListView lstCachorro;

    //Criar os dados
    String nomeCachorro[] = {"Bife", "Feijão", "Batata", "Farofa"};
    String descricaoCachorro[] = {
            "Quero ser adotado alguém ai se disponibiliza...",
            "Alguém gosta de Dogginho, estou aqui...",
            "Gosto de humano, sou muito carinhoso...",
            "Estou disponível para ser adotado..."

    };
    String numCachorro[] = {"5.0", "8.0", "9.0", "9.5"};
    int imagemCachorro[] = {
            R.drawable.bife, R.drawable.farofa,
            R.drawable.feijao, R.drawable.batata,
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cachorro, container, false);

        lstCachorro = view.findViewById(R.id.lstCachorro);

        //Instanciando a classe adaptadora
        AdapterCachorro adapterCachorro = new AdapterCachorro();


        //Carregar a lista com o adaptador
        lstCachorro.setAdapter(adapterCachorro);

        return view;
    }

    //Criando a minha classe adaptadora ou inner class
    public class AdapterCachorro extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemCachorro.length;
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
            //Declarando as variáveis do modelo
            TextView txtNomeCachorro, txtDescricaoCachorro, txtNumCachorro;
            ImageView imgCachorro;

            //Instanciar a janela do modelo no adapter
            View v = getLayoutInflater().inflate(R.layout.modelo_cachorro,null);

            txtNomeCachorro = v.findViewById(R.id.txtNomeCachorro);
            txtDescricaoCachorro = v.findViewById(R.id.txtDescricaoCachorro);
            txtNumCachorro= v.findViewById(R.id.txtNumCachorro);
            imgCachorro = v.findViewById(R.id.imgModeloCachorro);

            //Inserindo valores nos objetos do modelo
            txtNomeCachorro.setText(nomeCachorro[i]);
            txtDescricaoCachorro.setText(descricaoCachorro[i]);
            txtNumCachorro.setText(numCachorro[i]);
            imgCachorro.setImageResource(imagemCachorro[i]);

            return v;
        }
    }
}