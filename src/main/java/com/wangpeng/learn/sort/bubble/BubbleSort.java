package com.wangpeng.learn.sort.bubble;
/**
 * 冒泡排序
 *
 * 算法原理：将相邻的两个数对比，看是否需要互换位置，从而将最大或最小的数冒泡到最左或最右
 */
public class BubbleSort {

    public int[] sourceArr;

    public String sortType;

    public BubbleSort(int[] arr,String sortType){
        this.sourceArr = arr;
        this.sortType = sortType;
    }

    public int[] sort(){

        if(sourceArr.length==0){
            return null;
        }

        for(int i=0;i<sourceArr.length-1;i++){

            if(sortType.equals("asc")) {
                for (int j = 0; j < sourceArr.length - i - 1; j++) {
                    if (sourceArr[j] > sourceArr[j + 1]) {
                        int tmp = sourceArr[j];
                        sourceArr[j] = sourceArr[j + 1];
                        sourceArr[j + 1] = tmp;
                    }
                }
            }else{
                for (int j = sourceArr.length-1; j > i; j--) {
                    if (sourceArr[j] > sourceArr[j - 1]) {
                        int tmp = sourceArr[j];
                        sourceArr[j] = sourceArr[j - 1];
                        sourceArr[j - 1] = tmp;
                    }
                }
            }
        }
        return sourceArr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int x : this.sourceArr){
           sb.append(x).append("、");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        BubbleSort bb = new BubbleSort(new int[]{4,23,443,232,11,67888,88888},"desc");
        bb.sort();
        System.out.println(bb.toString());
    }
}
