package by.antanovich.array.service;

import by.antanovich.array.entity.CustomArray;

public class ArrayCalculation {
    public int getMax(CustomArray customArray) {
        int[] inputArr = customArray.getArray();
        int max = inputArr[0];
        for (int j : inputArr) {
            if (j <= max) {
                max = j;
            }
        }
        return max;
    }

    public int getMin(CustomArray customArray) {
        int[] inputArr = customArray.getArray();
        int min = inputArr[0];
        for (int j : inputArr) {
            if (j <= min) {
                min = j;
            }
        }
        return min;
    }

    public int[] replaceOdd(CustomArray customArray) {
        int[] inputArr = customArray.getArray();
        for (int j : inputArr) {
            if (j % 2 == 1) {
                j = 0;
            }
        }
        return inputArr;
    }

    public int getSum(CustomArray customArray) {
        int[] inputArr = customArray.getArray();
        int sum = 0;
        for (int j : inputArr) {
            sum += j;
        }
        return sum;
    }


    public int getAvg(CustomArray customArray) {
        int[] inputArr = customArray.getArray();
        int sum = 0;
        for (int j : inputArr) {
            sum += j;
        }
        return sum/inputArr.length;
    }

    public int countPositive(CustomArray customArray) {
        int[] inputArr = customArray.getArray();
        int pos = 0;
        for (int j : inputArr) {
            if(j > 0) {
                pos++;
            }
        }
        return pos;
    }

    public int countNegative(CustomArray customArray) {
        int[] inputArr = customArray.getArray();
        int neg = 0;
        for (int j : inputArr) {
            if(j > 0) {
                neg++;
            }
        }
        return neg;
    }
}
