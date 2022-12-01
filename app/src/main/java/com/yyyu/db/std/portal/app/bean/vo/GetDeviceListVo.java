package com.yyyu.db.std.portal.app.bean.vo;

import java.util.List;

/**
 * 功能：获取设备列表传参
 *
 * @author yyyu
 * @version 1.0
 * @date 2022-12-01
 */
public class GetDeviceListVo {

    /**
     * deviceTypes : ["130100"]
     * isUseUserPermissions : true
     * nodeId : 003F47B4-82C6-45D5-B65B-A03C986263F9
     * nodeType : 3
     * systemIds : ["107279AB-7807-411C-A3E7-DA7B768FD369"]
     */
    private boolean isUseUserPermissions;
    private String nodeId;
    private String nodeType;
    private List<String> deviceTypes;
    private List<String> systemIds;

    public boolean isIsUseUserPermissions() {
        return isUseUserPermissions;
    }

    public void setIsUseUserPermissions(boolean isUseUserPermissions) {
        this.isUseUserPermissions = isUseUserPermissions;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public List<String> getDeviceTypes() {
        return deviceTypes;
    }

    public void setDeviceTypes(List<String> deviceTypes) {
        this.deviceTypes = deviceTypes;
    }

    public List<String> getSystemIds() {
        return systemIds;
    }

    public void setSystemIds(List<String> systemIds) {
        this.systemIds = systemIds;
    }
}
