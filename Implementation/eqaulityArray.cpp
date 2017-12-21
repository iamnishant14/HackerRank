#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n,i,count=0,sum=0;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int array[200]={0};
    for(i=0;i<n;i++)
        {
        array[a[i]]++;
    }
    for(i=0;i<200;i++)
        {
           if(array[i]>count)
               count=array[i];
        sum=sum+array[i];
    }
    printf("%d",sum-count);
    return 0;
}