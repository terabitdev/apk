package com.google.gson;

import com.google.gson.internal.o;
import java.io.IOException;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class d {
    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            w3.b bVar = new w3.b(new o(sb));
            bVar.q = 1;
            com.google.gson.internal.bind.e.f4314z.c(bVar, this);
            return sb.toString();
        } catch (IOException e10) {
            f2.i.i(e10);
            return null;
        }
    }
}
