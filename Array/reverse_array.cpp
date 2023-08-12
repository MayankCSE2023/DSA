#include <iostream>
using namespace std;

/*In C++, if you pass an array to a function, you generally need to explicitly pass the
 length of the array as a separate parameter. Unlike some other programming languages, 
 C++ does not inherently provide a way to determine the length of an array within a function
  when the array is passed as an argument.
 This is because arrays decay to pointers when passed to functions, and the size information is lost.*/

void rev_array(int arr[], int n){  
       int temp;

       for (int i = 0; i < n/2; i++)
       {
          temp=arr[i];
          arr[i]=arr[n-i-1];
          arr[n-i-1]=temp;
       }
       
}

int main(int argc, char const *argv[])
{
    int arr[]={0,1,2,3,4,5,6};
    int n= sizeof(arr)/sizeof(int);

    rev_array(arr,n);

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " " ;
    }
    
    return 0;
}
