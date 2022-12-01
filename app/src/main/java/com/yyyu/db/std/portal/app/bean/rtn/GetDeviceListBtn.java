package com.yyyu.db.std.portal.app.bean.rtn;

import java.util.List;

/**
 * 功能：获取设备列表返回结果
 *
 * @author yyyu
 * @version 1.0
 * @date 2022-12-01
 */
public class GetDeviceListBtn {

    private String code;
    private String msg;
    private DataBean data;
    private Object exception;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public Object getException() {
        return exception;
    }

    public void setException(Object exception) {
        this.exception = exception;
    }

    public static class DataBean {
        private int onlineTotal;
        private List<ListBean> list;

        public int getOnlineTotal() {
            return onlineTotal;
        }

        public void setOnlineTotal(int onlineTotal) {
            this.onlineTotal = onlineTotal;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String deviceId;
            private String deviceType;
            private String deviceName;
            private String deviceDictId;
            private String deviceDictName;
            private String deviceCode;
            private String ip;
            private Object port;
            private Object username;
            private Object password;
            private Object beginStakeNo;
            private Object endStakeNo;
            private String deviceAlias;
            private Object deviceConn;
            private String direction;
            private String longitude;
            private String latitude;
            private Object updateTime;
            private Object updateBy;
            private String facilitiesName;
            private String waysectionName;
            private String deviceTypeName;
            private String systemName;
            private String location;
            private String centerOffNo;
            private String manufacturer;
            private Object manufacturerId;
            private String facilitiesId;
            private String waysectionId;
            private String systemId;
            private int sort;
            private Object createTime;
            private Object createBy;
            private String orgId;
            private String orgName;
            private String orgShortName;
            private Object tollStationId;
            private Object tollStationName;
            private Object pic;
            private Object deviceModel;
            private Object protocolApplyScope;
            private Object laneId;
            private Object dataCollectType;
            private int laneNum;
            private String seriaNumber;
            private Object remark;
            private Object deviceIdOld;
            private Object name;
            private Object parentId;
            private String status;
            private String isFault;
            private Object mac;

            public String getDeviceId() {
                return deviceId;
            }

            public void setDeviceId(String deviceId) {
                this.deviceId = deviceId;
            }

            public String getDeviceType() {
                return deviceType;
            }

            public void setDeviceType(String deviceType) {
                this.deviceType = deviceType;
            }

            public String getDeviceName() {
                return deviceName;
            }

            public void setDeviceName(String deviceName) {
                this.deviceName = deviceName;
            }

            public String getDeviceDictId() {
                return deviceDictId;
            }

            public void setDeviceDictId(String deviceDictId) {
                this.deviceDictId = deviceDictId;
            }

            public String getDeviceDictName() {
                return deviceDictName;
            }

            public void setDeviceDictName(String deviceDictName) {
                this.deviceDictName = deviceDictName;
            }

            public String getDeviceCode() {
                return deviceCode;
            }

            public void setDeviceCode(String deviceCode) {
                this.deviceCode = deviceCode;
            }

            public String getIp() {
                return ip;
            }

            public void setIp(String ip) {
                this.ip = ip;
            }

            public Object getPort() {
                return port;
            }

            public void setPort(Object port) {
                this.port = port;
            }

            public Object getUsername() {
                return username;
            }

            public void setUsername(Object username) {
                this.username = username;
            }

            public Object getPassword() {
                return password;
            }

            public void setPassword(Object password) {
                this.password = password;
            }

            public Object getBeginStakeNo() {
                return beginStakeNo;
            }

            public void setBeginStakeNo(Object beginStakeNo) {
                this.beginStakeNo = beginStakeNo;
            }

            public Object getEndStakeNo() {
                return endStakeNo;
            }

            public void setEndStakeNo(Object endStakeNo) {
                this.endStakeNo = endStakeNo;
            }

            public String getDeviceAlias() {
                return deviceAlias;
            }

            public void setDeviceAlias(String deviceAlias) {
                this.deviceAlias = deviceAlias;
            }

            public Object getDeviceConn() {
                return deviceConn;
            }

            public void setDeviceConn(Object deviceConn) {
                this.deviceConn = deviceConn;
            }

            public String getDirection() {
                return direction;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public Object getUpdateBy() {
                return updateBy;
            }

            public void setUpdateBy(Object updateBy) {
                this.updateBy = updateBy;
            }

            public String getFacilitiesName() {
                return facilitiesName;
            }

            public void setFacilitiesName(String facilitiesName) {
                this.facilitiesName = facilitiesName;
            }

            public String getWaysectionName() {
                return waysectionName;
            }

            public void setWaysectionName(String waysectionName) {
                this.waysectionName = waysectionName;
            }

            public String getDeviceTypeName() {
                return deviceTypeName;
            }

            public void setDeviceTypeName(String deviceTypeName) {
                this.deviceTypeName = deviceTypeName;
            }

            public String getSystemName() {
                return systemName;
            }

            public void setSystemName(String systemName) {
                this.systemName = systemName;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getCenterOffNo() {
                return centerOffNo;
            }

            public void setCenterOffNo(String centerOffNo) {
                this.centerOffNo = centerOffNo;
            }

            public String getManufacturer() {
                return manufacturer;
            }

            public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
            }

            public Object getManufacturerId() {
                return manufacturerId;
            }

            public void setManufacturerId(Object manufacturerId) {
                this.manufacturerId = manufacturerId;
            }

            public String getFacilitiesId() {
                return facilitiesId;
            }

            public void setFacilitiesId(String facilitiesId) {
                this.facilitiesId = facilitiesId;
            }

            public String getWaysectionId() {
                return waysectionId;
            }

            public void setWaysectionId(String waysectionId) {
                this.waysectionId = waysectionId;
            }

            public String getSystemId() {
                return systemId;
            }

            public void setSystemId(String systemId) {
                this.systemId = systemId;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public Object getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Object createTime) {
                this.createTime = createTime;
            }

            public Object getCreateBy() {
                return createBy;
            }

            public void setCreateBy(Object createBy) {
                this.createBy = createBy;
            }

            public String getOrgId() {
                return orgId;
            }

            public void setOrgId(String orgId) {
                this.orgId = orgId;
            }

            public String getOrgName() {
                return orgName;
            }

            public void setOrgName(String orgName) {
                this.orgName = orgName;
            }

            public String getOrgShortName() {
                return orgShortName;
            }

            public void setOrgShortName(String orgShortName) {
                this.orgShortName = orgShortName;
            }

            public Object getTollStationId() {
                return tollStationId;
            }

            public void setTollStationId(Object tollStationId) {
                this.tollStationId = tollStationId;
            }

            public Object getTollStationName() {
                return tollStationName;
            }

            public void setTollStationName(Object tollStationName) {
                this.tollStationName = tollStationName;
            }

            public Object getPic() {
                return pic;
            }

            public void setPic(Object pic) {
                this.pic = pic;
            }

            public Object getDeviceModel() {
                return deviceModel;
            }

            public void setDeviceModel(Object deviceModel) {
                this.deviceModel = deviceModel;
            }

            public Object getProtocolApplyScope() {
                return protocolApplyScope;
            }

            public void setProtocolApplyScope(Object protocolApplyScope) {
                this.protocolApplyScope = protocolApplyScope;
            }

            public Object getLaneId() {
                return laneId;
            }

            public void setLaneId(Object laneId) {
                this.laneId = laneId;
            }

            public Object getDataCollectType() {
                return dataCollectType;
            }

            public void setDataCollectType(Object dataCollectType) {
                this.dataCollectType = dataCollectType;
            }

            public int getLaneNum() {
                return laneNum;
            }

            public void setLaneNum(int laneNum) {
                this.laneNum = laneNum;
            }

            public String getSeriaNumber() {
                return seriaNumber;
            }

            public void setSeriaNumber(String seriaNumber) {
                this.seriaNumber = seriaNumber;
            }

            public Object getRemark() {
                return remark;
            }

            public void setRemark(Object remark) {
                this.remark = remark;
            }

            public Object getDeviceIdOld() {
                return deviceIdOld;
            }

            public void setDeviceIdOld(Object deviceIdOld) {
                this.deviceIdOld = deviceIdOld;
            }

            public Object getName() {
                return name;
            }

            public void setName(Object name) {
                this.name = name;
            }

            public Object getParentId() {
                return parentId;
            }

            public void setParentId(Object parentId) {
                this.parentId = parentId;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getIsFault() {
                return isFault;
            }

            public void setIsFault(String isFault) {
                this.isFault = isFault;
            }

            public Object getMac() {
                return mac;
            }

            public void setMac(Object mac) {
                this.mac = mac;
            }
        }
    }
}
