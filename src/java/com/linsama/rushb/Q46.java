package com.linsama.rushb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q46 {
    private List<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        getSubLists(new ArrayList<Integer>(), numList);
        return ret;
    }

    private void getSubLists(List<Integer> first, List<Integer> second) {
        if (second.size() == 1) {
            first.addAll(second);
            ret.add(first);
        }
        for (Integer num : second) {
            List<Integer> tmpFirst = new ArrayList<>(first);
            tmpFirst.add(num);
            List<Integer> tmpSecond = new ArrayList<>(second);
            tmpSecond.remove(num);
            getSubLists(tmpFirst, tmpSecond);
        }
    }

    public static void main(String[] args) {
        new Q46().permute(new int[] {1, 2, 3});
    }
}
