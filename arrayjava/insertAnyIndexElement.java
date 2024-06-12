import java.util.Arrays;;
public class insertAnyIndexElement {
    static void insertElement(int arr[],int n,int element,int position) {
        for(int i=n-1;i>=position;i--){
            arr[i+1]=arr[i];
        arr[position]=element;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        arr[5] = 16;
        arr[6] = 17;
        int n=7;
        int element=10;
        int position=2;
        insertElement(arr,n,element,position);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


// input--> {11,12,13,14,15,16}
//output--> {11,12,10,13,14,15,16}