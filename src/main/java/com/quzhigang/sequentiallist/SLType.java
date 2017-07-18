/**
 * Project Name:algorithm
 * File Name:SLType.java
 * Package Name:com.quzhigang.sequentiallist
 * Date:2017年7月16日上午6:13:17
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.sequentiallist;
/**
 * ClassName:SLType 定义顺序表结构 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月16日 上午6:13:17 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class SLType {
	
	private static int MAXLEN=100;
	private DATA[] listData = new DATA[MAXLEN+1];
	private int listLen;
	
	/**
	 * 
	 * sLInit:(初始化顺序表). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param sl
	 * @since JDK 1.7
	 */
	public void sLInit(SLType sl){
		sl.listLen = 0;  //初始化为空表
	}
	
	/**
	 * 
	 * sLLength:(返回顺序表元素数量). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param sl
	 * @return
	 * @since JDK 1.7
	 */
	public int sLLength(SLType sl){
		return sl.listLen;
	}
	
	/**
	 * 
	 * slInsert:(指定位置的数据插入). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param sl
	 * @param n
	 * @param data
	 * @return
	 * @since JDK 1.7
	 */
	public int slInsert(SLType sl, int n, DATA data){
		
		int i;
		if(sl.listLen >= MAXLEN){
			System.out.println("顺序表已满，不能插入节点！");
			return 0;
		}
		
		if(n < 1 || n > sl.listLen-1){
			System.out.println("插入元素序号错误，不能插入元素！");
			return 0;
		}
		
		for(i=sl.listLen; i>=n; i--){
			sl.listData[i+1] = sl.listData[i];
		}
		
		sl.listData[n] = data;
		sl.listLen++;
		return 1;
		
	}
	
	/**
	 * 
	 * slAdd:(追加数据至顺序表末尾). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param sl
	 * @param data
	 * @return
	 * @since JDK 1.7
	 */
	public int slAdd(SLType sl, DATA data){
		
		if(sl.listLen >= MAXLEN){
			System.out.println("顺序表已满，不能插入节点！");
			return 0;
		}
		
		sl.listData[++sl.listLen] = data;
		return 1;
	}
	
	/**
	 * 
	 * slDelete:(根据序号删除顺序表中的数据). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param sl
	 * @param n
	 * @return
	 * @since JDK 1.7
	 */
	public int slDelete(SLType sl, int n){
		
		int i;
		if(n < 1 || n > sl.listLen+1){
			System.out.println("删除顺序表节点错误，不能删除！");
			return 0;
		}
		
		for(i=n; i<sl.listLen; i++){
			
			sl.listData[i] =sl.listData[i+1];
		}
		
		sl.listLen--;
		return 1;
	}
	
	/**
	 * 
	 * slFindByNum:(根据序号返回指定元素). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param sl
	 * @param n
	 * @return
	 * @since JDK 1.7
	 */
	public DATA slFindByNum(SLType sl, int n){
		
		if(n < 1 || n > sl.listLen+1){
			System.out.println("节点序号错误，不能返回节点！");
			return null;
		}
		
		return sl.listData[n];
		
	}
	
	/**
	 * 
	 * slFindByCont:(根据关键字查找节点). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param sl
	 * @param key
	 * @return
	 * @since JDK 1.7
	 */
	public int slFindByCont(SLType sl, String key){
		
		int i;
		
		for(i=1; i<=sl.listLen; i++){
			
			if(sl.listData[i].getKey().compareTo(key) == 0){
				return i;
			}
		}
		
		return 0;
	}
	
	/**
	 * 
	 * slAll:(显示顺序表中的所有节点). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚
	 * @param sl
	 * @return
	 * @since JDK 1.7
	 */
	public int slAll(SLType sl){
		
		int i;
		
		for(i=1; i<=sl.listLen; i++){
			
			System.out.printf("(%s,%s,%d)\n", sl.listData[i].getKey(),sl.listData[i].getName(),sl.listData[i].getAge());
		}
		
		return 0;
	}

}

