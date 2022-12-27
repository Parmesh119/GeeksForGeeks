class Solutions{
    public static void main(static[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            n=input.nextInt();
           l.add(n);
        }
      Collections.sort(l);
      System.out.println(l);
    }
}
