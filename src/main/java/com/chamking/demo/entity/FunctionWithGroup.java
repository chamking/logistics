package com.chamking.demo.entity;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/720:12
 * description:
 */
public class FunctionWithGroup {
    private  long id;
    private  long functionId;
    private  long groupId;

    @Override
    public String toString() {
        return "FunctionWithGroup{" +
                "id=" + id +
                ", functionId=" + functionId +
                ", groupId=" + groupId +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(long functionId) {
        this.functionId = functionId;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
