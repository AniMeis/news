package moe.meis.invitation.pojo;

import java.util.Date;

public class Invitation {
    private Integer id;

    private String title;

    private String summary;

    private String author;

    private Date careatedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getCareatedate() {
        return careatedate;
    }

    public void setCareatedate(Date careatedate) {
        this.careatedate = careatedate;
    }
}