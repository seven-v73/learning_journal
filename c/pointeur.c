#include <stdio.h>

int main(){
    int x = 42;
    int *p = &x;

    *p = 100;
    printf("%d\n", x);

    return 0;
}