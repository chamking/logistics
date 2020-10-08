package com.chamking.demo.entity;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/720:12
 * description:
 */
public class UserWithGroup {
    private long id;
    private long groupId;
    private String userId;

    @Override
    public String toString() {
        return "UserWithGroup{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", userId='" + userId + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
