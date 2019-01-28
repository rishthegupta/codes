## finsl solution ##

from math import sqrt


#calculating factors
l=[]
def findFactors(n):
    for i in range(1, n):
        if n % i == 0:
            l.append(i)

           

def isPerfectSquare(n):
    nsqrt=sqrt(n)
    if int(nsqrt+0.5)**2==n: 
        return True
    else:
        return False

def isSquareFree(n):
    if n%2==0:
        n=n/2
    if n%2==0:
        return False
    for i in range(3,int(sqrt(n)+1)):   
        if n%i==0:
            n=n/i
        if n%i==0:
            return False
    return True



# main


def main():
    num=int(input().strip())
    
    findFactors(num)
   
    length_num=len(l)
    
    for i in range(length_num):
        
        if(isPerfectSquare(l[i])):
            l[i]=0
        
    
    for i in range(length_num):
        temp=isSquareFree(l[i])
        if(temp==0):
            
            l[i]=0
    count=0
    for i in range(length_num):
        if(l[i]!=0):
            count=count+1
  
    print(count)
    
    

    
    




main()





