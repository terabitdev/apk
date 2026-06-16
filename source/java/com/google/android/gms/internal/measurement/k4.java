package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.text.Html;
import android.text.SpannableString;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class k4 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile w1.b f3835a;

    public static SpannableString a(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new SpannableString(Html.fromHtml(str, 0));
        }
        return new SpannableString(Html.fromHtml(str));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [a5.a, android.content.ContextWrapper] */
    public static a5.a b(Context context, Locale locale) {
        Context createConfigurationContext;
        context.getClass();
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            configuration.setLocale(locale);
            LocaleList localeList = new LocaleList(locale);
            LocaleList.setDefault(localeList);
            configuration.setLocales(localeList);
            createConfigurationContext = context.createConfigurationContext(configuration);
            createConfigurationContext.getClass();
        } else {
            configuration.setLocale(locale);
            createConfigurationContext = context.createConfigurationContext(configuration);
            createConfigurationContext.getClass();
        }
        return new ContextWrapper(createConfigurationContext);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:89)(1:24)|25|26|27|28|29|30|31|(1:33)(1:81)|34|(9:36|37|38|39|40|(2:41|(3:43|(3:58|59|60)(7:45|46|(2:48|(1:51))|52|(1:54)|55|56)|57)(1:61))|62|63|64)(1:80)|65|14) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0075, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0076, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r5 = w1.a.f11123a;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w1.b c(Context context) {
        w1.b bVar;
        Context context2;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        w1.b bVar2;
        w1.b bVar3;
        w1.b bVar4 = f3835a;
        if (bVar4 == null) {
            synchronized (k4.class) {
                try {
                    bVar = f3835a;
                    if (bVar == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        ArrayMap arrayMap = n4.f3901a;
                        if (!str.equals("eng")) {
                            if (str.equals("userdebug")) {
                            }
                            bVar = w1.a.f11123a;
                            f3835a = bVar;
                        }
                        if (!str2.contains("dev-keys")) {
                            if (str2.contains("test-keys")) {
                            }
                            bVar = w1.a.f11123a;
                            f3835a = bVar;
                        }
                        if (d4.a() && !context.isDeviceProtectedStorage()) {
                            context2 = context.createDeviceProtectedStorageContext();
                        } else {
                            context2 = context;
                        }
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        StrictMode.allowThreadDiskWrites();
                        char c10 = 0;
                        File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                        if (file.exists()) {
                            bVar2 = new w1.c(file);
                        } else {
                            bVar2 = w1.a.f11123a;
                        }
                        if (bVar2.b()) {
                            File file2 = (File) bVar2.a();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                try {
                                    SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                                    HashMap hashMap = new HashMap();
                                    while (true) {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        String[] split = readLine.split(" ", 3);
                                        if (split.length != 3) {
                                            StringBuilder sb = new StringBuilder(readLine.length() + 9);
                                            sb.append("Invalid: ");
                                            sb.append(readLine);
                                            Log.e("HermeticFileOverrides", sb.toString());
                                        } else {
                                            String str3 = new String(split[c10]);
                                            String decode = Uri.decode(new String(split[1]));
                                            String str4 = (String) hashMap.get(split[2]);
                                            if (str4 == null) {
                                                String str5 = new String(split[2]);
                                                str4 = Uri.decode(str5);
                                                if (str4.length() < 1024 || str4 == str5) {
                                                    hashMap.put(str5, str4);
                                                }
                                            }
                                            SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(str3);
                                            if (simpleArrayMap2 == null) {
                                                simpleArrayMap2 = new SimpleArrayMap();
                                                simpleArrayMap.put(str3, simpleArrayMap2);
                                            }
                                            simpleArrayMap2.put(decode, str4);
                                            c10 = 0;
                                        }
                                    }
                                    String obj = file2.toString();
                                    String packageName = context2.getPackageName();
                                    StringBuilder sb2 = new StringBuilder(obj.length() + 28 + String.valueOf(packageName).length());
                                    sb2.append("Parsed ");
                                    sb2.append(obj);
                                    sb2.append(" for Android package ");
                                    sb2.append(packageName);
                                    Log.w("HermeticFileOverrides", sb2.toString());
                                    h4 h4Var = new h4(simpleArrayMap);
                                    bufferedReader.close();
                                    bVar3 = new w1.c(h4Var);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (IOException e10) {
                                throw new RuntimeException(e10);
                            }
                        } else {
                            bVar3 = w1.a.f11123a;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        bVar = bVar3;
                        f3835a = bVar;
                    }
                } catch (Throwable th3) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th3;
                } finally {
                }
            }
            return bVar;
        }
        return bVar4;
    }
}
