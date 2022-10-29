//{ Driver Code Starts
#include<stdio.h>


// } Driver Code Ends
//User function Template for C

//Function to rotate an array by d elements in counter-clockwise direction.
void swap(int arr[], int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
void reverse(int arr[], int start, int end){
    while(start<end){
        swap(arr,start++,end--);
    }
}

void rotateArr(int arr[], int d, int n){
    if(d == n) return;
    if(d>n) d = d%n;
    reverse(arr,0,n-1);
    reverse(arr,0,n-d-1);
    reverse(arr,n-d,n-1);
}

//{ Driver Code Starts.

int main() {
	int t;
	//taking testcases
	scanf("%d",&t);
	
	while(t--){
	    int n, d;
	    
	    //input n and d
	    scanf("%d%d",&n, &d);
	    
	    int arr[n];
	    
	    //inserting elements in the array
	    for(int i = 0; i < n; i++){
	        scanf("%d",&arr[i]);
	    }
	    //calling rotateArr() function
	    rotateArr(arr, d,n);
	    
	    //printing the elements of the array
	    for(int i =0;i<n;i++){
	        printf("%d ",arr[i]);
	    }
	    printf("\n");
	}
	return 0;
}
// } Driver Code Ends