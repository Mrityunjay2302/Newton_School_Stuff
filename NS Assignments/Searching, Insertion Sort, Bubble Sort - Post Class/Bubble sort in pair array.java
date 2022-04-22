static Pair[] SortPair(Pair arr[], int n)  { 
    //enter your code here
    for(int i=0; i<n-1 ; i++){
       for(int j=0; j<n-1; j++){
           if(arr[j].x < arr[j+1].x){
               Pair temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
           }
           if(arr[j].x == arr[j+1].x){
               if(arr[j].y < arr[j+1].y){
                   Pair temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
   }
   return arr;
}