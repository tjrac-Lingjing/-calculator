#include<cstdio>
#include<iostream>
#include<cString>
#include<cmath>
using namespace std;
int cnt=0;
int flag = 1;
char a[255];
int ch;
void Convert(int num,int n)
{
	int a=0,i,b[10000];
	int k=num;
    while(k)
    {
        k=k/n;
        a++;
    }
    for(i=0; i<a; i++)
    {
        b[i]=num%n;
        num=num/n;
    }
    for(i=a-1; i>=0; i--)
    {
        if(b[i]<=9)
            printf("%d",b[i]);
        else
            printf("%c",b[i]+55);
    }
     printf("\n");   
}
int convertBinary(int s,long long n)
{
    int dec = 0, i = 0, rem;
    while (n!=0)
    {
        rem= n%10;
        n /= 10;
        dec += rem*pow(s,i);
        ++i;
    }
    return dec;
}
int main()
{
	printf("\t\t\t***********����ת����********************\n");
	while(flag)
	{ 
	printf("������Ҫ���еĲ��������\n");
	printf("1.n(2~9)����תʮ����\n");
	printf("2.ʮ����תn(2~16)����\n");
	scanf("%d",&ch);
	if(ch==2){
		int integer,base; 
		printf("����һ������0��������������");
		scanf("%d",&integer);
		printf("����������Ļ���:(2~16)");
		scanf("%d",&base);
		if( base>16 || base<2 )
		{
			printf("�������!������2~16���ڵĽ���������:");
			scanf("%d",&base);
		} 
		Convert(integer,base);
	}
	else if(ch==1){
		long long binary;
		int rad;
		printf("����һ��n������: \n");
    	scanf("%lld", &binary);
		printf("�������Ϊ������ :\n");
		scanf("%d", &rad);
    	printf("%d������ %lldת��Ϊʮ����Ϊ :%d\n", rad,binary, convertBinary(rad,binary));
		}
		else{
			printf("û�д�ѡ�\n");
		}
		printf("�Ƿ����?(1(Y)/0(N)");
		scanf("%d",&flag);
	}
	return 0;

}

