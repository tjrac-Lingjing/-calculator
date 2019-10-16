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
	printf("\t\t\t***********进制转换器********************\n");
	while(flag)
	{ 
	printf("请输入要进行的操作的序号\n");
	printf("1.n(2~9)进制转十进制\n");
	printf("2.十进制转n(2~16)进制\n");
	scanf("%d",&ch);
	if(ch==2){
		int integer,base; 
		printf("输入一个大于0的任意正整数：");
		scanf("%d",&integer);
		printf("输入进制数的基数:(2~16)");
		scanf("%d",&base);
		if( base>16 || base<2 )
		{
			printf("输入错误!请输入2~16以内的进制数基数:");
			scanf("%d",&base);
		} 
		Convert(integer,base);
	}
	else if(ch==1){
		long long binary;
		int rad;
		printf("输入一个n进制数: \n");
    	scanf("%lld", &binary);
		printf("输入该数为几进制 :\n");
		scanf("%d", &rad);
    	printf("%d进制数 %lld转换为十进制为 :%d\n", rad,binary, convertBinary(rad,binary));
		}
		else{
			printf("没有此选项！\n");
		}
		printf("是否继续?(1(Y)/0(N)");
		scanf("%d",&flag);
	}
	return 0;

}

