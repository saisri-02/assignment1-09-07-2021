import java.util.*;
class Difference
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
int sum1=0,sum2=0,dif;
System.out.println("Enter number of rows : ");
int r=sc.nextInt();
System.out.println("Enter number of columns : ");
int c=sc.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter elements in array : ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
for(int i=0,j=0;i<r;i++,j++)
{
sum1+=a[i][j];
}
System.out.println("Sum of diagonal = "+sum1);
for(int i=0,j=c-1;i<r;i++,j--)
{
sum2+=a[i][j];
}
System.out.println("Sum of antidiagonal = "+sum2);
dif=sum1-sum2;
System.out.println("Difference = "+dif);
}
}