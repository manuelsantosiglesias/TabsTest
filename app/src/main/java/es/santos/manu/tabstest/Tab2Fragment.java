package es.santos.manu.tabstest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Usuario on 15/11/2017.
 */

public class Tab2Fragment extends Fragment {

    private static final String TAG = "Tab2Fragment";
    private Button btn2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_fragment, container, false);

        // El casting aparece como redundante
        btn2 = view.findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Toast.makeText(getActivity(), "Fragment 2", Toast.LENGTH_SHORT).show();
                                    }
                                }
        );

        return view;
    }
}
