#include <stdio.h>

int main() {
    int i,n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int max = arr[0];
    int min = arr[0];
    for(i =0;i<n;i++){
        if(max<arr[i]){
            arr[i] = max;
        }
        if(min>arr[i]){
            arr[i]=min;
        }
    }
    printf("%d",max);
    printf("%d",min);
    return 0;
}