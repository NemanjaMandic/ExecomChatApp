package eu.execom.chatapplicationspring2017.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

import eu.execom.chatapplicationspring2017.eventbus.OttoBus;

/**
 * Created by Alex on 5/20/17.
 */

@EActivity
public class BaseActivity extends AppCompatActivity {

    @Bean
    OttoBus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bus.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}
