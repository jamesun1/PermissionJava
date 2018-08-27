package com.example.model;

import java.io.Serializable;

public class User2org implements Serializable {
    private String userinfoid;

    private String orgid;

    private String orgtype;

    private static final long serialVersionUID = 1L;

    public User2org(String userinfoid, String orgid, String orgtype) {
        this.userinfoid = userinfoid;
        this.orgid = orgid;
        this.orgtype = orgtype;
    }

    public User2org() {
        super();
    }

    public String getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(String userinfoid) {
        this.userinfoid = userinfoid == null ? null : userinfoid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getOrgtype() {
        return orgtype;
    }

    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype == null ? null : orgtype.trim();
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
        User2org other = (User2org) that;
        return (this.getUserinfoid() == null ? other.getUserinfoid() == null : this.getUserinfoid().equals(other.getUserinfoid()))
            && (this.getOrgid() == null ? other.getOrgid() == null : this.getOrgid().equals(other.getOrgid()))
            && (this.getOrgtype() == null ? other.getOrgtype() == null : this.getOrgtype().equals(other.getOrgtype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserinfoid() == null) ? 0 : getUserinfoid().hashCode());
        result = prime * result + ((getOrgid() == null) ? 0 : getOrgid().hashCode());
        result = prime * result + ((getOrgtype() == null) ? 0 : getOrgtype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userinfoid=").append(userinfoid);
        sb.append(", orgid=").append(orgid);
        sb.append(", orgtype=").append(orgtype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}