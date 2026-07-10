class Solution {
    public int[] sortArray(int[] nums) {
       mergeSort(nums , 0 , nums.length - 1) ;
       return nums;
    }

    public void mergeSort(int[] nums , int l , int r){
        if(l >= r) return ;
        int m = (l + r)/2;
        mergeSort(nums , l , m);
        mergeSort( nums , m+1 , r);
        merge(nums , l , m , r);
    }

    public void merge(int[] nums , int l , int  m,int r){
        List<Integer> list = new ArrayList<>();
        int i = l;
        int j = m+1;
        while(i <= m && j <= r){
            if(nums[i] >= nums[j]){
                list.add(nums[j]);
                j++;
            }
            else{
                list.add(nums[i]);
                i++;
            }
        }

        while(j <= r){
            list.add(nums[j]);
            j++;
        }

        while( i <= m){
            list.add(nums[i]);
            i++;
        }

        for(int k = l ; k <= r; k++ ){
            nums[k] = list.get(k - l);
        }

        
        
    }
}