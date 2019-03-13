package com.prog.eurekaclient;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import javassist.compiler.ast.InstanceOfExpr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

//OK HTTP
//elastic bean till jar fil
//mv package i direct


@RestController
public class ClientController {


    private Storage storage;
    private RestTemplate restTemplate;
    private MemberController memberController;
    Map<Integer, Member> membStores = new HashMap<Integer, Member>();


    public ClientController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
        storage = new Storage();
        memberController = new MemberController(storage);
    }

    @GetMapping("/members")
    public ArrayList members() {

        return memberController.listMembers();
    }

    @PostMapping("/members")
    public void addMember (@RequestBody Member member){

        memberController.addMember(member);
        Random r = new Random();
        member.setMemberId(r.nextInt(1000000));
//        membStores.put(member.getMemberId(), member);
//        System.out.println("Member Stores after POST:");
//        membStores.forEach((id, memb) -> System.out.println(memb.toString()));

    }



    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/clients")
    public List<InstanceInfo> clients(){

        Application application = eurekaClient.getApplication("client1");
        return application.getInstances();
    }

}
