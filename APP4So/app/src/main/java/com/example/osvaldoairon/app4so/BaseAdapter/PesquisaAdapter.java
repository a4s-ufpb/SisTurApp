package com.example.osvaldoairon.app4so.BaseAdapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.osvaldoairon.app4so.Modelo.Coordenadas;
import com.example.osvaldoairon.app4so.R;
import com.example.osvaldoairon.app4so.ActivitysSecond.ActivityPesquisa;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PesquisaAdapter extends BaseAdapter {
    private Context ctx;
    private ArrayList<Coordenadas> list;

    public PesquisaAdapter(Context ctx, ArrayList<Coordenadas> list1){
        this.ctx=ctx;
        this.list=list1;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Coordenadas cd = list.get(position);

        Log.d("XDXDXDXD",""+cd.getLatitude());


         View  view = LayoutInflater.from(ctx).inflate(R.layout.activity_pesquisa,parent,false);


        TextView nomePonto = (TextView)view.findViewById(R.id.nomePesquisatxt);
        TextView latitudePonto=(TextView)view.findViewById(R.id.latitudePesquisatxt);
        TextView longitudePonto=(TextView)view.findViewById(R.id.longitudePesquisatxt);


        nomePonto.setText("Nome: " + cd.getNomePontoTuristico());
        latitudePonto.setText("Latitude: " + cd.getLatitude());
        longitudePonto.setText("Longitude: "+ cd.getLongitude());

        return view;
    }
}
