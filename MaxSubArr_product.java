class Sol{
    public int MaxProduct(int arr[])
    {   int res=0;
        int maxi=0;
        if(arr.length==0) {return res;}  
        for(int i=0;i<arr.length;i++)
        {
            int pro=1;
            for(int j=i;j<arr.length;j++)
            {
                pro *=arr[j];
                maxi =Math.max(maxi,pro);
                if(pro>maxi)
                {
                    maxi=pro;
                }
            }
           
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        Sol ob=new Sol();
        int res =ob.MaxProduct(arr);
        System.out.println(res);
    }
}
