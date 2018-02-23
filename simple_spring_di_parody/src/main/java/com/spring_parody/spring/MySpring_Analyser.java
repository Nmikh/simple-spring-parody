package com.spring_parody.spring;

import com.spring_parody.MyAnnotations.MyService;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.util.*;

public class MySpring_Analyser {
    private String path;
    private Set<Class<?>> classes;
    private Map container = new HashMap();

    public MySpring_Analyser(String path) throws IllegalAccessException, InstantiationException {
        this.path = path;

        List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
        classLoadersList.add(ClasspathHelper.contextClassLoader());
        classLoadersList.add(ClasspathHelper.staticClassLoader());

        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false), new ResourcesScanner())
                .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
                .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix(path))));
        classes = reflections.getSubTypesOf(Object.class);

        for (Class classExp : classes) {
            MyService annotation = (MyService) classExp.getAnnotation(MyService.class);
            Object objClass = classExp.newInstance();
            if (annotation != null) {
                if (annotation.value().equals("")) {
                    container.put(
                            classExp.getSimpleName().substring(0, 1).toLowerCase() + classExp.getSimpleName().substring(1),
                            objClass);
                } else {
                    container.put(annotation.value(), objClass);
                }
            }
        }
    }

    public void print() {
        System.out.println(container);
    }
}
