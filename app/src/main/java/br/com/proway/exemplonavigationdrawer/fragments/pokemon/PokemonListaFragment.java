package br.com.proway.exemplonavigationdrawer.fragments.pokemon;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.proway.exemplonavigationdrawer.R;
import br.com.proway.exemplonavigationdrawer.adapters.PokemonAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PokemonListaFragment extends Fragment implements View.OnClickListener {

    private RecyclerView recyclerView;
    private PokemonAdapter pokemonAdapter;
    private FloatingActionButton floatingActionButton;

    public PokemonListaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemon_lista, container, false);
    }

    // alterar o titulo da tela, os metodos agora serão sobreescritos, pois telas são fragmentos de tela.
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Lista de Pokemons");

        recyclerView = view.findViewById(R.id.pokemonListaRecyclerView);
        pokemonAdapter = new PokemonAdapter(view.getContext());
        floatingActionButton = view.findViewById(R.id.pokemonListaFloatingActionButton);
        floatingActionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.contentMain, new PokemonCadastroFragment());
        transaction.commit();
    }
}
