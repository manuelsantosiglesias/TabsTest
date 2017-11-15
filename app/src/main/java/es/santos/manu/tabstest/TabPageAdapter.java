package es.santos.manu.tabstest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 15/11/2017.
 */

public class TabPageAdapter extends FragmentPagerAdapter {

    private List<Fragment> tFragmentList = new ArrayList<>();
    private final List<String> tFragmentTitle = new ArrayList<>();

    public TabPageAdapter(FragmentManager fm) {
        super(fm);
    }

    //Añadir el fragmento
    public void addFragment(Fragment fragment, String titulo){
        tFragmentList.add(fragment);
        tFragmentTitle.add(titulo);
    }

    // Obtenemos el titulo de la lista
    @Override
    public CharSequence getPageTitle(int position) {
        return tFragmentTitle.get(position);
    }

    // Obtenemos la posicion del fragmento
    @Override
    public Fragment getItem(int position) {
        return tFragmentList.get(position);
    }

    // Obtenemos el tamaño de la lista
    @Override
    public int getCount() {
        return tFragmentList.size();
    }
}
