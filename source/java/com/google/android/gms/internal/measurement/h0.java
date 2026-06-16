package com.google.android.gms.internal.measurement;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class h0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3793a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Looper looper, int i) {
        super(looper);
        this.f3793a = i;
        switch (i) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                return;
            case 2:
            default:
                Looper.getMainLooper();
                return;
            case 3:
                super(looper);
                Looper.getMainLooper();
                return;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        boolean z10;
        switch (this.f3793a) {
            case 4:
                int i = message.what;
                if (i != 3) {
                    if (i != 8) {
                        if (i == 13) {
                            List list = (List) message.obj;
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                m4.b bVar = (m4.b) list.get(i3);
                                m4.a0 a0Var = bVar.f7825a;
                                Bitmap g = a0Var.g(bVar.f7828d);
                                if (g != null) {
                                    a0Var.b(g, 1, bVar, null);
                                } else {
                                    a0Var.c(bVar);
                                }
                            }
                            return;
                        }
                        throw new AssertionError("Unknown handler message received: " + message.what);
                    }
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        m4.f fVar = (m4.f) list2.get(i8);
                        m4.a0 a0Var2 = fVar.f7849b;
                        a0Var2.getClass();
                        m4.b bVar2 = fVar.s;
                        ArrayList arrayList = fVar.t;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (bVar2 != null || z10) {
                            Object obj = fVar.p.h;
                            Exception exc = fVar.f7852x;
                            Bitmap bitmap = fVar.u;
                            int i10 = fVar.f7851w;
                            if (bVar2 != null) {
                                a0Var2.b(bitmap, i10, bVar2, exc);
                            }
                            if (z10) {
                                int size3 = arrayList.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    a0Var2.b(bitmap, i10, (m4.b) arrayList.get(i11), exc);
                                }
                            }
                        }
                    }
                    return;
                }
                m4.b bVar3 = (m4.b) message.obj;
                bVar3.f7825a.a(bVar3.d());
                return;
            case 5:
                sendMessageDelayed(obtainMessage(), 1000L);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.f3793a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Looper looper, int i, boolean z10) {
        super(looper);
        this.f3793a = i;
    }
}
