#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
     int n; 
    scanf("%d",&n);
    int *types = malloc(sizeof(int) * n);
    for(int types_i = 0; types_i < n; types_i++){
       scanf("%d",&types[types_i]);
    }
    // your code goes here
    int id[]={0,0,0,0,0};
    for(int i = 0; i<n; i++)
        {
            id[types[i]-1]++;
        }
    int max=0,type= 0;
    for(int j=0; j<5; j++)
        {
        if(id[j]>id[max])
            {
            max=j;
                    }
        
    }
    printf("%d",max+1);
  
    // your code goes here
    return 0;
}
