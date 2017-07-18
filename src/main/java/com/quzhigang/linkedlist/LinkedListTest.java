/**
 * Project Name:algorithm
 * File Name:LinkedListTest.java
 * Package Name:com.quzhigang.linkedlist
 * Date:2017年7月16日下午10:48:00
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.linkedlist;

import java.util.Scanner;

/**
 * ClassName:LinkedListTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月16日 下午10:48:00 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class LinkedListTest {

	public static void main(String[] args) {
		
		CLType node, head = null;
		CLType clType = new CLType();
		String key,findKey;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("链表测试。请输入链表中的数据，格式为：关键字 姓名  年龄");
		
		do{
			
			DATA nodeData = new DATA();
			nodeData.setKey(input.next());
			
			if(nodeData.getKey().equals("0")){
				
				break;
				
			}else{
				
				nodeData.setName(input.next());
				nodeData.setAge(input.nextInt());
				head = clType.clAddEnd(head, nodeData);
			}
			
		}while(true);
		
		input.nextLine();
		
		clType.clAllNode(head);
		
		System.out.printf("\n演示插入节点，输入插入位置的关键字：");
		
		findKey = input.next();
		System.out.println("输入插入节点的数据(关键字 姓名 年龄)：");
		
		DATA nodeData = new DATA();
		
		nodeData.setKey(input.next());
		nodeData.setName(input.next());
		nodeData.setAge(input.nextInt());
		
		head = clType.clInsertNode(head, findKey, nodeData);
		clType.clAllNode(head);
		
		System.out.println("演示删除节点，输入要删除节点的关键字：");
		
		key = input.next();
		clType.clDeleteNode(head, key);
		
		clType.clAllNode(head);
		
		System.out.println("演示在链表中查找，输入查找的关键字：");
		
		key = input.next();
		
		node = clType.clFindNode(head, key);
		
		if(node != null){
			
			nodeData = node.nodeData;
			System.out.printf("关键字%s对应的节点为节点(%s,%s,%d) \n",key,nodeData.getKey(),nodeData.getName(),nodeData.getAge());
			
		}else{
			System.out.printf("在链表中未找到关键字未%s的节点！\n",key);
		}
		
		
		
		
		


	}

}

