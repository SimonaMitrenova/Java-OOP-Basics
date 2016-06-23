package com.company.immutableList;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutableListMain {
    public static void main(String[] args) throws IOException {
        Field[] fields = ImmutableList.class.getDeclaredFields();
        if (fields.length < 1) {
            throw new ClassFormatException();
        } else {
            System.out.println(fields.length);
        }

        Method[] methods = ImmutableList.class.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method.getReturnType().getName());
//            System.out.println(method.getReturnType().getSimpleName());
//        }
        List<Method> methodsReturnTypes = Arrays.stream(methods).filter(m -> {
            if (!m.getReturnType().getSimpleName().equalsIgnoreCase("ImmutableList")) {
                return false;
            }

            return true;
        }).collect(Collectors.toList());

        if (methodsReturnTypes.size() < 1) {
            throw new ClassFormatException();
        }
        System.out.println(5);
    }
}
