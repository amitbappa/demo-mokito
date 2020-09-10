package com.demo.mokito;

import android.os.Handler;
import android.os.Message;


public class HandlerWrapper {

    private final Handler handler;

    public HandlerWrapper() {
        handler = new Handler();
    }

    public boolean post(Runnable r) {
        return handler.post(r);
    }

    public boolean sendMessage(Message msg) {
        return handler.sendMessage(msg);
    }
}
