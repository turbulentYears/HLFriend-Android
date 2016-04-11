package com.hlf.core;

/**
 * Created by fanghailong on 16/4/11.
 * IAction是对业务场景产生的UI交互，网路通信等操作的抽象，每次操作都会抽象出一个Action对象，
 * 通过该对象的getAction()方法返回代表当前操作类型的值。
 */
public interface IAction {

    public void setAction(String action);

    public String getAction();
}
