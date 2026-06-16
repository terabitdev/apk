package io.elevenlabs.ui.components;

import io.elevenlabs.ui.components.headers.HeaderKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17728a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17730c;

    public /* synthetic */ y2(int i10, String str) {
        this.f17730c = i10;
        this.f17729b = str;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z VerificationCodeInput$lambda$2;
        sn.z Header$lambda$0;
        switch (this.f17728a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                VerificationCodeInput$lambda$2 = VerificationCodeInputKt.VerificationCodeInput$lambda$2(this.f17730c, this.f17729b, (ho.p) obj, (u2.m) obj2, intValue);
                return VerificationCodeInput$lambda$2;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                Header$lambda$0 = HeaderKt.Header$lambda$0(this.f17729b, this.f17730c, (r1.l2) obj, (u2.m) obj2, intValue2);
                return Header$lambda$0;
        }
    }

    public /* synthetic */ y2(String str, int i10) {
        this.f17729b = str;
        this.f17730c = i10;
    }
}
