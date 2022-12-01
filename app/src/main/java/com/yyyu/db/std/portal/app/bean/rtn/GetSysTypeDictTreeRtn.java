package com.yyyu.db.std.portal.app.bean.rtn;

import java.util.List;

/**
 * 功能：获取系统类型字典树
 *
 * @author yyyu
 * @version 1.0
 * @date 2022-12-01
 */
public class GetSysTypeDictTreeRtn {

    private String code;
    private String msg;
    private Object exception;
    private List<DataBean> data;

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

    public Object getException() {
        return exception;
    }

    public void setException(Object exception) {
        this.exception = exception;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 107279AB-7807-411C-A3E7-DA7B768FD369
         * name : 隧道监控系统
         * shortName : 隧道监控系统
         * parentId : 0
         * nodeType : null
         * sort : 0
         * type : null
         * children : null
         */

        private String id;
        private String name;
        private String shortName;
        private String parentId;
        private Object nodeType;
        private int sort;
        private Object type;
        private Object children;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public Object getNodeType() {
            return nodeType;
        }

        public void setNodeType(Object nodeType) {
            this.nodeType = nodeType;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public Object getChildren() {
            return children;
        }

        public void setChildren(Object children) {
            this.children = children;
        }
    }
}
