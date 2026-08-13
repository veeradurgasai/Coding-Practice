#include <stdio.h>

int main() {
    int n = 4; // Size of the matrix
    int mat[4][4] = {
        {1,  2,  3,  4},
        {5,  6,  7,  8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    int top = 0, bottom = n - 1;
    int left = 0, right = n - 1;

    printf("Spiral Order: ");

    // Keep printing boxes until we meet in the middle
    while (top <= bottom && left <= right) {
        
        // 1. Print top row (left to right)
        for (int i = left; i <= right; i++) {
            printf("%d ", mat[top][i]);
        }
        top++; // Top row is done, move down

        // 2. Print right wall (top to bottom)
        for (int i = top; i <= bottom; i++) {
            printf("%d ", mat[i][right]);
        }
        right--; // Right wall is done, move left

        // 3. Print bottom row (right to left)
        for (int i = right; i >= left; i--) {
            printf("%d ", mat[bottom][i]);
        }
        bottom--; // Bottom row is done, move up

        // 4. Print left wall (bottom to top)
        for (int i = bottom; i >= top; i--) {
            printf("%d ", mat[i][left]);
        }
        left++; // Left wall is done, move right
    }

    printf("\n");
    return 0;
}
