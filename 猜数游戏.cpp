#include<iostream>
#include<stdlib.h>
#include<stdio.h>
#include <time.h> 
#include<string>

using namespace std;

string str1="##########################";
string str2="         猜数小游戏         ";
string str3="开始游戏请按0             ";
string str5="需要提示按1    不需要提示按2";
string str4="##########################";

int main(){
	
	int a,b,c=0,flag,flag1=0,begin,again;
    cout<<str1<<endl;
	cout<<str2<<endl;
	cout<<str3<<endl;
	cout<<str5<<endl;
	cout<<str4<<endl;
	cout<<"是否开始游戏:";
    cin>>begin;
    srand((unsigned)time(NULL));	
	b=rand() % 100;
	//cout<<b;
	while(begin==0){
		cout<<"是否需要提示:";
	    cin>>flag;
		while(c<3){
			cout<<"请输入一个100以内的整数:"<<endl;
			cin>>a;
			while(true){
				if(a>b){	
					c++;
					if(c<3&&flag==1){
						cout<<"猜大了"<<endl;
					}
					cout<<"请重猜！"<<endl;
					break;
				}
				else if(a<b){	
					c++;
					if(c<3&&flag==1){
						cout<<"猜小了"<<endl;
					}
					cout<<"请重猜！"<<endl;
					break;
				}
				else{
					cout<<"回答正确,游戏结束"<<endl;
					flag1=1;
					break;
				}
			}
			if(flag1==1)
				break;
		}
       if(flag1==1)
			break;
		if(c>=3){
			cout<<"游戏结束"<<endl;
			cout<<"如果重新开始游戏请按0,如果退出游戏请按除0的任意键！"<<endl;
			cin>>again;
		    if(again==0)
				c=0;
			else
				break;
		}
	}
	if(begin!=0)
		cout<<"退出游戏"<<endl;

	return 0;
}