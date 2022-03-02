package com.lab1;

import java.util.HashSet;
import java.util.Set;

public class Q1 {
    public static void main(String[] args) {
      String[] words =  {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
      String chars =  "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < chars.length() ; i++) {
            set.add(chars.charAt(i));
        }
        System.out.println(set);
        int count = 0;

        for (int i = 0; i < words.length ; i++) {
            int temp = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if(set.contains(words[i].charAt(j))){
                    temp++;
                }
            }
            if(temp == words[i].length()){
                count += temp;
            }
        }

        return count;
    }
}
