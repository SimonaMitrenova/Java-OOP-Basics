package com.company.oldestFamilyMember;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> membersAge;

    public Family() {
        this.membersAge = new ArrayList<>();
    }
    public void addFamilyMember(Person person){
        this.membersAge.add(person);
    }
    public Person getOldestMember(){
        return this.membersAge.stream().sorted((n1, n2) -> Integer.compare(n2.getAge(), n1.getAge())).findFirst().get();
    }
}
