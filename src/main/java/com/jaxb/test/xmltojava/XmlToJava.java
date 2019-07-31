package com.jaxb.test.xmltojava;

import com.jaxb.test.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class XmlToJava {

    public static void main(String[] args) throws Exception {
        xmlTojava();
    }

    public static void xmlTojava() throws Exception {
        // 获取JAXB的上下文环境，需要传入具体的 Java bean -> 这里使用Student
        JAXBContext context = JAXBContext.newInstance(Student.class);
        // 创建 UnMarshaller 实例
        Unmarshaller unmarshaller = context.createUnmarshaller();
        // 加载需要转换的XML数据 -> 这里使用InputStream，还可以使用File，Reader等
        InputStream stream = XmlToJava.class.getClassLoader().getResourceAsStream("lesson1.xml");
        // 将XML数据序列化 -> 该方法的返回值为Object基类，需要强转类型
        Student stu = (Student) unmarshaller.unmarshal(stream);
        // 将结果打印到控制台
        System.out.println(stu);
    }
}
