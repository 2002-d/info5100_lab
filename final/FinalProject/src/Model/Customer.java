package Model;

import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author yashu
 */
public class Customer {
  private int Id;
  private String fullname;
  private String appointType;
  private String gender;
  private String age;
  private ImageIcon profilePicture;
  private String phone;
  private String email;
  private String carmake;
  private String carmodel;
  private Date appointdate;
  private int makeyear;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }


    public String getAppointType() {
        return appointType;
    }

    public void setAppointType(String appointType) {
        this.appointType = appointType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarmake() {
        return carmake;
    }

    public void setCarmake(String carmake) {
        this.carmake = carmake;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public Date getappointdate() {
        return appointdate;
    }

    public void setappointdate(Date date) {
        this.appointdate = date;
    }

   
public int getMakeyear() {
    return makeyear;
}

public void setMakeyear(int makeyear) {
    this.makeyear = makeyear;
}

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getAppointdate() {
        return appointdate;
    }

    public void setAppointdate(Date appointdate) {
        this.appointdate = appointdate;
    }

    public ImageIcon getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ImageIcon profilePicture) {
        this.profilePicture = profilePicture;
    
    }
   

    

}