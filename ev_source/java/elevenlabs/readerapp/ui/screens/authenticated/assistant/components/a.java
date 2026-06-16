package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import a2.y1;
import ho.l;
import oo.u;
import p4.a0;
import p4.b0;
import p4.n;
import p4.w;
import p4.y;
import q2.p3;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f15095c;

    public /* synthetic */ a(int i10, String str, ho.a aVar) {
        this.f15093a = i10;
        this.f15094b = str;
        this.f15095c = aVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z ChatInput$lambda$2$0$0;
        int i10 = this.f15093a;
        ho.a aVar = this.f15095c;
        String str = this.f15094b;
        switch (i10) {
            case 0:
                ChatInput$lambda$2$0$0 = ChatInputKt.ChatInput$lambda$2$0$0(str, aVar, (y1) obj);
                return ChatInput$lambda$2$0$0;
            default:
                b0 b0Var = (b0) obj;
                u[] uVarArr = y.f26563a;
                a0 a0Var = w.f26554t;
                u uVar = y.f26563a[11];
                b0Var.b(a0Var, Float.valueOf(1.0f));
                y.d(str, b0Var);
                b0Var.b(n.f26492b, new p4.a(null, new p3(0, aVar)));
                return z.f31622a;
        }
    }
}
