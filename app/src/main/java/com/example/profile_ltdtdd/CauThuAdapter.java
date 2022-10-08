package com.example.profile_ltdtdd;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CauThuAdapter extends BaseAdapter {

    private Activity activity;
    private List<CauThu> cauThuList;

    public CauThuAdapter(Activity activity, List<CauThu> cauThuList) {
        this.activity=activity;
        this.cauThuList = cauThuList;
    }

    @Override
    public int getCount() {
        return cauThuList.size();
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

        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.activity_cau_thu, null);

        // ánh xạ view
        TextView txtTen = (TextView) view.findViewById(R.id.textviewTen);
        TextView txtMoTa = (TextView) view.findViewById(R.id.textviewMoTa);
        ImageView imageHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
        // gán giá trị
        CauThu cauThu = cauThuList.get(i);

        txtTen.setText(cauThu.getTen().toString());
        txtMoTa.setText(cauThu.getMoTa().toString());

        imageHinh.setImageResource(cauThu.getHinh());
        return view;
    }



}
