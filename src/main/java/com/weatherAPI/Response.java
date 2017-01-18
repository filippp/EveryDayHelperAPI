
package com.weatherAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("termsofService")
    @Expose
    private String termsofService;
    @SerializedName("features")
    @Expose
    private Features features;

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    public Response withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 
     * @return
     *     The termsofService
     */
    public String getTermsofService() {
        return termsofService;
    }

    /**
     * 
     * @param termsofService
     *     The termsofService
     */
    public void setTermsofService(String termsofService) {
        this.termsofService = termsofService;
    }

    public Response withTermsofService(String termsofService) {
        this.termsofService = termsofService;
        return this;
    }

    /**
     * 
     * @return
     *     The features
     */
    public Features getFeatures() {
        return features;
    }

    /**
     * 
     * @param features
     *     The features
     */
    public void setFeatures(Features features) {
        this.features = features;
    }

    public Response withFeatures(Features features) {
        this.features = features;
        return this;
    }

}
