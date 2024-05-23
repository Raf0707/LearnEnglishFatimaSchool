package com.example.learnenglish.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.learnenglish.R;
import com.example.learnenglish.domain.model.IrVerb;

import java.util.List;

public class IrVerbAdapter extends ArrayAdapter<IrVerb> {

    private Context mContext;
    private List<IrVerb> mVerbItemList;

    public IrVerbAdapter(@NonNull Context context, int resource, @NonNull List<IrVerb> verbItemList) {
        super(context, resource, verbItemList);
        mContext = context;
        mVerbItemList = verbItemList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.ir_verb_item, parent, false);
        }

        IrVerb currentVerbItem = mVerbItemList.get(position);

        TextView textViewInfinitive = listItem.findViewById(R.id.textViewInfinitive);
        textViewInfinitive.setText(currentVerbItem.getInfinitive());

        TextView textViewPresent = listItem.findViewById(R.id.textViewPresent);
        textViewPresent.setText(currentVerbItem.getPresent());

        TextView textViewPastSimple = listItem.findViewById(R.id.textViewPastSimple);
        textViewPastSimple.setText(currentVerbItem.getPastSimple());

        TextView textViewPastParticiple = listItem.findViewById(R.id.textViewPastParticiple);
        textViewPastParticiple.setText(currentVerbItem.getPastParticiple());

        return listItem;
    }
}

