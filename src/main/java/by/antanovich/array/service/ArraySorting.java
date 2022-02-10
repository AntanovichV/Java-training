package by.antanovich.array.service;

import by.antanovich.array.entity.CustomArray;

public class ArraySorting {
    public void bubbleSort(CustomArray customArray) {
        int[] inputArr = customArray.getArray();
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < inputArr.length - 1; i++) {
                if (inputArr[i] > inputArr[i + 1]) {
                    temp = inputArr[i];
                    inputArr[i] = inputArr[i + 1];
                    inputArr[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    public void gnomeSort(CustomArray customArray, int n) {
        int[] inputArr = customArray.getArray();
        int index = 0;
        while (index < n) {
            if (index == 0)
                index++;
            if (inputArr[index] >= inputArr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = inputArr[index];
                inputArr[index] = inputArr[index - 1];
                inputArr[index - 1] = temp;
                index--;
            }
        }
    }

    public void selectionSort(CustomArray customArray) {
        int[] inputArr = customArray.getArray();
        int n = inputArr.length;
        for (int i = 1; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (inputArr[j] < inputArr[min_idx])
                    min_idx = j;
            int temp = inputArr[min_idx];
            inputArr[min_idx] = inputArr[i];
            inputArr[i] = temp;
        }
    }
}
