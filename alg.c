#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
   long int b[20],i,j,n,temp1,c;
   long int sum=0;
   clrscr();
   scanf("%ld",&n);
for(i=0;i<n;i++)
{
  scanf("%d",&b[i]);
}
for(i=0;i<n;i++)
{
 for(j=i+1;j<n;j++)
 {
  if(b[j]>b[i])
 {
  temp1=b[i];
  b[i]=b[j];
  b[j]=temp1;
 }
 }
}
for(i=0;i<n-1;i++)
{
  temp1=a[i+1];
  c=0;
  while(temp1!=0)
  {
    temp1=temp1/10;
    c++;
  }
  sum=(sum*pow(10,c))+a[i+1];
}
printf("\n%ld",sum);
getch();
}