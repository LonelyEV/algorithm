/**
 * Project Name:algorithm
 * File Name:SequentialListTest.java
 * Package Name:com.quzhigang.sequentiallist
 * Date:2017年7月16日上午6:44:03
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.sequentiallist;

import java.util.Scanner;

/**
 * ClassName:SequentialListTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月16日 上午6:44:03 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class SequentialListTest {

	public static void main(String[] args) {
		
		int i;
		SLType sl = new SLType();
		DATA pData;
		String key;
		
		System.out.println("顺序表操作开始========》》》》》》》》");
		
		sl.sLInit(sl);
		System.out.println("顺序表初始化完成=======》》》》》》》》");
		
		Scanner input = new Scanner(System.in);
		
		do{
			
			System.out.print("请输入添加的节点(学号 姓名  年龄):");
			
			DATA data = new DATA();
			data.setKey(input.next());
			data.setName(input.next());
			data.setAge(input.nextInt());
			
			if(data.getAge() != 0){
				
				if(sl.slAdd(sl, data) == 0){
					break;
				}
				
			}else{
				break;
			}
			
		}while(true);
		
		System.out.println("顺序表中的节点顺序为:");
		sl.slAll(sl);
		
		System.out.println("要取出节点的序号:");
		
		i = input.nextInt();
		pData = sl.slFindByNum(sl, i);
		
		if(pData != null){
			System.out.printf("第%d个节点为:(%s,%s,%d)\n", i,pData.getKey(),pData.getName(),pData.getAge());
		}
		
		System.out.println("请输入要查找节点的关键字:");
		
		key = input.next();
		i = sl.slFindByCont(sl, key);
		pData = sl.slFindByNum(sl, i);
		
		if(pData != null){
			System.out.printf("第%d个节点为:(%s,%s,%d)\n", i,pData.getKey(),pData.getName(),pData.getAge());
		}

	}

}

