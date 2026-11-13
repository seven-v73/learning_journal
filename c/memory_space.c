#include <stdio.h>
#include <stdlib.h>

int main(){
    int n = 5;
    int *tab = malloc(n * sizeof(int));
    if (tab == NULL) return 1;

    for (int i = 0; i < n; i++){
        tab[i] = i * i;
    }

    for(int i = 0; i < n; i++){
        printf("%d", tab[i]);
    }

    free(tab);

    tab = NULL;

    return 0;
}