package util;

import dao.impl.EmployeeDAOJdbcImpl;
/**
 * ������
 * ������һ�����ģʽ����ν���ģʽ��Ϊ�����ͬ�������Ƶ����������һ�׽�����������һ��������
 * �������������繤��ģʽ����һ�����õ����ģʽ��
 * ����Ϊ�������ṩ���Ͻӿ�Ҫ��Ķ����������һ���Ϊ��Ʒ�����������ĺô��ǣ������߲����˽�����
 * ����ϸ�ڣ�����������Ĵ������̷����ı䣬����Ӱ�쵽�����ߡ�
 * ����ʹ�������ļ�����ýӿ����Ӧʵ����Ķ�Ӧ��ϵ����ʵ���෢���ı䣬������ȥ�޸Ĺ������Դ���� 
 */
public class Factory {
  public static Object getInstance(String type){
    Object obj = null;
    if("EmployeeDAO".equals(type)){
      obj = new EmployeeDAOJdbcImpl();
    }
    return obj;
  }
}
