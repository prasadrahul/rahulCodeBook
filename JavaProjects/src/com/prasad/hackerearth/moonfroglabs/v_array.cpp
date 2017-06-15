#include<bits/stdc++.h>
using namespace std;
int getSum(int BITree[], int index)
{
    int sum = 0;
    while (index > 0)
    {
        sum += BITree[index];
        index -= index & (-index);
    }
    return sum;
}
void updateBIT(int BITree[], int n, int index, int val)
{
    while (index <= n)
    {
       BITree[index] += val;
       index += index & (-index);
    }
}
void convert(int arr[], int n)
{
    int temp[n];
    for (int i=0; i<n; i++)
        temp[i] = arr[i];
    sort(temp, temp+n);int i;
    for (i=0; i<n; i++)
    {
        arr[i] = lower_bound(temp, temp+n, arr[i]) - temp + 1;
	arr[i]=n-arr[i]+1;	//changing largest element as smallest and so on, later we need to apply simple inversion count
    }
}
int f[1000005];
void getInvCount(int arr[], int n)
{
    int invcount = 0;
    convert(arr, n);
    int BIT[n+1];
    for (int i=1; i<=n; i++)
        BIT[i] = 0;
    for (int i=n-1; i>=0; i--)
    {

	f[i]= getSum(BIT, arr[i]-1);
        updateBIT(BIT, n, arr[i], 1);
    }
}
int main()
{
	int n,k,i,a[1000005];
	scanf("%d%d",&n,&k);
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	getInvCount(a,n);
	sort(f,f+n);long long count=0;
	vector<int>v(f,f+n);
	for(i=n-1;i>=0;i--)
	{
		int j=lower_bound(v.begin(),v.end(),k-v[i])-v.begin();
		if(j!=n && j<i)
			count+=i-j;
	}
	printf("%lld\n",count);
	return 0;
}