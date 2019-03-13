package com.prog.eurekaclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage implements StorageData {

    private ArrayList<Member> members;

    public Storage(){

        members = new ArrayList<>();

    }
    @Override
    public void addStorageMember(Member member){ members.add(member);}
    @Override
    public ArrayList getStorageMember(){ return members;}
}
