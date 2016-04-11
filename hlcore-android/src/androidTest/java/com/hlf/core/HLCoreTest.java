package com.hlf.core;

import android.test.AndroidTestCase;

/**
 * Created by fanghailong on 16/4/11.
 */
public class HLCoreTest {
    public void testButtonAction(){
        TestWatcher watcher = new TestWatcher();
        Handle handle = new Handle(watcher);

        TestAction action = new TestAction();
        action.setAction(TestAction.ButtonAction);
        handle.requestHandleAction(action);
    }

    public void testHttpAction(){
        TestWatcher watcher = new TestWatcher();
        Handle handle = new Handle(watcher);

        TestAction action = new TestAction();
        action.setAction(TestAction.HTTPRequestAction);
        handle.requestHandleAction(action);
    }

    public static void main(String[] args){
        HLCoreTest test = new HLCoreTest();
        test.testButtonAction();
    }
}
