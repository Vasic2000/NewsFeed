package ru.vasic2000.socialnetwork;

import android.content.res.Resources;

public class SocSourceBuilder {
    private Resources resources;

    public SocSourceBuilder setResources(Resources resources){
        this.resources = resources;
        return this;
    }

    public SocialDataSource build(){
        SocSource socSource = new SocSource(resources);
        socSource.init();
        return socSource;
    }
}
