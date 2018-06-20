package chap9.hr;


import java.util.Scanner;

public class E13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int rows=input.nextInt();
        int columns=input.nextInt();
        double[][] b=new double[rows][columns];
        System.out.println("Enter the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                b[i][j]=input.nextDouble();
            }
        }
        Location ddd=Location.locateLargest(b);
        System.out.println("The location of the largest element is "+
                ddd.maxValue+ " at ("+ddd.row+","+ddd.column+")");
    }
}

class Location{
    public int row;
    public int column;
    public double maxValue;

    public Location(int ro,int co,double ma){
        row=ro;
        column=co;
        maxValue=ma;
    }

    public static Location locateLargest (double[][] a){
        double maxNumber=0;
        int rowId=0;
        int columnId=0;
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if (a[i][j]>maxNumber){
                    maxNumber=a[i][j];
                    rowId=i;
                    columnId=j;
                }
            }
        }
        return new Location(rowId,columnId,maxNumber);
    }
}