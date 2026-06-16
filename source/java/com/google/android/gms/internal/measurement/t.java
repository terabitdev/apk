package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3960a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3961b;

    public t(int i) {
        switch (i) {
            case 3:
                this.f3960a = new TreeMap();
                this.f3961b = new TreeMap();
                return;
            default:
                this.f3960a = new HashMap();
                this.f3961b = new s(6);
                s sVar = new s(0);
                w wVar = w.BITWISE_AND;
                ArrayList arrayList = sVar.f3950a;
                arrayList.add(wVar);
                arrayList.add(w.BITWISE_LEFT_SHIFT);
                arrayList.add(w.BITWISE_NOT);
                arrayList.add(w.BITWISE_OR);
                arrayList.add(w.BITWISE_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_XOR);
                b(sVar);
                s sVar2 = new s(1);
                w wVar2 = w.EQUALS;
                ArrayList arrayList2 = sVar2.f3950a;
                arrayList2.add(wVar2);
                arrayList2.add(w.GREATER_THAN);
                arrayList2.add(w.GREATER_THAN_EQUALS);
                arrayList2.add(w.IDENTITY_EQUALS);
                arrayList2.add(w.IDENTITY_NOT_EQUALS);
                arrayList2.add(w.LESS_THAN);
                arrayList2.add(w.LESS_THAN_EQUALS);
                arrayList2.add(w.NOT_EQUALS);
                b(sVar2);
                s sVar3 = new s(2);
                w wVar3 = w.APPLY;
                ArrayList arrayList3 = sVar3.f3950a;
                arrayList3.add(wVar3);
                arrayList3.add(w.BLOCK);
                arrayList3.add(w.BREAK);
                arrayList3.add(w.CASE);
                arrayList3.add(w.DEFAULT);
                arrayList3.add(w.CONTINUE);
                arrayList3.add(w.DEFINE_FUNCTION);
                arrayList3.add(w.FN);
                arrayList3.add(w.IF);
                arrayList3.add(w.QUOTE);
                arrayList3.add(w.RETURN);
                arrayList3.add(w.SWITCH);
                arrayList3.add(w.TERNARY);
                b(sVar3);
                s sVar4 = new s(3);
                w wVar4 = w.AND;
                ArrayList arrayList4 = sVar4.f3950a;
                arrayList4.add(wVar4);
                arrayList4.add(w.NOT);
                arrayList4.add(w.OR);
                b(sVar4);
                s sVar5 = new s(4);
                w wVar5 = w.FOR_IN;
                ArrayList arrayList5 = sVar5.f3950a;
                arrayList5.add(wVar5);
                arrayList5.add(w.FOR_IN_CONST);
                arrayList5.add(w.FOR_IN_LET);
                arrayList5.add(w.FOR_LET);
                arrayList5.add(w.FOR_OF);
                arrayList5.add(w.FOR_OF_CONST);
                arrayList5.add(w.FOR_OF_LET);
                arrayList5.add(w.WHILE);
                b(sVar5);
                s sVar6 = new s(5);
                w wVar6 = w.ADD;
                ArrayList arrayList6 = sVar6.f3950a;
                arrayList6.add(wVar6);
                arrayList6.add(w.DIVIDE);
                arrayList6.add(w.MODULUS);
                arrayList6.add(w.MULTIPLY);
                arrayList6.add(w.NEGATE);
                arrayList6.add(w.POST_DECREMENT);
                arrayList6.add(w.POST_INCREMENT);
                arrayList6.add(w.PRE_DECREMENT);
                arrayList6.add(w.PRE_INCREMENT);
                arrayList6.add(w.SUBTRACT);
                b(sVar6);
                s sVar7 = new s(7);
                w wVar7 = w.ASSIGN;
                ArrayList arrayList7 = sVar7.f3950a;
                arrayList7.add(wVar7);
                arrayList7.add(w.CONST);
                arrayList7.add(w.CREATE_ARRAY);
                arrayList7.add(w.CREATE_OBJECT);
                arrayList7.add(w.EXPRESSION_LIST);
                arrayList7.add(w.GET);
                arrayList7.add(w.GET_INDEX);
                arrayList7.add(w.GET_PROPERTY);
                arrayList7.add(w.NULL);
                arrayList7.add(w.SET_PROPERTY);
                arrayList7.add(w.TYPEOF);
                arrayList7.add(w.UNDEFINED);
                arrayList7.add(w.VAR);
                b(sVar7);
                return;
        }
    }

    public Object a() {
        Uri uri;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str;
        j4 j4Var = (j4) this.f3960a;
        String str2 = (String) this.f3961b;
        Context context = (Context) j4Var.f3817b;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        q2.c cVar = y3.f4053a;
        if (contentResolver != null) {
            synchronized (cVar) {
                try {
                    HashMap hashMap = (HashMap) cVar.l;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) cVar.f9890b;
                    if (hashMap == null) {
                        atomicBoolean.set(false);
                        cVar.l = new HashMap(16, 1.0f);
                        cVar.q = new Object();
                        contentResolver.registerContentObserver(z3.f4058a, true, new b4(cVar));
                    } else if (atomicBoolean.getAndSet(false)) {
                        ((HashMap) cVar.l).clear();
                        ((HashMap) cVar.m).clear();
                        ((HashMap) cVar.f9891n).clear();
                        ((HashMap) cVar.o).clear();
                        ((HashMap) cVar.p).clear();
                        cVar.q = new Object();
                    }
                    Object obj = cVar.q;
                    String str3 = null;
                    if (((HashMap) cVar.l).containsKey(str2)) {
                        String str4 = (String) ((HashMap) cVar.l).get(str2);
                        if (str4 != null) {
                            str3 = str4;
                        }
                        return str3;
                    }
                    try {
                        uri = z3.f4058a;
                        acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                        try {
                        } finally {
                            acquireUnstableContentProviderClient.release();
                        }
                    } catch (c4 unused) {
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str2}, null);
                            try {
                                if (query != null) {
                                    if (query.moveToFirst()) {
                                        str = query.getString(1);
                                        query.close();
                                    } else {
                                        query.close();
                                        str = null;
                                    }
                                    if (str != null && str.equals(null)) {
                                        str = null;
                                    }
                                    synchronized (cVar) {
                                        try {
                                            if (obj == cVar.q) {
                                                ((HashMap) cVar.l).put(str2, str);
                                            }
                                        } finally {
                                        }
                                    }
                                    if (str == null) {
                                        return null;
                                    }
                                    return str;
                                }
                                throw new Exception("ContentProvider query returned null cursor");
                            } finally {
                            }
                        } catch (RemoteException e10) {
                            throw new Exception("ContentProvider query failed", e10);
                        }
                    } else {
                        throw new Exception("Unable to acquire ContentProviderClient");
                    }
                } finally {
                }
            }
        } else {
            cVar.getClass();
            b.d.j("ContentResolver needed with GservicesDelegateSupplier.init()");
            return null;
        }
    }

    public void b(s sVar) {
        ArrayList arrayList = sVar.f3950a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.f3960a).put(Integer.valueOf(((w) obj).f4031a).toString(), sVar);
        }
    }

    public n c(k3.t tVar, n nVar) {
        s sVar;
        f1.g.h0(tVar);
        if (nVar instanceof o) {
            o oVar = (o) nVar;
            ArrayList arrayList = oVar.f3912b;
            String str = oVar.f3911a;
            HashMap hashMap = (HashMap) this.f3960a;
            if (hashMap.containsKey(str)) {
                sVar = (s) hashMap.get(str);
            } else {
                sVar = (s) this.f3961b;
            }
            return sVar.a(str, tVar, arrayList);
        }
        return nVar;
    }

    public void d(k3.t tVar, a3.i iVar) {
        int i;
        z4 z4Var = new z4(iVar);
        TreeMap treeMap = (TreeMap) this.f3960a;
        for (Integer num : treeMap.keySet()) {
            b clone = ((b) iVar.l).clone();
            n a10 = ((m) treeMap.get(num)).a(tVar, Collections.singletonList(z4Var));
            if (a10 instanceof g) {
                i = f1.g.d0(((g) a10).f3776a.doubleValue());
            } else {
                i = -1;
            }
            if (i == 2 || i == -1) {
                iVar.l = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f3961b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            n a11 = ((m) treeMap2.get((Integer) it.next())).a(tVar, Collections.singletonList(z4Var));
            if (a11 instanceof g) {
                f1.g.d0(((g) a11).f3776a.doubleValue());
            }
        }
    }

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f3960a = obj;
        this.f3961b = obj2;
    }
}
