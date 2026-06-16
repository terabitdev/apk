package com.google.gson;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4216d = new a("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f4217a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4218b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4219c;

    static {
        new a("\n", "  ", true);
    }

    public a(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f4217a = str;
                this.f4218b = str2;
                this.f4219c = z10;
                return;
            }
            f2.i.k("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        f2.i.k("Only combinations of \\n and \\r are allowed in newline.");
        throw null;
    }
}
