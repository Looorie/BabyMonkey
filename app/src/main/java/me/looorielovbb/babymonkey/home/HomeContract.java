package me.looorielovbb.babymonkey.home;

import me.looorielovbb.babymonkey.BasePresenter;
import me.looorielovbb.babymonkey.BaseView;

public interface HomeContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter<View> {

    }
}
