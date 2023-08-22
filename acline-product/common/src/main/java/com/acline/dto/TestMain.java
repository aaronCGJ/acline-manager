package com.acline.dto;

import javax.swing.*;

public class TestMain {
    public static void main(String[] args) {
        //Linux下必须加这一句
        java.lang.System.setProperty("sun.awt.xembedserver", "true");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame mainFrame = new JFrame();
                //设置显示窗口标题
                mainFrame.setTitle("WPS JAVA接口调用演示");
                //设置窗口显示尺寸
                mainFrame.setSize(1524, 768);
                //置窗口是否可以关闭
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //禁止缩放
                mainFrame.setResizable(false);
                //设置窗口是否可见
                mainFrame.setVisible(true);
            }
        });
    }
}