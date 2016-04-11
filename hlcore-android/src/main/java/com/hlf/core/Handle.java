package com.hlf.core;

/**
 * Created by fanghailong on 16/4/11.
 * Handle是Action对象的处理转发对象，该对象持有Watcher对象的引用，并将Action对象转发给Watcher对象处理；
 * 如非必要，请不要自行扩展Handle类，Handle类功能单一，只有路由Action对象的作用，以达到对操作点的逻辑分离;
 */
public class Handle {

    private HandleImpl baseHandle;

    {
        baseHandle = new HandleImpl();
    }

    public Handle(IWatcher watcher){
        this.baseHandle.setWatcher(watcher);
    }

    public void setWatcher(IWatcher watcher){
        this.baseHandle.setWatcher(watcher);
    }

    public void requestHandleAction(IAction action){
        this.baseHandle.requestHandleAction(action);
    }

    private final class HandleImpl{

        private IWatcher watcher;


        public IWatcher getWatcher() {
            return watcher;
        }

        public void setWatcher(IWatcher watcher) {
            this.watcher = watcher;
        }

        public void requestHandleAction(IAction action){
            if(action == null || watcher == null){
                return;
            }

            watcher.handleAction(action);
        }

    }
}
