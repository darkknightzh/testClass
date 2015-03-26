
// myMeanSum.cpp�ļ�

#include "myMeanSum.h"


myMeanSum::myMeanSum()
: m_mean(0)
, m_sum(0)
, m_number(0)
{
	databuf = new int[10];
}

myMeanSum::myMeanSum(int* data, int num)
: m_mean(0)
, m_sum(0)
, m_number(0)
{
	m_number = num;
	databuf = new int[m_number];
	memcpy(databuf, data, sizeof(int)*m_number);
}


myMeanSum::~myMeanSum()
{
	if (databuf!=NULL)
	{
		delete[] databuf;
		databuf = NULL;
	}
}


double myMeanSum::calcMean()
{
	m_sum = calcSum();
	return m_sum / 1.0 / m_number;  // / 1.0������֤int�����Զ�ת����double���͡�
}


int myMeanSum::calcSum()
{
	m_sum = 0;
	for (int i = 0; i < m_number; i++)
	{
		m_sum += databuf[i];
	}
	return m_sum;
}
