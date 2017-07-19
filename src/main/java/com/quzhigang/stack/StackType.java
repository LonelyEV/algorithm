/**
 * Project Name:algorithm
 * File Name:StackType.java
 * Package Name:com.quzhigang.stack
 * Date:2017年7月18日下午11:49:12
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.stack;
/**
 * ClassName:StackType <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月18日 下午11:49:12 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class StackType {
	
	public static final int MAXLEN = 50;
	DATA[] data = new DATA[MAXLEN+1];
	int top;
	
	/**
	 * 
	 * init:(初始化栈操作). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @return
	 * @since JDK 1.7
	 */
	public StackType init(){
		
		StackType stackType;
		
		if((stackType = new StackType()) != null){  //申请内存
			
			stackType.top = 0;
			return stackType;
		}
		
		return null;
	}
	
	/**
	 * 
	 * isEmpty:(判断空栈). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param stackType
	 * @return
	 * @since JDK 1.7
	 */
	public boolean isEmpty(StackType stackType){
		
		boolean flag;
		
		flag = (stackType.top == 0);
		
		return flag;
	}
	
	
	/**
	 * (判断满栈). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param stackType
	 * @return
	 * @since JDK 1.7
	 */
	public boolean isFull(StackType stackType){
		
		boolean flag;
		
		flag = (stackType.top == MAXLEN);
		
		return flag;
		
	}
	
	/**
	 * 
	 * cleanStack:(清空栈). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param stackType
	 * @since JDK 1.7
	 */
	public void cleanStack(StackType stackType){
		
		stackType.top = 0;
	}
	
	/**
	 * 
	 * freeStack:(释放空间). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param stackType
	 * @since JDK 1.7
	 */
	public void freeStack(StackType stackType){
		
		
		if(stackType != null){
			
			stackType = null;
		}
	}
	
	/**
	 * 
	 * pushStack:(入栈操作). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param stackType
	 * @param data
	 * @return
	 * @since JDK 1.7
	 */
	public int pushStack(StackType stackType, DATA data){
		
		if((stackType.top+1)>MAXLEN){
			
			System.out.println("栈溢出！");
			return 0;
		}
		
		stackType.data[++stackType.top] = data;
		return 1;
		
	}
	
	/**
	 * 
	 * popStack:(出栈操作). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param stackType
	 * @return
	 * @since JDK 1.7
	 */
	public DATA popStack(StackType stackType){
		
		if(stackType.top ==0){
			
			System.out.println("栈为空！");
			return null;
		}
		
		return (stackType.data[stackType.top--]);
		
	}
	
	/**
	 * 
	 * peekStack:(读节点数据). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param stackType
	 * @return
	 * @since JDK 1.7
	 */
	public DATA peekStack(StackType stackType){
		
		if(stackType.top == 0){
			
			System.out.println("栈为空！");
			return null;
		}
		
		return (stackType.data[stackType.top]);
		
		
	}
	
	

}

