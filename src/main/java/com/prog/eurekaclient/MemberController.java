package com.prog.eurekaclient;

import java.util.ArrayList;

public class MemberController {

    private Storage storage;

    public MemberController(Storage storage){


        this.storage = storage;
    }

    public void addMember(Member member) {storage.addStorageMember(member);}

    public ArrayList listMembers()
    {
        ArrayList<Member> members = storage.getStorageMember();
        return members;
    }
}
