package initials;

import java.lang.reflect.Array;

public class returner {
//    public static void main(String[] args) {
//       int [] l1={7,0,3};
//       int [] l2={4,5,8};
//      int length;
//        if (l1.length>l2.length){
//            length=l1.length;
//      }
//      else length=l2.length;
//        int []num=new int[length+10];
//        System.out.println(length);
//        for (int i=0;i<length;i++){
//            num[i] = l1[i] + l2[i];
//        }
//        for (int i=0;i<length;i++){
//            System.out.print(num[i] +"  ");
//        }

    public static void main(String[] args) {
        int [] l1={7,0,3,5,5,6g};
        int [] l2={4,5,8,5,5,8};
        int[]array=new int[l1.length+1];
        int i;
        float j= (float) 0.1;
        float num=0;
        float  num2=0;
        float num3;
        int length=l1.length+1;
        for (int k=0;k<l1.length;k++)
        {
            i=l1[k];
            j=j*10;
            num=  (j*i+num);
        }
        j=(float) 0.1;
        for (int  k=0;k<l2.length;k++)
        {
            i=l2[k];
            j=j*10;
            num2= (int) (j*i+num2);
        }
        num3=num+num2;
        i=0;
        int b,g;
        for (i=0;i<length;i++)
        {
            b= (int) (num3%10);
            array[i]=b;
            num3=num3-b;
            if (num3==0)
                break;
            num3=num3/10;
        }

        for (i=0;i<length;i++)
        {
            System.out.print(array[i]+"  ");
        }
    }
}

