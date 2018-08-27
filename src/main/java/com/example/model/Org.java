package com.example.model;

import java.io.Serializable;

public class Org implements Serializable {
    private String orgid;

    private String orgname;

    private String orgparentid;

    private static final long serialVersionUID = 1L;

    public Org(String orgid, String orgname, String orgparentid) {
        this.orgid = orgid;
        this.orgname = orgname;
        this.orgparentid = orgparentid;
    }

    public Org() {
        super();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getOrgparentid() {
        return orgparentid;
    }

    public void setOrgparentid(String orgparentid) {
        this.orgparentid = orgparentid == null ? null : orgparentid.trim();
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
        Org other = (Org) that;
        return (this.getOrgid() == null ? other.getOrgid() == null : this.getOrgid().equals(other.getOrgid()))
            && (this.getOrgname() == null ? other.getOrgname() == null : this.getOrgname().equals(other.getOrgname()))
            && (this.getOrgparentid() == null ? other.getOrgparentid() == null : this.getOrgparentid().equals(other.getOrgparentid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrgid() == null) ? 0 : getOrgid().hashCode());
        result = prime * result + ((getOrgname() == null) ? 0 : getOrgname().hashCode());
        result = prime * result + ((getOrgparentid() == null) ? 0 : getOrgparentid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgid=").append(orgid);
        sb.append(", orgname=").append(orgname);
        sb.append(", orgparentid=").append(orgparentid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}