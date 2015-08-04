package com.lhl.sw.vo;

import java.io.Serializable;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class EmpBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	private String empName;
	private String empPass;
	private double amount;

 	//�޲���Ĺ�����
	public EmpBean()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public EmpBean(String empName , String empPass
		, double amount)
	{
		this.empName = empName;
		this.empPass = empPass;
		this.amount = amount;
	}

	//empName���Ե�setter��getter����
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getEmpName()
	{
		return this.empName;
	}

	//empPass���Ե�setter��getter����
	public void setEmpPass(String empPass)
	{
		this.empPass = empPass;
	}
	public String getEmpPass()
	{
		return this.empPass;
	}

	//amount���Ե�setter��getter����
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
	}
}