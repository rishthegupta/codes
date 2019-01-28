#include<stdio.h>
#include<math.h>
int main(){
    int n,x;scanf("%d",&n);
    if(n%2==0)
    {
        int e=n/2;
        x=pow(3,e-1);
    }
    else
    {
        int e=(n/2)+1;
        x=pow(2,e-1);
    }
    printf("%d",x);
}