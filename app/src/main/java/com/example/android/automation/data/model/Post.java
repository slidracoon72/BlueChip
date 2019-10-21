package com.example.android.automation.data.model;
import android.content.Context;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("value")
    @Expose
    private Integer value;

    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("context")
    @Expose
    private Context context;
    @SerializedName("created_at")
    @Expose
    private String createdAt;

    //constructor
    public Post(String url, Integer val){
        this.url = url;
        this.value = val;
    }

    //setter and getter methods
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "url='" + url + '\'' +
                ", value=" + value
//                +
//                ", timestamp=" + timestamp +
//                ", context=" + context +
//                ", createdAt='" + createdAt + '\'' +
//                '}';
        ;
    }

}

