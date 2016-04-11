package com.hlf.core;

/**
 * Created by fanghailong on 16/4/11.
 * IWatcher是对Action对象观察者的一个抽象，是处理Action的具体场景；
 */
public interface IWatcher {

    public void handleAction(IAction action);
}
