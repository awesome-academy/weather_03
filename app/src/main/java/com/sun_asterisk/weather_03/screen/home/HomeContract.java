package com.sun_asterisk.weather_03.screen.home;

public interface HomeContract {
    interface View {
    }

    interface Presenter<View> {
        void setView(View view);
    }
}
