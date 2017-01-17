package io.netopen.hotbitmapgg.databindingdemo;

/**
 * Created by hcc on 2017/1/16 15:47
 * 100332338@qq.com
 * DatabindingDemo
 *
 * @HotBitmapGG
 */

public class Student {

  private String name;

  private String addr;


  public Student(String name, String addr) {
    this.name = name;
    this.addr = addr;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getAddr() {
    return addr;
  }


  public void setAddr(String addr) {
    this.addr = addr;
  }


  @Override public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", addr='" + addr + '\'' +
        '}';
  }
}
