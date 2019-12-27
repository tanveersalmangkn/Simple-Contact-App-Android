package com.example.tanveersalman.contactapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.tanveersalman.contactapp.Models.Contacts;
import com.example.tanveersalman.contactapp.R;

import java.util.List;

/**
 * Created by Tanveer Salman on 31-Jan-19.
 */

public class ContactsAdapter extends BaseAdapter {
    private Context context;
    private List<Contacts> contactsList;
    private LayoutInflater inflater;

    public ContactsAdapter(Context context, List<Contacts> contactsList){
        this.contactsList = contactsList;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    //Updates data set items
    public void setDataSet(List<Contacts> contactsList){
        this.contactsList = contactsList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return contactsList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = inflater.inflate(R.layout.item_list, parent, false);
        }
        TextView tvPhoneName = (TextView) convertView.findViewById(R.id.tvContactName);
        TextView tvPhoneNum = (TextView) convertView.findViewById(R.id.tvContactNumber);

        tvPhoneName.setText(getItem(position).getName();
        tvPhoneNum.setText(getItem(position).getPhoneNumber);
        return convertView;
    }
}
