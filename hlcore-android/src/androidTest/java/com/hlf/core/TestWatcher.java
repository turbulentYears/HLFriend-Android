package com.hlf.core;

/**
 * Created by fanghailong on 16/4/11.
 */
public class TestWatcher implements IWatcher {
    @Override
    public void handleAction(IAction action) {
        TestAction tAction = (TestAction)action;
        String actStr = action.getAction();
        if(TestAction.ButtonAction.equals(actStr)){
            this.handleButtonAction();
        }else if(TestAction.HTTPRequestAction.equals(actStr)){
            this.handleHttpRequestAction();
        }
    }

    private void handleButtonAction(){
        System.out.println("这个是处理Button Action的方法");
    }

    private void handleHttpRequestAction(){
        System.out.println("这个是处理HTTP Request Action的方法");
    }
}
