����JDK�Դ��Ķ�̬����API��ʵ�ֶ�̬����

JDK��̬�����а���һ�����һ���ӿڣ� 
InvocationHandler�ӿڣ� 
public interface InvocationHandler { 
	public Object invoke(Object proxy,Method method,Object[] args) throws Throwable; 
}
����˵���� 
Object proxy��ָ������Ķ��� 
Method method��Ҫ���õķ��� 
Object[] args����������ʱ����Ҫ�Ĳ��� 

���Խ�InvocationHandler�ӿڵ����������һ����������ղ����ࡣ 

Proxy�ࣺ 
Proxy����ר����ɴ���Ĳ����࣬����ͨ������Ϊһ�������ӿڶ�̬������ʵ���࣬�����ṩ�����µĲ��������� 
public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, 
InvocationHandler h) throws IllegalArgumentException 
����˵���� 
ClassLoader loader��������� 
Class<?>[] interfaces���õ�ȫ���Ľӿ� 
InvocationHandler h���õ�InvocationHandler�ӿڵ�����ʵ�� 

Ps:�������
��Proxy���е�newProxyInstance()��������Ҫһ��ClassLoader���ʵ����ClassLoaderʵ���϶�Ӧ���������������Java����Ҫ��һ�������������; 
Booststrap ClassLoader���˼���������C++��д��һ�㿪�����ǿ������ģ� 
Extendsion ClassLoader������������չ��ļ��أ�һ���Ӧ����jre\lib\extĿ¼�е���; 
AppClassLoader��(Ĭ��)����classpathָ�����࣬���ʹ�õ���һ�ּ������� 