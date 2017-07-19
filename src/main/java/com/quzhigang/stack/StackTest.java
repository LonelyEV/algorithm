/**
 * Project Name:algorithm
 * File Name:StackTest.java
 * Package Name:com.quzhigang.stack
 * Date:2017年7月19日下午10:09:32
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.stack;

import java.util.Scanner;

/**
 * ClassName:StackTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月19日 下午10:09:32 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class StackTest {
	
	public static void main(String[] args) {
		
		StackType stackType = new StackType();
		DATA data = new DATA();
		
		StackType stack = stackType.init();
		Scanner input = new Scanner(System.in);
		
		System.out.println("入栈开始：");
		System.out.println("输入姓名 年龄进行入栈操作：");
		
		do{
			
			DATA tempData = new DATA();
			tempData.setName(input.next());
			
			if(tempData.getName().equals("0")){
				break;
			}else{
				tempData.setAge(input.nextInt());
				stackType.pushStack(stack, tempData);
			}
			
		}while(true);
		
		input.nextLine();  //清除enter输入
		String temp = "1";
		System.out.println("出栈操作：按任意非0键进行出栈操作：");
		temp = input.next();
		
		while (!temp.equals("0")) {
			
			data = stackType.popStack(stack);
			System.out.printf("出栈的数据是(%s,%d)\n",data.getName(),data.getAge());
			temp = input.next();
			
		}
		
		System.out.println("测试结束！");
		stack.freeStack(stack);
		
		
	}

}

