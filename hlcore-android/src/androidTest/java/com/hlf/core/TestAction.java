package com.hlf.core;

/**
 * Created by fanghailong on 16/4/11.
 */
public class TestAction implements IAction {

    public static final String ButtonAction = "ButtonAction";
    public static final String HTTPRequestAction = "HttpRequestAction";

    private String action;

    @Override
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return this.action;
    }
}
