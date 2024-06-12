public class deleteElement {
    static int findElement(int arr[],int n,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    static int delElement(int arr[],int n,int element){
        int pos=findElement(arr,n,element);
        for(int i=pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        return n-1;
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int n = arr.length;
        int deleteElement = 30;
        n=delElement(arr,n,deleteElement);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// input-->{10,20,30,40,50,60,70}
//output-->{10,20,40,50,60,70}