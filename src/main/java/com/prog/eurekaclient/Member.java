package com.prog.eurekaclient;

import java.util.HashMap;
import java.util.Map;

public class  Member {

    private int memberId;
    private String firstName;


    public Member() {
    }

    private String lastName;
    private int age;

    public Member(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    public Member(int memberId, String firstName, String lastName, int age) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public void addMember(String firstName, String lastName, int age){

        Member member = new Member(firstName, lastName, age);

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    @Override
    public String toString() {
        String info = String.format("memberId = %d, firstName = %s, lastName = %s, age = %d", memberId, firstName, lastName
                , age);
        return info;
    }
}
