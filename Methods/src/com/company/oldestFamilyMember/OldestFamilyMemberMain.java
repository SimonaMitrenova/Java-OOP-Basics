package com.company.oldestFamilyMember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class OldestFamilyMemberMain {
    public static void main(String[] args) throws IOException, NoSuchMethodException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Family family = new Family();
        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] params = reader.readLine().split("\\s+");
            String name = params[0];
            int age = Integer.valueOf(params[1]);
            family.addFamilyMember(new Person(name, age));
        }

        System.out.println(family.getOldestMember());

        Method getOldestMethod = Family.class.getMethod("getOldestMember");
        Method addMemberMethod = Family.class.getMethod("addFamilyMember", Person.class);
    }
}
