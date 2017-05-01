package com.zzu.kaidi.java.puzzles.buffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * Created by kaidi on 17-5-1.
 */
public class DirectorBuffer {
    public static void main(String[] args) throws IOException {
        byte[] source = new byte[1024];
        IntBuffer buffer = ByteBuffer.wrap(source).asIntBuffer();
        System.out.println("byte buffer wrap source as int buffer. is direct : " + buffer.isDirect());

        IntBuffer buffer2 = IntBuffer.allocate(1024);
        System.out.println("int buffer allocate. is direct : " + buffer2.isDirect());

        byte[] directByte = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        if (fileInputStream.read(directByte) != -1) {
            IntBuffer buffer3 = ByteBuffer.wrap(source).asIntBuffer();
            System.out.println("int buffer allocate. is direct : " + buffer3.isDirect());
        }

        ByteBuffer buffer5 = ByteBuffer.allocateDirect(1024);
        System.out.println("int buffer allocate. is direct : " + buffer5.isDirect());

    }
}
