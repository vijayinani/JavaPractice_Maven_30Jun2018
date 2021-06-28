package com.inani.vijay.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _929UniqueEmailAddresses {
    public static void main(String[] args) {
        System.out.println(new _929UniqueEmailAddresses().numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}));
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            String[] emailSplit = email.split("@");
            String localName = emailSplit[0].replace(".", "");
            localName = localName.indexOf("+") > 0 ? localName.replace(localName, localName.substring(0, localName.indexOf("+"))) : localName;
            uniqueEmails.add(localName + "@" + emailSplit[1]);
        }
        return uniqueEmails.size();
    }
}
