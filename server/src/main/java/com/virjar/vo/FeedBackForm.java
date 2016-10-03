package com.virjar.vo;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;
import com.virjar.model.AvProxy;

/**
 * Created by virjar on 16/10/3.
 */
public class FeedBackForm {
    @NotEmpty
    private String domain;

    @NotNull
    private List<AvProxy> avProxy;
    @NotNull
    private List<AvProxy> disableProxy;

    public List<AvProxy> getAvProxy() {
        return avProxy;
    }

    public void setAvProxy(List<AvProxy> avProxy) {
        this.avProxy = avProxy;
    }

    public List<AvProxy> getDisableProxy() {
        return disableProxy;
    }

    public void setDisableProxy(List<AvProxy> disableProxy) {
        this.disableProxy = disableProxy;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
