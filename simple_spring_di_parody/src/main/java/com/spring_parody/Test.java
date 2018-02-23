package com.spring_parody;

import com.spring_parody.spring.MySpring_Analyser;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MySpring_Analyser spring_analyser = new MySpring_Analyser("com.experiment_classes");
        spring_analyser.print();
    }
}
