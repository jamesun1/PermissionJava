package com.example.model;

import java.io.Serializable;

public class User2application implements Serializable {
    private String userinfoid;

    private String applicationid;

    private static final long serialVersionUID = 1L;

    public User2application(String userinfoid, String applicationid) {
        this.userinfoid = userinfoid;
        this.applicationid = applicationid;
    }

    public User2application() {
        super();
    }

    public String getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(String userinfoid) {
        this.userinfoid = userinfoid == null ? null : userinfoid.trim();
    }

    public String getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid == null ? null : applicationid.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User2application other = (User2application) that;
        return (this.getUserinfoid() == null ? other.getUserinfoid() == null : this.getUserinfoid().equals(other.getUserinfoid()))
            && (this.getApplicationid() == null ? other.getApplicationid() == null : this.getApplicationid().equals(other.getApplicationid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserinfoid() == null) ? 0 : getUserinfoid().hashCode());
        result = prime * result + ((getApplicationid() == null) ? 0 : getApplicationid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userinfoid=").append(userinfoid);
        sb.append(", applicationid=").append(applicationid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}