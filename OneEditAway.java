package com.example.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class OrderServiceApplication {

    public static void main(String[] args) {

        String a = "pale";
        String b = "ple";
        //edge case checks
        int m = a.length();
        int n = b.length();
        int d =  Math.abs( a.length() -b.length() );

int i=0,j=0;
int count=0;
        if(d>1) System.out.println("no");
        else{

            while(i<m && j<n){
                if(a.charAt(i)!=b.charAt(j)){
                    if(count==1){
                        count++;
                        break;
                    }
                    if(m>n){
                        i++;
                    } else if (n>m) {
                        j++;
                    }else {
                        i++;
                        j++;
                    }
                }else {
                    i++;
                    j++;
                }
            }
            if(m<n || n<m){
                count++;
            }
        }
        String s = count == 1 ? "okay" : "not okay";
        System.out.println(s);
//        Map<Character,Integer> map= new HashMap<>();
//        Map<Character,Integer> variableStr = new HashMap<>();
//        for(int i =0; i< a.length();i++){
//            if(map.get(a.charAt(i))==null){
//                map.put(a.charAt(i),1);
//            }else {
//                int integer = map.get(a.charAt(i));
//                map.put(a.charAt(i),++integer);
//            }
//
//            }
//        for(int i =0; i< b.length();i++){
//            if(variableStr.get(b.charAt(i))==null){
//                variableStr.put(b.charAt(i),1);
//            }else {
//                int integer = map.get(b.charAt(i));
//                variableStr.put(b.charAt(i),++integer);
//            }
//
//        }
//        int edit = 0;
//        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
//            if(variableStr.get(characterIntegerEntry.getKey()) == null ){
//                if(edit==0){
////                    System.out.println("called");
//                    edit++;
//                }else {
//                    edit++;
//                    break;
//                }
//            }else if(variableStr.get(characterIntegerEntry.getKey()) != null){
//                Integer integer = variableStr.get(characterIntegerEntry.getKey());
//                Integer integer2 = characterIntegerEntry.getValue();
//                int diff = integer > integer2 ? integer - integer2 : integer2-integer;
//                if(diff>=1){
////                    System.out.println("called second");
//                    if(edit==0){
//                        edit++;
//                    }else {
//                        edit++;
//                        break;
//                    }
//                }
//            }
//
//        }
//        if(edit>1){
//            System.out.println("no");
//        }
//        System.out.println(map);
//        System.out.println(variableStr);
    }
    }
//    public static void main(String[] args) {}
//    }
