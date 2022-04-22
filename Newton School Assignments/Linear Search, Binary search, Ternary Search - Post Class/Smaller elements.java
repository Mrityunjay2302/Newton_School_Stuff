static int smallerElements(int a[], int n, int k){
    //Enter your code here
    
    int low = 0;
    int high = n-1;
    int index = -1;
    while(low <= high)
    {
        int mid = low + (high-low)/2;
        if(a[mid] == k)
        {
            index = mid;
            low = mid + 1;
        }
        else if(a[mid] > k)
        {
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
            index = mid;
        }
    }
    return (index+1);
}