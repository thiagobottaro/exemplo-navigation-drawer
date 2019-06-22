package br.com.proway.exemplonavigationdrawer.fragments.usuario;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.proway.exemplonavigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UsuarioCadastroFragment extends Fragment {


    public UsuarioCadastroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_usuario_cadastro, container, false);
    }

}
