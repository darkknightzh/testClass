package com.example.testclass;
import android.util.Log;


public class AndroidClass {
	private long ptr_;
	
	private native long AndroidClassGen(int[] data, int num);
	private native void AndroidClassFree(long ptr);
	private native double calcMean(long ptr);
	private native int calcSum(long ptr); 

    static 
    {
    	Log.i("AndroidClass","before load library");
        System.loadLibrary("AndroidClass");
        Log.i("AndroidClass","after load library");  
    }
    
    public AndroidClass(int[] data, int num) 
    {
    	ptr_=AndroidClassGen(data, num);
    }
    
    public void AndroidClassFree() 
    {
    	AndroidClassFree(ptr_);
    }

    public double calcMean() 
    {
    	return calcMean(ptr_);
    }
    
    public double calcSum() 
    {
    	return calcSum(ptr_);
    }
    
    // AndroidClassGetPtr����ʹ�ã������Ҫ���ⲿ��AndroidClass����Ķ���Aʹ�ö���B����ʹ������������� B��ָ�롣
    public double AndroidClassGetPtr()  
    {
    	return ptr_;
    }
}



