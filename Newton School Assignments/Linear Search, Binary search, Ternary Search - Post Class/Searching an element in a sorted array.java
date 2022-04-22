static int isPresent(long arr[], int n, long k)
{
	    // Your code here
        int left = 0;
        int right = n-1;
        int res = -1;
        while( left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == k){
                res = 1;
                break;
            }else if(arr[mid] < k){
                left = mid +1;
            }else{
                right = mid-1;
            }
              
        }
        return res;
}