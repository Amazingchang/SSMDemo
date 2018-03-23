package me.changjie.entity;


import java.util.Date;

/**
 * Create by ChangJie on 2018/3/23
 */
public class UserInfo {

    private int id;

    private String userName;

    private String passsWord;

    private String photo;

    private String sex;

    private Date birth;

    private String email;

    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasssWord() {
        return passsWord;
    }

    public void setPasssWord(String passsWord) {
        this.passsWord = passsWord;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passsWord='" + passsWord + '\'' +
                ", photo='" + photo + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
