package com.google.gson.internal;

import j$.util.Objects;
import java.io.Writer;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class o extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f4336a;

    /* renamed from: b, reason: collision with root package name */
    public final n f4337b = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.gson.internal.n, java.lang.Object] */
    public o(StringBuilder sb) {
        this.f4336a = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f4336a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i3) {
        n nVar = this.f4337b;
        nVar.f4334a = cArr;
        nVar.f4335b = null;
        this.f4336a.append((CharSequence) nVar, i, i3 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f4336a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i3) {
        this.f4336a.append(charSequence, i, i3);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i3) {
        this.f4336a.append(charSequence, i, i3);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i3) {
        Objects.requireNonNull(str);
        this.f4336a.append((CharSequence) str, i, i3 + i);
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.f4336a.append((char) i);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
