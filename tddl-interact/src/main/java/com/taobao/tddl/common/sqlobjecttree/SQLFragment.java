/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.util.List;
import java.util.Set;

public interface SQLFragment extends Cloneable{
	
	 public void appendSQL(StringBuilder sb);
	 /**
	  * ��һ��sql�в����StringToken���浽�ڶ��������Ǹ�list�У�token֮���п��ܻ���һЩ�ɱ��
	  * ����������limit m,n�е�m,n.���б�����
	 * @param logicTableNames
	 * @param list
	 * @param sb
	 * @return
	 */
	public StringBuilder regTableModifiable(Set<String> logicTableNames,List<Object> list,StringBuilder sb);
}