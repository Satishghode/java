class demo1
    {
        public static void demo(String[] args) {
            int i,n;
            n=args.length;
            int a[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(args[i]);

            }
            for( int j=0;j<n;j++)
                System.out.println(a[i]);
           }
    }