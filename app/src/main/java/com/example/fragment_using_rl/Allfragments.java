package com.example.fragment_using_rl;

import android.os.Parcel;
import android.os.Parcelable;

public class Allfragments implements Parcelable {

    private String name;
    private String email;
    private String address;
    private String phoneno;
    private String healthName;
    private String bloodGroup;
    private String weight;
    private String contactno;
    private String employeename;
    private String companyname;
    private String salary;
    private String designation;

    public Allfragments() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getHealthName() {
        return healthName;
    }

    public void setHealthName(String healthName) {
        this.healthName = healthName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    protected Allfragments(Parcel in) {
        name = in.readString();
        email = in.readString();
        address = in.readString();
        phoneno = in.readString();
        healthName = in.readString();
        bloodGroup = in.readString();
        weight = in.readString();
        contactno = in.readString();
        employeename = in.readString();
        companyname = in.readString();
        salary = in.readString();
        designation = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(email);
        dest.writeString(address);
        dest.writeString(phoneno);
        dest.writeString(healthName);
        dest.writeString(bloodGroup);
        dest.writeString(weight);
        dest.writeString(contactno);
        dest.writeString(employeename);
        dest.writeString(companyname);
        dest.writeString(salary);
        dest.writeString(designation);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Allfragments> CREATOR = new Parcelable.Creator<Allfragments>() {
        @Override
        public Allfragments createFromParcel(Parcel in) {
            return new Allfragments(in);
        }

        @Override
        public Allfragments[] newArray(int size) {
            return new Allfragments[size];
        }
    };
}