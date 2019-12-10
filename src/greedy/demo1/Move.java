package greedy.demo1;

/**
 * 贪心算法:
 *      纸牌移动有N堆纸牌，编号分别为1，2，…，n。每堆上有若干张,但纸牌总数必为n的倍数.
 * 可以在任一堆上取若干张纸牌,然后移动。移牌的规则为：在编号为1上取的纸牌，只能移到编号为2
 * 的堆上；在编号为n的堆上取的纸牌，只能移到编号为n-1的堆上；其他堆上取的纸牌，可以移到相邻
 * 左边或右边的堆上。现在要求找出一种移动方法，用最少的移动次数使每堆上纸牌数都一样多。例如：
 * n=4，4堆纸牌分别为：
 *          ① 9 ② 8 ③ 17 ④ 6 移动三次可以达到目的：从③取4张牌放到④ 再从③区3张
 *          放到②然后从②去1张放到①。
 */
public class Move {


    public static void main(String[] args) {
        int [] arr = {9,5,2,6,23};//{9,5,2,20,9},{9,5,13,9,9},{9,9,9,9,9}
        int n =moveCard(arr,arr.length);
        System.out.println(n);
    }
    private static int moveCard(int [] arr,int length){
        int index = 0;
        for (int a: arr){
            index = index+a;
        }
        index = index/length;  //这一定除得尽
        int left = 0; //左下标
        int right = length-1; //右下标
        int n = 0; //记录移动次数
        while (left<right){
            while (index<arr[left]){
                arr[left+1] = arr[left+1]+arr[left]-index;
                arr[left] = index;
                left++;
                n++;
            }
//          while (index>arr[left]){
// loop:               for (int i = left;i<right;i++){
//                    //arr[left] = arr[i+1]+arr[left];//可能越界
//                    if (arr[left]+arr[i+1]>index){
//                        arr[i+1] = arr[i+1] - (index-arr[left]);
//                        arr[left] = index;
//                        n++;
//                        left++;
//                        break loop;
//                    }
//                    if (arr[left]+arr[i+1]<index){
//                        arr[left] = arr[i+1] +arr[left];
//                        arr[i+1] = 0;
//                        n++;
//                    }
//                }
//            }
            while (index>arr[left]){
                arr[left+1]= arr[left+1]-(index-arr[left]);
                arr[left]=index;
                n++;
                left++;
            }
            if (arr[left]==index){
                left++;
            }
        }
        return n;
    }
}
