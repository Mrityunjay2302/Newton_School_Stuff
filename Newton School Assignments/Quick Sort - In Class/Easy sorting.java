// You need to return the sorted String array
// Backend code will print the result
// arr: Arrays of 5 strings 
function easySorting(arr)
  {
    for(let i = 1; i < 5; i++)
    {
        let str = arr[i];
        let j = i-1;
        while(j >= 0 && (arr[j].toString().localeCompare(str)) > 0 )
        {
          arr[j+1] = arr[j];
          j--;
        }
        arr[j+1] = str;
    }
    return arr;
  }