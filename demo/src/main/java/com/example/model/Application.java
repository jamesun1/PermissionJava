package com.example.model;

import java.io.Serializable;
import java.util.List;

public class Application implements Serializable {
    private String applicationid;

    private String menuinstanceurl;

    private String menuinstanceicon;

    private String menuinstancesrc;

    private String menuinstancename;

    private String menuinstanceparent;
    
    
  
	private static final long serialVersionUID = 1L;

    public Application(String applicationid, String menuinstanceurl, String menuinstanceicon, String menuinstancesrc, String menuinstancename, String menuinstanceparent) {
        this.applicationid = applicationid;
        this.menuinstanceurl = menuinstanceurl;
        this.menuinstanceicon = menuinstanceicon;
        this.menuinstancesrc = menuinstancesrc;
        this.menuinstancename = menuinstancename;
        this.menuinstanceparent = menuinstanceparent;
    }

    public Application() {
        super();
    }

    public String getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid == null ? null : applicationid.trim();
    }

    public String getMenuinstanceurl() {
        return menuinstanceurl;
    }

    public void setMenuinstanceurl(String menuinstanceurl) {
        this.menuinstanceurl = menuinstanceurl == null ? null : menuinstanceurl.trim();
    }

    public String getMenuinstanceicon() {
        return menuinstanceicon;
    }

    public void setMenuinstanceicon(String menuinstanceicon) {
        this.menuinstanceicon = menuinstanceicon == null ? null : menuinstanceicon.trim();
    }

    public String getMenuinstancesrc() {
        return menuinstancesrc;
    }

    public void setMenuinstancesrc(String menuinstancesrc) {
        this.menuinstancesrc = menuinstancesrc == null ? null : menuinstancesrc.trim();
    }

    public String getMenuinstancename() {
        return menuinstancename;
    }

    public void setMenuinstancename(String menuinstancename) {
        this.menuinstancename = menuinstancename == null ? null : menuinstancename.trim();
    }

    public String getMenuinstanceparent() {
        return menuinstanceparent;
    }

    public void setMenuinstanceparent(String menuinstanceparent) {
        this.menuinstanceparent = menuinstanceparent == null ? null : menuinstanceparent.trim();
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
        Application other = (Application) that;
        return (this.getApplicationid() == null ? other.getApplicationid() == null : this.getApplicationid().equals(other.getApplicationid()))
            && (this.getMenuinstanceurl() == null ? other.getMenuinstanceurl() == null : this.getMenuinstanceurl().equals(other.getMenuinstanceurl()))
            && (this.getMenuinstanceicon() == null ? other.getMenuinstanceicon() == null : this.getMenuinstanceicon().equals(other.getMenuinstanceicon()))
            && (this.getMenuinstancesrc() == null ? other.getMenuinstancesrc() == null : this.getMenuinstancesrc().equals(other.getMenuinstancesrc()))
            && (this.getMenuinstancename() == null ? other.getMenuinstancename() == null : this.getMenuinstancename().equals(other.getMenuinstancename()))
            && (this.getMenuinstanceparent() == null ? other.getMenuinstanceparent() == null : this.getMenuinstanceparent().equals(other.getMenuinstanceparent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplicationid() == null) ? 0 : getApplicationid().hashCode());
        result = prime * result + ((getMenuinstanceurl() == null) ? 0 : getMenuinstanceurl().hashCode());
        result = prime * result + ((getMenuinstanceicon() == null) ? 0 : getMenuinstanceicon().hashCode());
        result = prime * result + ((getMenuinstancesrc() == null) ? 0 : getMenuinstancesrc().hashCode());
        result = prime * result + ((getMenuinstancename() == null) ? 0 : getMenuinstancename().hashCode());
        result = prime * result + ((getMenuinstanceparent() == null) ? 0 : getMenuinstanceparent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applicationid=").append(applicationid);
        sb.append(", menuinstanceurl=").append(menuinstanceurl);
        sb.append(", menuinstanceicon=").append(menuinstanceicon);
        sb.append(", menuinstancesrc=").append(menuinstancesrc);
        sb.append(", menuinstancename=").append(menuinstancename);
        sb.append(", menuinstanceparent=").append(menuinstanceparent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}