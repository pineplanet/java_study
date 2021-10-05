package ch09.Test.exam;

public class BeanFactory {
    public Object getBean(String name){
        Object obj = null;

        if(name.equals("samsung")){
            obj= new SamsungTV();
        }else if (name.equals("lg")){
            obj = new LGTV();
        }
        return obj;

    }
}
