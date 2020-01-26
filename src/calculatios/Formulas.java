
package calculatios;

import javax.naming.spi.DirStateFactory;


public class Formulas {
    
    //method for summation two or three variables start
    public int doSum(int a,int b ){
        return a+b;
    }
    public int doSum(int a, int b, int c){
        return a+b+c;
    }
    public double doSum(double a, double b){
        return a+b;
    }
    public double doSum(double a, double b, double c){
        return a+b+c;
    }
    //method for summation two or three variables end
    
    //method for subtraction two  variables start
    public int doSub(int a, int b){
        return a-b;
    }
    public double doSub(double a, double b){
        return a-b;
    }
    //method for subtraction two  variables start
    
    //method for multiplication two or three  variables start
    public int doMul(int a, int b){
        return a*b;
    }
    public int doMul(int a, int b, int c){
        return a*b*c;
    }
    
    public double doMul(double a, double b){
        return a*b;
    }
    public double doMul(double a, double b,double  c){
        return a*b*c;
    }
     //method for multiplication two or three variables end
    
     //method for division two  variables start
     public int doDiv(int a, int b){
        return a/b;
    }
    public double doDiv(double a, double b){
        return a/b;
    }
    //method for division two  variables end
    
    //methods for finding maximum number start
    public int findMax(int a, int b){
        
        if(a>b)
            return a;
        else 
            return b;    
    }
    public double findMax(double a, double b){
        
        if(a>b)
            return a;
        else 
            return b;    
    }
    public int findMax(int a, int b,int c){
        
        if((a>b) && (a>c))
            return a;
        else if((b>a) && (b>c))
            return b;
        else 
            return c;
    }
    public double findMax(double a, double b,double c){
        
        if((a>b) && (a>c))
            return a;
        else if((b>a) && (b>c))
            return b;
        else 
            return c;
    }
    //methods for finding maximum number end
    
    //methods for finding Minimum number start
    public int findMin(int a, int b){
        
        if(a<b)
            return a;
        else 
            return b;    
    }
    public double findMin(double a, double b){
        
        if(a<b)
            return a;
        else 
            return b;    
    }
    public int findMin(int a, int b,int c){
        
        if((a<b) && (a<c))
            return a;
        else if((b<a) && (b<c))
            return b;
        else 
            return c;
    }
    public double findMin(double a, double b,double c){
        
        if((a<b) && (a<c))
            return a;
        else if((b<a) && (b<c))
            return b;
        else 
            return c;
    }
    //methods for finding maximum number end
    
    //methods for finding square of a  number start
    public int findSquare(int a){
        
        return a*a;
    }
    public double findSquare(double a){
        
        return a*a;
    }
    //methods for finding square of a  number end
    
    //methods for finding Cube of a  number start
    public int findCube(int a){
        
        return a*a*a;
    }
    public double findCube(double a){
        
        return a*a*a;
    }
    //methods for finding Cube of a  number end
    
    //methods for finding Power of a  number start
    public int findPower(int base,int power){
        int result = 1;
        for(int i=1;i<=power;i++){
             result = result*base;
        }
        return result;
    }
    public double findPower(double base,double power){
        double result = 1.0;
        
        for(int i=1;i<=power;i++){
             result = result*base;
        }               
        return result;
    }
    //methods for finding Power of a  number end
    
    //Leap check start
    
    public boolean isLeapYear(int year ){
        if((year%400 ==0) ||((year%4==0) && (year%100!=0))){
            return true;
        }
        else
            return false;
    }
    
    //Leap check end
    public int countDigit(int number){
        
        int digitCount = 0;
        
        while(number>0){
            number = number/10;
            digitCount++;
        }
        
        return digitCount;
    }
    
    
    
    
    
    
    
}
