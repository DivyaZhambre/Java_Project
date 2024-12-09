#include<stdio.h>
void main(){
    int order,qty,op;
    float bill=0,amount;
    printf("place your order\n");
    do{
    printf("1. Tea--10 \n2. Coffee--20 \n3. Cold Coffee--30\n");
    scanf("%d",&order);
    switch(order){
        case 1: printf("please enter ur quantity\n");
        scanf("%d",&qty);
        bill=bill+(10*qty);
        break;
          case 2: printf("please enter ur quantity\n");
        scanf("%d",&qty);
        bill=bill+(20*qty);
        break;  
        case 3: printf("please enter ur quantity\n");
        scanf("%d",&qty);
        bill=bill+(30*qty);
        break;
        default: printf("sorry we dont serve this\n");
        break;
    }
    printf("do you want to order more if yes press 1 else 0\n");
    scanf("%d",&op);
    }while(op!=0);
    printf("please pay your amount\n");
    scanf("%f",&amount);
    bill=bill-amount;
    printf("\n");
    if(bill==0)
    printf("tq\n");
    else
    printf("Pay remaining amount %f\n",bill);
    scanf("%f",&amount);
    bill=bill-amount;
    printf("\n");
    if("bill==0")
    printf("tq visit again");


    
}