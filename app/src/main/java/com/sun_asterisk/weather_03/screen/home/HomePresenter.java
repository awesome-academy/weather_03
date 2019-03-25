package com.sun_asterisk.weather_03.screen.home;

public class HomePresenter implements HomeContract.Presenter<HomeContract.View> {
    private HomeContract.View mView;

    @Override
    public void setView(HomeContract.View view) {
        mView = view;
    }
}
