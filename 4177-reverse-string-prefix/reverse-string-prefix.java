class Solution {
    public String reversePrefix(String s, int k) {
      String p=s.substring(0,k);
      char arr[]=p.toCharArray();
      int l=0;
      int r=arr.length-1;
      while(l<=r)
      {
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
      } 
      String str=new String(arr);
      return str+s.substring(k);

    }
}