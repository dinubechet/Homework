package com.company;

public class ThirdExe {

        public static void main(){
            int i,num,sum;

            System.out.println("The perfect numbers between 1 and 1000 are");
            for(num=1;num<=1000;num++)
            {
                sum=0;
                for(i=1;i<num;i++)
                    if(num%i==0)
                        sum+=i;
                if(sum==num)
                    System.out.println(num+" ");
            }
        }
    }

