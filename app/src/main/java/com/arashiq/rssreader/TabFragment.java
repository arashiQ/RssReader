package com.arashiq.rssreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xjp.androidtoolbardemo.adapter.RecyclerAdapter;
import com.xjp.androidtoolbardemo.model.ModelBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * User: xjp
 * Date: 2015/6/15
 * Time: 15:03
 */

public class TabFragment extends Fragment {

    private String content;
    private View view;
    private RecyclerView recyclerView;

    private List<ModelBean> beanList;
    private RecyclerAdapter adapter;

    private String des[] = {"�Ʋ��������", "�����ĺ�̲", "�����ĺ�̲", "Ϧ�����µ�����", "Ϧ�����µ�����"
            , "Ϧ�����µ�����", "Ϧ�����µ�����", "Ϧ�����µ�����", "�����ĺ�̲"};

    private int resId[] = {R.drawable.img1, R.drawable.img2, R.drawable.img2, R.drawable.img3,
            R.drawable.img4, R.drawable.img5, R.drawable.img3, R.drawable.img1};


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.item, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        content = getArguments().getString("content");
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        initData();
    }


    private void initData() {
        beanList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            ModelBean bean = new ModelBean();
            bean.setResId(resId[i]);
            bean.setTitle(des[i]);
            beanList.add(bean);
        }
        adapter = new RecyclerAdapter(getActivity(), beanList);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new RecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position, Object object) {
                startActivity(new Intent(getActivity(), TwoActivity.class));
            }
        });
    }
};

    private int resId[] = {R.drawable.img1, R.drawable.img2, R.drawable.img2, R.drawable.img3,
            R.drawable.img4, R.drawable.img5, R.drawable.img3, R.drawable.img1};


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.item, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        content = getArguments().getString("content");
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        initData();
    }


    private void initData() {
        beanList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            ModelBean bean = new ModelBean();
            bean.setResId(resId[i]);
            bean.setTitle(des[i]);
            beanList.add(bean);
        }
        adapter = new RecyclerAdapter(getActivity(), beanList);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new RecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position, Object object) {
                startActivity(new Intent(getActivity(), TwoActivity.class));
            }
        });
    }
}