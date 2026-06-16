package io.elevenlabs.readerapp;

import ho.p;
import na.c0;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f14498c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f14499d;

    public /* synthetic */ f(boolean z6, MainActivity mainActivity, c0 c0Var, int i10) {
        this.f14496a = i10;
        this.f14497b = z6;
        this.f14498c = mainActivity;
        this.f14499d = c0Var;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f14496a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return MainActivity.j(this.f14497b, this.f14498c, this.f14499d, mVar, intValue);
            default:
                return MainActivity.s(this.f14497b, this.f14498c, this.f14499d, mVar, intValue);
        }
    }
}
