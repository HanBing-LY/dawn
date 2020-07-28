package com.xiaoyuan.demo.mysql.random.po;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable {
    private static final long serialVersionUID = 7828542347626856924L;
    public Long adClientId;
    public Long adOrgId;
    public Date creationdate;
    public Date modifieddate;
    public Long ownerid;
    public String ownername;
    public Long modifierid;
    public String modifiername;
    public String isactive;

    public Long getId() {
        return 0L;
    }

    public BaseModel() {
    }

    public Long getAdClientId() {
        return this.adClientId;
    }

    public Long getAdOrgId() {
        return this.adOrgId;
    }

    public Date getCreationdate() {
        return this.creationdate;
    }

    public Date getModifieddate() {
        return this.modifieddate;
    }

    public Long getOwnerid() {
        return this.ownerid;
    }

    public String getOwnername() {
        return this.ownername;
    }

    public Long getModifierid() {
        return this.modifierid;
    }

    public String getModifiername() {
        return this.modifiername;
    }

    public String getIsactive() {
        return this.isactive;
    }

    public void setAdClientId(Long adClientId) {
        this.adClientId = adClientId;
    }

    public void setAdOrgId(Long adOrgId) {
        this.adOrgId = adOrgId;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public void setModifierid(Long modifierid) {
        this.modifierid = modifierid;
    }

    public void setModifiername(String modifiername) {
        this.modifiername = modifiername;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BaseModel)) {
            return false;
        } else {
            BaseModel var2 = (BaseModel)o;
            if (!var2.canEqual(this)) {
                return false;
            } else {
                label119: {
                    Long var3 = this.getAdClientId();
                    Long var4 = var2.getAdClientId();
                    if (var3 == null) {
                        if (var4 == null) {
                            break label119;
                        }
                    } else if (var3.equals(var4)) {
                        break label119;
                    }

                    return false;
                }

                Long var5 = this.getAdOrgId();
                Long var6 = var2.getAdOrgId();
                if (var5 == null) {
                    if (var6 != null) {
                        return false;
                    }
                } else if (!var5.equals(var6)) {
                    return false;
                }

                label105: {
                    Date var7 = this.getCreationdate();
                    Date var8 = var2.getCreationdate();
                    if (var7 == null) {
                        if (var8 == null) {
                            break label105;
                        }
                    } else if (var7.equals(var8)) {
                        break label105;
                    }

                    return false;
                }

                Date var9 = this.getModifieddate();
                Date var10 = var2.getModifieddate();
                if (var9 == null) {
                    if (var10 != null) {
                        return false;
                    }
                } else if (!var9.equals(var10)) {
                    return false;
                }

                label91: {
                    Long var11 = this.getOwnerid();
                    Long var12 = var2.getOwnerid();
                    if (var11 == null) {
                        if (var12 == null) {
                            break label91;
                        }
                    } else if (var11.equals(var12)) {
                        break label91;
                    }

                    return false;
                }

                String var13 = this.getOwnername();
                String var14 = var2.getOwnername();
                if (var13 == null) {
                    if (var14 != null) {
                        return false;
                    }
                } else if (!var13.equals(var14)) {
                    return false;
                }

                label77: {
                    Long var15 = this.getModifierid();
                    Long var16 = var2.getModifierid();
                    if (var15 == null) {
                        if (var16 == null) {
                            break label77;
                        }
                    } else if (var15.equals(var16)) {
                        break label77;
                    }

                    return false;
                }

                label70: {
                    String var17 = this.getModifiername();
                    String var18 = var2.getModifiername();
                    if (var17 == null) {
                        if (var18 == null) {
                            break label70;
                        }
                    } else if (var17.equals(var18)) {
                        break label70;
                    }

                    return false;
                }

                String var19 = this.getIsactive();
                String var20 = var2.getIsactive();
                if (var19 == null) {
                    if (var20 != null) {
                        return false;
                    }
                } else if (!var19.equals(var20)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseModel;
    }

    public int hashCode() {
        boolean var1 = true;
        byte var2 = 1;
        Long var3 = this.getAdClientId();
        int var12 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
        Long var4 = this.getAdOrgId();
        var12 = var12 * 59 + (var4 == null ? 43 : var4.hashCode());
        Date var5 = this.getCreationdate();
        var12 = var12 * 59 + (var5 == null ? 43 : var5.hashCode());
        Date var6 = this.getModifieddate();
        var12 = var12 * 59 + (var6 == null ? 43 : var6.hashCode());
        Long var7 = this.getOwnerid();
        var12 = var12 * 59 + (var7 == null ? 43 : var7.hashCode());
        String var8 = this.getOwnername();
        var12 = var12 * 59 + (var8 == null ? 43 : var8.hashCode());
        Long var9 = this.getModifierid();
        var12 = var12 * 59 + (var9 == null ? 43 : var9.hashCode());
        String var10 = this.getModifiername();
        var12 = var12 * 59 + (var10 == null ? 43 : var10.hashCode());
        String var11 = this.getIsactive();
        var12 = var12 * 59 + (var11 == null ? 43 : var11.hashCode());
        return var12;
    }

    public String toString() {
        return "BaseModel(adClientId=" + this.getAdClientId() + ", adOrgId=" + this.getAdOrgId() + ", creationdate=" + this.getCreationdate() + ", modifieddate=" + this.getModifieddate() + ", ownerid=" + this.getOwnerid() + ", ownername=" + this.getOwnername() + ", modifierid=" + this.getModifierid() + ", modifiername=" + this.getModifiername() + ", isactive=" + this.getIsactive() + ")";
    }
}
