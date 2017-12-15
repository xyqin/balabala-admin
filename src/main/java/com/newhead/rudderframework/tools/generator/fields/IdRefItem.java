package com.newhead.rudderframework.tools.generator.fields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.newhead.rudderframework.core.utils.StringUtils;

public class IdRefItem {

    public static String TYPE_M2N = "1";

    public static String TYPE_12N = "2";

    private String type = TYPE_M2N;

    private String displayType = "ListSelect";

    private String r2;

    private String rmid;

    private String rnid;

    private String rnref;

    private String rnname;

    private String r2prj;

    private String rnprj;

    private String sr2;

    private String srnref;

    private int rndata = 3;

    private String remark;

    @JsonIgnore
    public String getBr2() {
        return StringUtils.captureName(this.r2);
    }

    @JsonIgnore
    public String getBrmid() {
        return StringUtils.captureName(this.rmid);
    }

    @JsonIgnore
    public String getBrnid() {
        return StringUtils.captureName(this.rnid);
    }

    @JsonIgnore
    public String getBrnname() {
        return StringUtils.captureName(this.rnname);
    }

    @JsonIgnore
    public String getBrnref() {
        return StringUtils.captureName(this.rnref);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getR2() {
        return r2;
    }

    public void setR2(String r2) {
        this.r2 = r2;
    }

    public String getRmid() {
        return rmid;
    }

    public void setRmid(String rmid) {
        this.rmid = rmid;
    }

    public String getRnid() {
        return rnid;
    }

    public void setRnid(String rnid) {
        this.rnid = rnid;
    }

    public String getRnref() {
        return rnref;
    }

    public void setRnref(String rnref) {
        this.rnref = rnref;
    }

    public String getRnname() {
        return rnname;
    }

    public void setRnname(String rnname) {
        this.rnname = rnname;
    }

    public int getRndata() {
        return rndata;
    }

    public void setRndata(int rndata) {
        this.rndata = rndata;
    }

    public String getR2prj() {
        return r2prj;
    }

    public void setR2prj(String r2prj) {
        this.r2prj = r2prj;
    }

    public String getRnprj() {
        return rnprj;
    }

    public void setRnprj(String rnprj) {
        this.rnprj = rnprj;
    }

    public String getSr2() {
        return r2.toLowerCase();
    }

    public String getSrnref() {
        return rnref.toLowerCase();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }
}
