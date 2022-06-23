package src.main.java.rept1l0id;

class Solution {
    public int romanToInt(String s) {
        int res = 0;
        String s1 = " " + s;
        char[] roman = s1.toCharArray();
        for(int i = 1; i < roman.length; i++){
            if(roman[i] == 'I') {
                res += 1;
            }
            if(roman[i] == 'V') {
                res += 5;
                if(roman[i - 1] == 'I') res -= 2;
            }
            if(roman[i] == 'X') {
                res += 10;
                if(roman[i - 1] == 'I') res -= 2;
            }
            if(roman[i] == 'L') {
                res += 50;
                if(roman[i - 1] == 'X') res -= 20;
            }
            if(roman[i] == 'C') {
                res += 100;
                if(roman[i - 1] == 'X') res -= 20;
            }
            if(roman[i] == 'D') {
                res += 500;
                if(roman[i - 1] == 'C') res -= 200;
            }
            if(roman[i] == 'M') {
                res += 1000;
                if(roman[i - 1] == 'C') res -= 200;
            }
        }
        return res;
    }
}