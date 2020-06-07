n=input("Enter Name of Player1:").lower().replace(' ','')
x=len(n)
m=input("Enter Name of Player2:").lower().replace(' ','')
if(m==n):
    print("Same person");
else:
    for i in set(m):
        if(i in set(n)):
            n=n.replace(i,'',m.count(i))            
    x=len(m)+len(n)+len(n)-x
    a=[1,1,1,1,1,1]
    k=0
    for i in range(len(a)-1):
        j=0
        while(True):
            if(a[k]==1):
                j+=1
            if(j==x):
                a[k]=0;
                break;
            k=(k+1)%6;
    def flame(i):
        switcher={
        0:'Friends',
        1:'Lovers',
        2:'Affection',
        3:'Marriage',
        4:'Enemies',
        5:'Sisters/Brothers'
        }
        return switcher.get(i,"Invalid")
    for i in range(len(a)):
        if(a[i]==1):
            print(flame(i))
    
    
    

        

    
    
            
            
