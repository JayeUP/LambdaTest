package com.jaxb.test.javatoxml;

import com.jaxb.test.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.PrintStream;

public class JavaToXml {

    public static void main(String[] args) throws Exception {
        Student stu = new Student("001", "Tom", 22);
        javaToxml(stu);
    }

    public static void javaToxml(Student stu) throws Exception {

        // 获取JAXB的上下文环境，需要传入具体的 Java bean -> 这里使用Student
        JAXBContext context = JAXBContext.newInstance(Student.class);
        // 创建 Marshaller 实例
        Marshaller marshaller = context.createMarshaller();
        // 设置编码方式 -> 这里举例是设置为GBK编码，默认是使用UTF-8编码
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
        // 设置转换参数 -> 这里举例是告诉序列化器是否格式化输出
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // 构建输出环境 -> 这里使用标准输出，输出到控制台Console
        PrintStream out = System.out;
        // 将所需对象序列化 -> 该方法没有返回值
        marshaller.marshal(stu, out);
    }
}
