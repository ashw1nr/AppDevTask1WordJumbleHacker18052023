package org.ashcode.appdevwordjumbletask1rerough;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.nfc.cardemulation.CardEmulation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class BtnGVAdapter_ma2 extends ArrayAdapter<BtnModelInGrid> {

    public BtnGVAdapter_ma2(@NonNull Context context, ArrayList<BtnModelInGrid> btnModelArrayList) {
        super(context, 0, btnModelArrayList);
    }

    @SuppressLint("ResourceAsColor")
    @NonNull

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item_btn, parent, false);
        }

        //CardView showingCrdForBtn = listitemView.findViewById(R.id.cardViewOfcard_item_btn);
        //showingCrdForBtn.set
        BtnModelInGrid btnModelInGrid = getItem(position);
        TextView showingBtn = listitemView.findViewById(R.id.buttonIdOnCardViewLL);

        showingBtn.setText(btnModelInGrid.getBtnTextLetter());
        try {
            showingBtn.setBackgroundResource(btnModelInGrid.getBtnBgColor());}
        catch (Exception Resources$NotFoundException){
            showingBtn.setBackgroundColor(btnModelInGrid.getBtnBgColor());
        }
        try {
            showingBtn.setTextColor(ContextCompat.getColor(getContext(), btnModelInGrid.getBtnTextColor()));
        }
        catch (Exception Resources$NotFoundException){
            showingBtn.setTextColor(btnModelInGrid.getBtnTextColor());
        }
        //courseIV.setImageResource(courseModel.getImgid());
        return listitemView;
    }
}
