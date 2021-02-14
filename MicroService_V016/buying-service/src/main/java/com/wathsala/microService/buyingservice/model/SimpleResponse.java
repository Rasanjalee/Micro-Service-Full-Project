package com.wathsala.microService.buyingservice.model;

import com.wathsala.microService.buyingcloudmodel.transaction.Buying;

/**
 * @author acer on 2/14/2021
 */
public class SimpleResponse implements Response{
    Buying buying;

    public SimpleResponse(Buying buying) {
        this.buying = buying;
    }

    public Buying getBuying() {
        return buying;
    }

    public void setBuying(Buying buying) {
        this.buying = buying;
    }
}
