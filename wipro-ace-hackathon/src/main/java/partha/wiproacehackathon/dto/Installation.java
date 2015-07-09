/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partha.wiproacehackathon.dto;

/**
 *
 * @author user1
 */
public class Installation {

    private Object _id;
    private String name;
    private String email;
    private String IMEI;
    private String loginid;
    private String password;
    private String gcmId;
    private String createdate;
    private String updatedate;
    private String status;

    public Object getId() {
        return _id;
    }

    public void setId(Object _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Installation{" + "_id=" + _id + ", name=" + name + ", email=" + email + ", IMEI=" + IMEI + ", loginid=" + loginid + ", password=" + password + ", gcmId=" + gcmId + ", createdate=" + createdate + ", updatedate=" + updatedate + ", status=" + status + '}';
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGcmId() {
        return gcmId;
    }

    public void setGcmId(String gcmId) {
        this.gcmId = gcmId;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 37 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 37 * hash + (this.IMEI != null ? this.IMEI.hashCode() : 0);
        hash = 37 * hash + (this.loginid != null ? this.loginid.hashCode() : 0);
        hash = 37 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 37 * hash + (this.gcmId != null ? this.gcmId.hashCode() : 0);
        hash = 37 * hash + (this.createdate != null ? this.createdate.hashCode() : 0);
        hash = 37 * hash + (this.updatedate != null ? this.updatedate.hashCode() : 0);
        hash = 37 * hash + (this.status != null ? this.status.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Installation other = (Installation) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        if ((this.IMEI == null) ? (other.IMEI != null) : !this.IMEI.equals(other.IMEI)) {
            return false;
        }
        if ((this.loginid == null) ? (other.loginid != null) : !this.loginid.equals(other.loginid)) {
            return false;
        }
        if ((this.password == null) ? (other.password != null) : !this.password.equals(other.password)) {
            return false;
        }
        if ((this.gcmId == null) ? (other.gcmId != null) : !this.gcmId.equals(other.gcmId)) {
            return false;
        }
        if ((this.createdate == null) ? (other.createdate != null) : !this.createdate.equals(other.createdate)) {
            return false;
        }
        if ((this.updatedate == null) ? (other.updatedate != null) : !this.updatedate.equals(other.updatedate)) {
            return false;
        }
        if ((this.status == null) ? (other.status != null) : !this.status.equals(other.status)) {
            return false;
        }
        return true;
    }

}
