class Ray2
{
public static void main(String[]args)
{

// Frequency of each element in a given array
    int[] a = {1,2,3,4,5,6,1,1,5,2,4,6,3,3}; 
  int[] freq  = new int[a.length]; 

    for(int j = 0;j<a.length;j++)
    {
    int no = a[j]; //20
    int count = 1; 
    for(int i=j+1; i<a.length; i++)
    {
      if(no==a[i]) 
      {
        count++;
        freq[i] = -1; 
      }
    }
   // if(freq[j]!=-1)
      freq[j] = count; 
    //System.out.println(a[j] + " count is " + count); 
  
    
  for(int i=0;i<a.length;i++)
  {
    if(freq[i]>0)
    System.out.println(a[i] + " Occurs " + freq[i] + " times ");
  }
  }
}
}