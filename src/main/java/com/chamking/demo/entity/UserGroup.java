package com.chamking.demo.entity;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/720:12
 * description:
 */
public class UserGroup {
    private  long id;
    private  String description;
    private String groupName;

    @Override
    public String toString() {
        return "UserGroup{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
