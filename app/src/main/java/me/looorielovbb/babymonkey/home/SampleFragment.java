package me.looorielovbb.babymonkey.home;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import me.looorielovbb.babymonkey.BaseFragment;
import me.looorielovbb.babymonkey.R;
import me.looorielovbb.babymonkey.data.bean.Resource;
import me.looorielovbb.babymonkey.di.FragmentScoped;
import me.looorielovbb.babymonkey.network.Api;
import me.looorielovbb.babymonkey.data.bean.BaseResponse;

@FragmentScoped
public class SampleFragment extends BaseFragment implements View.OnClickListener
{
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    @Inject
    Api api;
    TextView textView;
    private String mParam1;
    private String mParam2;

    public SampleFragment()
    {
    }


    public static SampleFragment newInstance(String param1, String param2)
    {
        SampleFragment fragment = new SampleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
        {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_sample, container, false);
        textView = view.findViewById(R.id.textview);
        textView.setText(mParam1);
        textView.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId())
        {
            case R.id.textview:
                api.getDataByType("福利", 10, 1)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<BaseResponse<Resource>>()
                        {
                            @Override
                            public void onSubscribe(Disposable d)
                            {

                            }

                            @Override
                            public void onNext(BaseResponse<Resource> resources
                            )
                            {
                                Log.w("lul", "success" + resources.getResults().size());
                            }

                            @Override
                            public void onError(Throwable e)
                            {

                            }

                            @Override
                            public void onComplete()
                            {

                            }
                        });
                break;
        }
    }
}
