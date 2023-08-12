#include <iostream>
using namespace std;

  void min_max(int arr[],int n){

    int min= arr[0];
    int max=arr[0];

    for (int i = 1; i < n; i++)
    {
        if (arr[i]>max)
        {
            max=arr[i];
        }
        if (arr[i]<min)
        {
            min=arr[i];
        }
        
    }
        std::cout << "max : " << max << std::endl;
        std::cout << "min : " << min << std::endl;
    
  }

int main(int argc, char const *argv[])
{
    int arr[]={-5,45,2,33,4,5,6,0,7};
    int n= sizeof(arr)/sizeof(int);

    min_max(arr,n);

    return 0;
}
