package com.pfelix;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
* What we need to do is we need to implement two read methods
* that take a bite an array of bytes and converts each byte that represents a character to lowercase
* if it's an uppercase character.*/
public class LowerCaseInputStream extends FilterInputStream {

//    constructor
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }
//    method we want to add new  functionality too.
    public int read() throws IOException {
        int c = in.read();
        return (c == -1) ? c : Character.toLowerCase((char) c);
    }
// override the read that takes a bye
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);

        for (int i = offset; i < offset + result; i++)
            b[i] = (byte) Character.toLowerCase((char)b[i]);

        return result;
    }

}
