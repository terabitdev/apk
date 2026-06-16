package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import i4.x1;
import p3.i0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f16144c;

    public /* synthetic */ w(float f10, float f11, int i10) {
        this.f16142a = i10;
        this.f16143b = f10;
        this.f16144c = f11;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z FloatingMusicalNote$lambda$0$0;
        switch (this.f16142a) {
            case 0:
                FloatingMusicalNote$lambda$0$0 = SoundscapesButtonKt.FloatingMusicalNote$lambda$0$0(this.f16143b, this.f16144c, (i0) obj);
                return FloatingMusicalNote$lambda$0$0;
            case 1:
                x1 x1Var = (x1) obj;
                x1Var.f13260a = "offset";
                eo.m mVar = x1Var.f13262c;
                mVar.c("x", new h5.f(this.f16143b));
                mVar.c("y", new h5.f(this.f16144c));
                return sn.z.f31622a;
            default:
                x1 x1Var2 = (x1) obj;
                x1Var2.f13260a = "padding";
                eo.m mVar2 = x1Var2.f13262c;
                mVar2.c("horizontal", new h5.f(this.f16143b));
                mVar2.c("vertical", new h5.f(this.f16144c));
                return sn.z.f31622a;
        }
    }
}
