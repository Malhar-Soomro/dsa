package com.DataStructures_And_Algorithms.HanoiTower;

// Java recursive program to solve tower of hanoi puzzle

class HanoiAlgo {
    // Java recursive function to solve tower of hanoi puzzle
    public void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}

    // Driver method
    public class HanoiTower{
    public static void main(String[] args)
    {
        HanoiAlgo algo = new HanoiAlgo();

        int n = 3; // Number of disks
        algo.doTowers(n, 'A', 'B','C');

    // A, B and C are names of rods
    }
}
