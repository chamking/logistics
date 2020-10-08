package com.chamking.demo.entity;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/720:11
 * description:
 */
public class Function {
    private long id;
    private String pageName;
    private String pageFunction;

    @Override
    public String toString() {
        return "Function{" +
                "id=" + id +
                ", pageName='" + pageName + '\'' +
                ", pageFunction='" + pageFunction + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageFunction() {
        return pageFunction;
    }

    public void setPageFunction(String pageFunction) {
        this.pageFunction = pageFunction;
    }
}
