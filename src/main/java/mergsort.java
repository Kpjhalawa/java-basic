public class mergsort {

    public static void main(String[] args) {

     int A[]={ 2,6,4,12,8,13,11,3,1};

     int s = 0;
     int e = A.length-1;
     mergalgo(A,s,e);

     for(int i=0;i<A.length;i++){

         System.out.print(A[i]+" ");
     }

    }
    public static void mergalgo(int A[], int s, int e){

        if(s==e){
            return;
        }
        int mid=(s+e)/2;
        mergalgo(A,s,mid);
        mergalgo(A,mid+1,e);
        merg(A,s,mid,e);
    }

     public static int[] merg(int[] A, int s, int m, int e){

        int i = s;
        int j = m+1;
      int temp[] = new int[e-s+1];

       int k =0;

        while(i<=m  &&  j<=e){
            if(A[i]<A[j]){
                temp[k]=A[i];

                i++; k++;
            }
            else{
               temp[k]=A[j];
                j++;k++;
            }
        }
        while(i<=m){
            temp[k]=A[i];
            i++;k++;
        }
        while(j<=e){
            temp[k]=A[j];
            k++;j++;
        }
        k=0; int p=s;
        while(k<temp.length){
            A[p] = temp[k];
            k++;p++;
        }
        return A;
    }



}
