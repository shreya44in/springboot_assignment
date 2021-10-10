package com.infosys.assignment.manager;

import org.springframework.stereotype.Component;

@Component
public class WordManager {

    private void reverse(char [] chars, int start, int end) {
        while(start < end) {
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            ++start;
            --end;
        }
    }

    public String reverseWords(String words) {

        int start = 0;
        int end = 0;
        int n = words.length();

        char [] chars = words.toCharArray();

        while(start < n) {

            while(end < n && chars[end] == ' ')
                ++end;

            start = end;

            if(start == n)
                break;

            while(end < n && chars[end] != ' ')
                ++end;

            reverse(chars, start, end - 1);

            start = end;
        }

        return String.valueOf(chars);
    }
}
