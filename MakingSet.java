import java.util.*;
class MakingSetLogic{
   private Scanner sc = new Scanner(System.in);
   private int[] arr;
   private int size;
   public void arrayCreation()
   {
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        arr =new int[size];
   }
   public void userInputArrayElements()
    {
        System.out.println("Enter elements of the array");			
        for(int i = 0; i< arr.length; i++)    
        arr[i] = sc.nextInt();   
    }
    public void  sameValueRepeatedly(){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
        System.out.print(set);
        if(set.size()==1)
            System.out.println("same element is present repeatedly");
            
    }	 
    
}
class MakingSetMain{
    public static void main(String args[])
    {
        MakingSetLogic obj = new MakingSetLogic();
        obj.arrayCreation();
        obj.userInputArrayElements();
        obj.sameValueRepeatedly();
    }
}