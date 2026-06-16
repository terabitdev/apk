package io.elevenlabs.ui.extensions;

import ho.l;
import m3.d;
import p3.b1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BoxShadow[] f17768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f17769c;

    public /* synthetic */ a(BoxShadow[] boxShadowArr, b1 b1Var, int i10) {
        this.f17767a = i10;
        this.f17768b = boxShadowArr;
        this.f17769c = b1Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f17767a) {
            case 0:
                return BoxShadowKt.a(this.f17768b, this.f17769c, (r3.c) obj);
            default:
                return BoxShadowKt.b(this.f17768b, this.f17769c, (d) obj);
        }
    }
}
