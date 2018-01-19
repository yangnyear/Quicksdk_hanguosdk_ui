package com.example.administrator.ks.fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.ks.R;

/**
 * Created by Administrator on 2018/1/17.
 */

public class LoginFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.ks_fragment_login, container, false);
        }
//        ShowLoginLayout(inflater);
        return view;
    }
    public void ShowLoginLayout(LayoutInflater inflater){
        final AlertDialog.Builder loginlDialog = new AlertDialog.Builder(this.getContext());
        View dialogView = inflater.inflate(R.layout.ks_dia_layout_login,null);
        loginlDialog.setView(dialogView).show();
    }
}
