package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f4058a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f4059b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4060c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f4059b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f4060c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
