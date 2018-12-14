package com.qf.admin.pojo.po;

public class Fund {
    private int jid;
    private String uname;
    private String details;
    private String percentnian;
    private String percentri;
    private String redeem;
    private String networth;
    private String time;
    private String money;
    private String cid;
    private String scale;
    private String risk;
    private String residue;
    private String timeLimits;

    public Fund() {
    }

    @Override
    public String toString() {
        return "Fund{" +
                "jid=" + jid +
                ", uname='" + uname + '\'' +
                ", details='" + details + '\'' +
                ", percentnian='" + percentnian + '\'' +
                ", percentri='" + percentri + '\'' +
                ", redeem='" + redeem + '\'' +
                ", networth='" + networth + '\'' +
                ", time='" + time + '\'' +
                ", money='" + money + '\'' +
                ", cid='" + cid + '\'' +
                ", scale='" + scale + '\'' +
                ", risk='" + risk + '\'' +
                ", residue='" + residue + '\'' +
                ", timeLimits='" + timeLimits + '\'' +
                '}';
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPercentnian() {
        return percentnian;
    }

    public void setPercentnian(String percentnian) {
        this.percentnian = percentnian;
    }

    public String getPercentri() {
        return percentri;
    }

    public void setPercentri(String percentri) {
        this.percentri = percentri;
    }

    public String getRedeem() {
        return redeem;
    }

    public void setRedeem(String redeem) {
        this.redeem = redeem;
    }

    public String getNetworth() {
        return networth;
    }

    public void setNetworth(String networth) {
        this.networth = networth;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getResidue() {
        return residue;
    }

    public void setResidue(String residue) {
        this.residue = residue;
    }

    public String getTimeLimits() {
        return timeLimits;
    }

    public void setTimeLimits(String timeLimits) {
        this.timeLimits = timeLimits;
    }
}
