package com.wangpeng.learn.sort.choose;

import java.util.Arrays;

/**
 * 选择排序
 * 思路：首先第一次循环数组，找出最小的数或下标，跟第一个数交换位置，然后继续第二次循环数组，找出第二小的数跟第二个数交换位置，依次类推
 */
public class ChooseSort {

    private int[] arr;

    private String sortType = "asc";

    public ChooseSort(int[] arr,String sortType){
        this.arr = arr;
        this.sortType = sortType;
    }

    public void sort(){
        System.out.println("起始数组为："+this.toString());
        //外层循环：控制交换
        for(int i=0;i<arr.length-1;i++){
            int index = -1;
            int minNum = Integer.MAX_VALUE;
            //内层循环：选择当前数组中最小的数
            for(int j=i;j<arr.length;j++){
                if(arr[j] < minNum){
                    minNum = arr[j];
                    index = j;
                }
            }
            System.out.println("第"+i+"次挑选最少的数："+minNum);
            //内层循环中选出的最小数跟外层循环下标对比，用于交换位置
            if(arr[index] < arr[i]){
                int temp1 = arr[index];
                arr[index] = arr[i];
                arr[i] = temp1;
                System.out.println("本轮交换以后的数组为："+this.toString());
            }else{
                System.out.println("本轮不用置换");
            }
        }
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ChooseSort{" +
                "arr=" + Arrays.toString(arr) +
                ", sortType='" + sortType + '\'' +
                '}';
    }
}


