package io.netopen.hotbitmapgg.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by hcc on 2017/1/17 14:04
 * 100332338@qq.com
 * DatabindingDemo
 *
 * @HotBitmapGG
 */

public class TestBean extends BaseObservable {
  private String text;


  @Bindable
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
    notifyPropertyChanged(BR.text);
  }
}
