class searchElement {

    static int findelement(int arr[],int n,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,6,2,1,8,7};
        int n = arr.length;
        int key = 2;
        int postion = findelement(arr,n,key)+1;
        if(postion==-1){
            System.out.println("No element");
        }
        else{
            System.out.println("Found element position: " + postion);
        }
    }
}