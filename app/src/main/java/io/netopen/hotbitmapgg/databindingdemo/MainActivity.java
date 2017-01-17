package io.netopen.hotbitmapgg.databindingdemo;

import io.netopen.hotbitmapgg.databindingdemo.databinding.ActivityMainBinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,
        R.layout.activity_main);

    activityMainBinding.setStu(new Student("hcc", "27"));
  }
}
