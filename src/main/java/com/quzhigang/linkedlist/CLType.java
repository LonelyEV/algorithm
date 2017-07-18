/**
 * Project Name:algorithm
 * File Name:SLType.java
 * Package Name:com.quzhigang.linkedlist
 * Date:2017年7月16日下午10:11:15
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.linkedlist;
/**
 * ClassName:SLType <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月16日 下午10:11:15 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class CLType {
	
	DATA nodeData = new DATA();
	CLType nextNode;
	
	/**
	 * 
	 * clAddEnd:(追加节点). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param head
	 * @param nodeData
	 * @return
	 * @since JDK 1.7
	 */
	@SuppressWarnings("unused")
	public CLType clAddEnd(CLType head, DATA nodeData){
		
		CLType node,htemp;
		
		if((node = new CLType()) == null){
			
			System.out.println("申请内存失败！");
			return null;
		}else{
			node.nodeData = nodeData;
			node.nextNode = null;
			
			if(head == null){
				
				head = node;
				return head;
			}
			htemp = head;
			while(htemp.nextNode != null){  //查找链表的末尾
				
				htemp = htemp.nextNode;
			}
			htemp.nextNode = node;
			return head;
		}
	}
	
	/**
	 * 
	 * clAddFirst:(插入头结点). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param head
	 * @param nodeData
	 * @return
	 * @since JDK 1.7
	 */
	@SuppressWarnings("unused")
	public CLType clAddFirst(CLType head, DATA nodeData){
		
		CLType node;
		if((node = new CLType()) == null){
			
			System.out.println("分配内存失败！");
			return null;
		}else{
			
			node.nodeData = nodeData; //保存数据
			node.nextNode = head;     //指向头引用所指节点
			head = node;              //头引用指向新节点
			return head;
		}
		
	}
	
	
	/**
	 * 
	 * clFindNode:(根据key查找指定的节点). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param head
	 * @param key
	 * @return
	 * @since JDK 1.7
	 */
	public CLType clFindNode(CLType head, String key){
		
		CLType htemp;
		htemp = head;  //保存链表头引用
		while (htemp != null) {  //若节点有效，则进行查找
			
			if(htemp.nodeData.getKey().compareTo(key) == 0){
				return htemp;
			}
			
			htemp = htemp.nextNode;  //处理下一个节点
			
		}
		
		return null;
	}
	
	/**
	 * 
	 * clInsertNode:(选择指定的节点位置插入新节点). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param head
	 * @param findKey
	 * @param nodeData
	 * @return
	 * @since JDK 1.7
	 */
	@SuppressWarnings("unused")
	public CLType clInsertNode(CLType head, String findKey, DATA nodeData){
		CLType node,nodeTemp;
		
		if((node = new CLType()) == null){
			
			System.out.println("分配内存失败！");
			return null;
		}
		
		node.nodeData = nodeData;
		nodeTemp = clFindNode(head, findKey);
		
		if(nodeTemp != null){
			
			node.nextNode = nodeTemp.nextNode;
			nodeTemp.nextNode = node;
			
		}else{
			System.out.println("未找到正确的插入位置！");
		}
		
		return head;  //返回头引用
	}
	
	/**
	 * 
	 * clDeleteNode:(删除指定的节点). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param head
	 * @param key
	 * @return
	 * @since JDK 1.7
	 */
	public int clDeleteNode(CLType head, String key){
		
		CLType node, htemp;
		
		htemp = head;
		node = head;
		
		while(htemp != null){
			
			if(htemp.nodeData.getKey().compareTo(key) == 0){
				
				node.nextNode = htemp.nextNode;  //使前一个节点指向当前下一个节点
				htemp = null;  //释放内存
				return 1;
				
			}else{
				node = htemp;  //指向当前节点
				htemp = htemp.nextNode;  //指向下一个节点
			}

		}
		
		return 0;
	}
	
	/**
	 * 
	 * clLength:(计算链表的长度). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param head
	 * @return
	 * @since JDK 1.7
	 */
	public int clLength(CLType head){
		
		CLType htemp;
		int len = 0;
		htemp = head;
		
		while(htemp != null){
			
			len++;
			htemp = htemp.nextNode;
			
		}
		
		return len;
	}
	
	/**
	 * 
	 * clAllNode:(显示所有节点数据). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param head
	 * @since JDK 1.7
	 */
	public void clAllNode(CLType head){
		
		CLType htemp;
		DATA nodeData;
		htemp = head;
		System.out.printf("当前链表共有%d个节点。节点数据如下: \n",clLength(head));
		
		while(htemp != null){
			
			nodeData = htemp.nodeData;
			System.out.printf("节点(%s,%s,%d) \n",nodeData.getKey(),nodeData.getName(),nodeData.getAge());
			htemp = htemp.nextNode;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

