#include<iostream>
#include<stdlib.h>
#include<stdio.h>
#include <time.h> 
#include<string>

using namespace std;

string str1="##########################";
string str2="         ����С��Ϸ         ";
string str3="��ʼ��Ϸ�밴0             ";
string str5="��Ҫ��ʾ��1    ����Ҫ��ʾ��2";
string str4="##########################";

int main(){
	
	int a,b,c=0,flag,flag1=0,begin,again;
    cout<<str1<<endl;
	cout<<str2<<endl;
	cout<<str3<<endl;
	cout<<str5<<endl;
	cout<<str4<<endl;
	cout<<"�Ƿ�ʼ��Ϸ:";
    cin>>begin;
    srand((unsigned)time(NULL));	
	b=rand() % 100;
	//cout<<b;
	while(begin==0){
		cout<<"�Ƿ���Ҫ��ʾ:";
	    cin>>flag;
		while(c<3){
			cout<<"������һ��100���ڵ�����:"<<endl;
			cin>>a;
			while(true){
				if(a>b){	
					c++;
					if(c<3&&flag==1){
						cout<<"�´���"<<endl;
					}
					cout<<"���ز£�"<<endl;
					break;
				}
				else if(a<b){	
					c++;
					if(c<3&&flag==1){
						cout<<"��С��"<<endl;
					}
					cout<<"���ز£�"<<endl;
					break;
				}
				else{
					cout<<"�ش���ȷ,��Ϸ����"<<endl;
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
			cout<<"��Ϸ����"<<endl;
			cout<<"������¿�ʼ��Ϸ�밴0,����˳���Ϸ�밴��0���������"<<endl;
			cin>>again;
		    if(again==0)
				c=0;
			else
				break;
		}
	}
	if(begin!=0)
		cout<<"�˳���Ϸ"<<endl;

	return 0;
}