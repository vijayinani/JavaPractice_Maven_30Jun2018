package com.inani.vijay.leetcode;

import java.util.TreeMap;

class SnapshotArray {

    /*int snapCount = 0;
    Map<Integer, int[]> snaps;
    int[] snapshotArray;

    public SnapshotArray(int length) {
        snapshotArray = new int[length];
        snaps = new HashMap<>();
    }

    public void set(int index, int val) {
        snapshotArray[index] = val;
    }

    public int snap() {
        int[] currentSnap = new int[snapshotArray.length];
        int i = 0;
        for (int val : snapshotArray) {
            currentSnap[i] = val;
            i++;
        }
        snaps.put(snapCount, currentSnap);
        snapCount++;
        return snapCount - 1;
    }

    public int get(int index, int snap_id) {
        return snaps.get(snap_id)[index];
    }*/

    TreeMap<Integer, Integer>[] snapshotArray;
    int snapId;

    public SnapshotArray(int length) {
        snapshotArray = new TreeMap[length];
        for (int i = 0; i < length; i++) {
            snapshotArray[i] = new TreeMap<>();
            snapshotArray[i].put(0,0);
        }
        snapId = 0;
    }

    public void set(int index, int val) {
        snapshotArray[index].put(snapId, val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {

/*        if (snap_id == -1) {
            return 0;
        }

        if (snapshotArray[index].containsKey(snap_id)) {
            return snapshotArray[index].get(snap_id);
        } else {
            return get(index, --snap_id);
        }*/

        return snapshotArray[index].floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */


