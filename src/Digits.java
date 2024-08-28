import java.util.*;

public class Digits {
    private ArrayList<Integer> digitList;
    public Digits (int num) {
        if (num < 0) {
            throw new IllegalArgumentException("The number passed to the constructor (" + num + ") cannot be negative!");
        }

        digitList = new ArrayList<>();
        String n = num + "";

        for (int i = 0; i < n.length(); i++) {
            digitList.add(Integer.parseInt(String.valueOf(n.charAt(i))));
        }
    }
    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size() - 1; i++) {
            if (digitList.get(i) >= digitList.get(i + 1)) return false;
        }

        return true;
    }
    public ArrayList<Integer> getDigitList() {
        return digitList;
    }
}
