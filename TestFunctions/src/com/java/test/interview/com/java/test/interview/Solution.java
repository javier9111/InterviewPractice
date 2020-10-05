package com.java.test.interview.com.java.test.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(cin.readLine());

        for (int T = Integer.parseInt(str.nextToken()); T > 0; T--) {
            str = new StringTokenizer(cin.readLine());
            int n = Integer.parseInt(str.nextToken());
            int k = Integer.parseInt(str.nextToken());
            int mod[] = new int[k];
            mod[0]++;
            int sum = 0;
            str = new StringTokenizer(cin.readLine());
            for (int i = 1; i <= n; i++) {
                int tmp = Integer.parseInt(str.nextToken());
                sum = (sum + tmp) % k;
                mod[sum]++;
            }

            long res = 0;
            for (int i = 0; i < k; i++) {
                res += 1L * mod[i] * (mod[i] - 1) / 2;
            }

            System.out.println(res);
        }

        cin.close();
    }

    static class Pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<Pair<U, V>> {
        final U _1;
        final V _2;

        private Pair(U key, V val) {
            this._1 = key;
            this._2 = val;
        }

        public static <U extends Comparable<U>, V extends Comparable<V>> Pair<U, V> instanceOf(U _1, V _2) {
            return new Pair<U, V>(_1, _2);
        }

        @Override
        public String toString() {
            return _1 + " " + _2;
        }

        @Override
        public int hashCode() {
            int res = 17;
            res = res * 31 + _1.hashCode();
            res = res * 31 + _2.hashCode();
            return res;
        }

        @Override
        public int compareTo(Pair<U, V> that) {
            int res = this._1.compareTo(that._1);
            if (res < 0 || res > 0)
                return res;
            else
                return this._2.compareTo(that._2);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!(obj instanceof Pair))
                return false;
            Pair<?, ?> that = (Pair<?, ?>) obj;
            return _1.equals(that._1) && _2.equals(that._2);
        }
    }

    private static boolean DEBUG_ON_FLAG = false;

    @SuppressWarnings("unused")
    private static void tiaoOn() {
        DEBUG_ON_FLAG = true;
    }

    @SuppressWarnings("unused")
    private static void tiaoOff() {
        DEBUG_ON_FLAG = false;
    }

    @SuppressWarnings("unused")
    private static void tiao(String format, Object... args) {
        if (DEBUG_ON_FLAG)
            System.err.println(String.format(format, args));
    }

    @SuppressWarnings("unused")
    private static void tiaon(String format, Object... args) {
        if (DEBUG_ON_FLAG)
            System.err.print(String.format(format, args));
    }
}