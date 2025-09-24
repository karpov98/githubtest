package com.karpov.tostring;

import org.junit.Test;
import sun.net.www.content.image.png;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("主现程跑第" + i + "次数");
        }

    }
    @Test
    public void testXXX() {

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子现程跑第" + i + "次数");
        }
    }
}
