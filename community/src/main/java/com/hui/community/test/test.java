package com.hui.community.test;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/28
 */
public class test {
    public static void main(String[] args) {
        //分割点时需要转义\.
        String s= "sdhii.fvsdf.fsa";
        String[] split = s.split("\\.");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }
}
