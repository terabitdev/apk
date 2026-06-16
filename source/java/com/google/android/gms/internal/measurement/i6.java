package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.core.content.ContextCompat;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkRequest;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class i6 {
    public static int a(PreviewParameterProvider previewParameterProvider) {
        y7.g values = previewParameterProvider.getValues();
        values.getClass();
        Iterator it = values.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                f1.g.U();
                throw null;
            }
        }
        return i;
    }

    public static Number b(int i, w3.a aVar) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    String F = aVar.F();
                    try {
                        return com.google.gson.internal.f.i(F);
                    } catch (NumberFormatException e10) {
                        StringBuilder v = android.support.v4.media.session.m.v("Cannot parse ", F, "; at path ");
                        v.append(aVar.n(true));
                        throw new RuntimeException(v.toString(), e10);
                    }
                }
                String F2 = aVar.F();
                if (F2.indexOf(46) >= 0) {
                    return c(F2, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(F2));
                } catch (NumberFormatException unused) {
                    return c(F2, aVar);
                }
            }
            return new com.google.gson.internal.h(aVar.F());
        }
        return Double.valueOf(aVar.y());
    }

    public static Double c(String str, w3.a aVar) {
        try {
            Double valueOf = Double.valueOf(str);
            if (!valueOf.isInfinite()) {
                if (valueOf.isNaN()) {
                }
                return valueOf;
            }
            if (aVar.f11134x != 1) {
                throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.n(true));
            }
            return valueOf;
        } catch (NumberFormatException e10) {
            StringBuilder v = android.support.v4.media.session.m.v("Cannot parse ", str, "; at path ");
            v.append(aVar.n(true));
            throw new RuntimeException(v.toString(), e10);
        }
    }

    public static String d(String str, char c10) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c10);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String e(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (!Character.isUpperCase(charAt)) {
                    char upperCase = Character.toUpperCase(charAt);
                    if (i == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i) + upperCase + str.substring(i + 1);
                }
            } else {
                i++;
            }
        }
        return str;
    }

    public static /* synthetic */ int f(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int g(int i) {
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i3;
    }

    public static int h(int i, int i3, int i8) {
        return d5.s(i) + i3 + i8;
    }

    public static int i(int i, int i3, int i8, int i10) {
        return d5.s(i) + i3 + i8 + i10;
    }

    public static a4.e j(d4.a aVar, String str, a4.e eVar, int i, Integer num) {
        aVar.b(str, eVar);
        return new a4.e(i, num);
    }

    public static Bundle k(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putString(str3, str4);
        return bundle;
    }

    public static WorkRequest.Builder l(Class cls, String str) {
        return new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) cls).addTag(str);
    }

    public static String m(int i, String str) {
        return str + i;
    }

    public static String n(String str, String str2, char c10) {
        return str + str2 + c10;
    }

    public static String o(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static String p(StringBuilder sb, String str, int i) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static HashMap r(Class cls, a3.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map s(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void t(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void u(h5.l0 l0Var, int i, ImageView imageView) {
        imageView.setImageDrawable(ContextCompat.getDrawable(l0Var.requireContext(), i));
    }

    public static void v(EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(editTextArr, 0);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(cVar);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new com.google.android.material.bottomappbar.a(editText2, 1), 100L);
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "NORMAL";
            case 2:
                return "SHELL";
            case 3:
                return "SYSTEM_SERVER";
            case 4:
                return "SYSTEM_APP";
            case 5:
                return "PLATFORM_APP";
            case 6:
                return "UNTRUSTED_APP";
            case 7:
                return "RECOVERY";
            default:
                return "null";
        }
    }
}
